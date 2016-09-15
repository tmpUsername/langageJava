/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.IOException;
import static java.lang.String.format;
import test1.util.ConsoleUtil;
import test1.util.MathUtil;

/**
 *
 * @author admin
 */
public class JeuMorpion {

    /**
     * Renvoie un tableau en fonction de la largeur et la hauteur envoyé en
     * paramètre
     *
     * @param largeur la largeur du tableau
     * @param hauteur la longueur du tableau
     * @return le tableau à deux dimensions de la bonne taille
     */
    public static int[][] nouveauPlateauInt(int largeur, int hauteur) {
        return new int[largeur][hauteur];
    }

    /**
     * Renvoie un tableau en fonction de la largeur et la hauteur envoyé en
     * paramètre
     *
     * @param largeur la largeur du tableau
     * @param hauteur la longueur du tableau
     * @return le tableau à deux dimensions de la bonne taille
     */
    public static char[][] nouveauPlateauChar(int largeur, int hauteur) {
        return new char[largeur][hauteur];
    }

    /**
     * Initialise le tableau à deux dimension envoyé en paramètre à 1
     *
     * @param tab le taleau de dimension 2
     */
    public static void init(int[][] tab) {
        for (int[] vecteur : tab) {
            for (int j = 0; j < tab.length; j++) {
                vecteur[j] = 1;
            }
        }
    }

    /**
     * Initialise le tableau à deux dimension envoyé en paramètre à ' '
     *
     * @param tab le taleau de dimension 2
     */
    public static void init(char[][] tab) {
        for (char[] vecteur : tab) {
            for (int j = 0; j < tab.length; j++) {
                vecteur[j] = '*';
            }
        }
    }

    /**
     * Initialise le tableau avec des valeurs aléatoire entre les deux
     * paramètres passé
     *
     * @param tab le tableau à initialiser
     * @param min la valeur minimale
     * @param max la valeur maximale
     */
    public static void initRandom(int[][] tab, int min, int max) {
        for (int[] vecteur : tab) {
            for (int j = 0; j < tab.length; j++) {
                vecteur[j] = MathUtil.genererNombreAleatoire(min, max);
            }
        }
    }

    /**
     * Affiche le tableau à deux dimensions envoyé en paramètre sur la sortie
     * standard
     *
     * @param tab un tableau à deux dimensions
     */
    public static void afficher(int[][] tab) {
        for (int[] vecteur : tab) {
            for (int element : vecteur) {
                System.out.print(element);
            }
            System.out.println();
        }
    }

    /**
     * Affiche le tableau à deux dimensions envoyé en paramètre sur la sortie
     * standard
     *
     * @param tab un tableau à deux dimensions
     */
    public static void afficher(char[][] tab) {
        System.out.println(" 123");
        for (int ligne = 0; ligne < tab.length; ligne++) {
            System.out.print(ligne + 1);
            for (char element : tab[ligne]) {
                System.out.print(element);
            }
            System.out.println();
        }
    }

    public static boolean nombreValide(int n) {
        return n < 4 && n > 0;
    }

    public static int choixXJoueur(int numeroJoueur) throws IOException {
        int res = Integer.valueOf(ConsoleUtil.lireTexte(String.format("Joueur %d, indiquez la ligne de votre coup", numeroJoueur)));
        while (!nombreValide(res)) {
            System.out.println("Erreur: Veuillez sair un nombre entre 1 et 3");
            res = Integer.valueOf(ConsoleUtil.lireTexte(String.format("Joueur %d, indiquez la ligne de votre coup", numeroJoueur)));
        }
        return res - 1;
    }

    public static int choixYJoueur(int numeroJoueur) throws IOException {
        int res = Integer.valueOf(ConsoleUtil.lireTexte(String.format("Joueur %d, indiquez la colonne de votre coup", numeroJoueur)));
        while (!nombreValide(res)) {
            System.out.println("Erreur: Veuillez sair un nombre entre 1 et 3");
            res = Integer.valueOf(ConsoleUtil.lireTexte(String.format("Joueur %d, indiquez la colonne de votre coup", numeroJoueur)));
        }
        return res - 1;
    }

    public static void gg(int joueur) {
        System.out.format("Le joueur %d a gagné ! GG!\n", joueur);
    }

    public static boolean estTermine(char[][] tab, int joueur, int x, int y) {
        //test horizontal vertical
        int tmp = tab[x][0];
        if (tmp == tab[x][1] && tmp == tab[x][2]) {
            gg(joueur);
            return true;
        }
        tmp = tab[0][y];
        if (tmp == tab[1][y] && tmp == tab[2][y]) {
            gg(joueur);
            return true;
        }

        //test diagonal
        if (tab[0][0] != '*' && tab[1][1] == tab[0][0] && tab[2][2] == tab[0][0]) {
            gg(joueur);
            return true;
        } else if (tab[0][2] != '*' && tab[1][1] == tab[0][2] && tab[2][0] == tab[0][2]) {
            gg(joueur);
            return true;
        }

        for (char[] cs : tab) {
            for (char c : cs) {
                if (c == '*') {
                    return false;
                } else {
                }
            }
        }
        System.out.println("Match nul!");
        return true;
    }

    public static boolean choixValide(char[][] tab, int x, int y) {
        if (tab[x][y] != '*') {
            System.out.println("Case déjà occupée");
            return false;
        }
        return true;
    }

    public static void maj(char[][] tab, int x, int y, int joueur) {
        if (joueur == 1) {
            tab[x][y] = 'X';
        } else {
            tab[x][y] = 'O';
        }
    }

    public static int joueurSuivant(int joueur) {
        return (joueur % 2) + 1;
    }

    public static void main(String[] args) throws IOException {
        //creation du plateau
        char[][] plateau = nouveauPlateauChar(3, 3);
        init(plateau);
        afficher(plateau);

        //début du jeu
        int joueur = 2;
        int x, y;
        do {
            joueur = joueurSuivant(joueur);
            //Le joueur choisi sa case
            do {
                x = choixXJoueur(joueur);
                y = choixYJoueur(joueur);
            } while (!choixValide(plateau, x, y));
            //maj plateau
            maj(plateau, x, y, joueur);
            afficher(plateau);
            //changer de joueur
        } while (!estTermine(plateau, joueur, x, y));
    }
}
