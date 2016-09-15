/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.IOException;
import test1.util.ConsoleUtil;
import test1.util.MathUtil;

/**
 *
 * @author admin
 */
public class jeuDeMemory {

    public static boolean appartient(char c, char[] tab, int i) {
        for (int j = 0; j <= i; j++) {
            if (c == tab[j]) {
                return true;
            }
        }
        return false;
    }

    public static void randomize(char[][] tab) {
        int maxX = tab.length - 1;
        int maxY = tab.length - 1;
        for (int i = 0; i < tab.length * 20; i++) {
            int tmpXA = MathUtil.genererNombreAleatoire(0, maxX);
            int tmpYA = MathUtil.genererNombreAleatoire(0, maxY);
            int tmpXB = MathUtil.genererNombreAleatoire(0, maxX);
            int tmpYB = MathUtil.genererNombreAleatoire(0, maxY);
            char tmpChar = tab[tmpXA][tmpYA];
            tab[tmpXA][tmpYA] = tab[tmpXB][tmpYB];
            tab[tmpXB][tmpYB] = tmpChar;
        }
    }

    public static char[][] generePlateau(int x, int y) {
        //genere le vecteur des paires
        char[] valeurs = new char[x * y / 2];

        for (int i = 0; i < valeurs.length; i++) {
            char c = (char) MathUtil.genererNombreAleatoire(97, 122);
            while (appartient(c, valeurs, i - 1)) {
                c = (char) MathUtil.genererNombreAleatoire(97, 122);
            }
            valeurs[i] = c;
        }

        //remplir tableau
        char[][] tab = new char[x][y];
        int iterateur = 0;
        char c = (char) MathUtil.genererNombreAleatoire(97, 122);
        //genere le tableau de paire
        for (char[] ligne : tab) {
            for (int col = 0; col < ligne.length; col++) {
                ligne[col] = valeurs[iterateur / 2];
                iterateur++;
            }
        }

        //randomize le tableau
        randomize(tab);
        return tab;
    }

    public static char[][] generePlateau(int x, int y, char c) {
        char[][] tab = new char[x][y];

        for (char[] ligne : tab) {
            for (int cel = 0; cel < ligne.length; cel++) {
                ligne[cel] = c;
            }
        }

        return tab;
    }

    public static void afficher(char[][] tab) {
        System.out.print("  ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
        for (int cs = 0; cs < tab.length; cs++) {
            System.out.print((cs + 1) + " ");
            for (char c : tab[cs]) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static int choixJoueur(String message) throws IOException {
        return Integer.valueOf(ConsoleUtil.lireTexte("veuillez indiquer la " + 
                message + " de la carte à retourner")) - 1;
    }

    public static int choixJoueurX() throws IOException {
        return choixJoueur("ligne");
    }

    public static int choixJoueurY() throws IOException {
        return choixJoueur("colonne");
    }

    public static boolean choixValide(int x, int y, char[][] tab) {
        return x < tab.length && x >= 0 && y < tab[0].length && y >= 0 
                && tab[x][y] == '*';
    }

    private static boolean termine(char[][] plateauAffiche, int x, int y, 
            int x2, int y2) {
        System.out.println("FIN DU TOUR\n");
        if (plateauAffiche[x][y] != plateauAffiche[x2][y2]) {
            plateauAffiche[x][y] = '*';
            plateauAffiche[x2][y2] = '*';
        }
        for (char[] ligne : plateauAffiche) {
            for (char cell : ligne) {
                if (cell == '*') {
                    return false;
                }
            }
        }
        System.out.println("Felicitation !");
        return true;
    }
    
    public static void main(String[] args) throws IOException {
        char[][] plateau = generePlateau(4, 4);
        char[][] plateauAffiche = generePlateau(4, 4, '*');

        int x, y, x2, y2;
        do {
            afficher(plateauAffiche);

            //carte1
            do {
                System.out.println("Choisissez votre première carte.");
                x = choixJoueurX();
                y = choixJoueurY();
            } while (!choixValide(x, y, plateauAffiche));

            plateauAffiche[x][y] = plateau[x][y];
            afficher(plateauAffiche);

            //carte 2
            do {
                System.out.println("Choisissez votre deuxième carte.");
                x2 = choixJoueurX();
                y2 = choixJoueurY();
            } while (!choixValide(x2, y2, plateauAffiche));
            plateauAffiche[x2][y2] = plateau[x2][y2];
            afficher(plateauAffiche);
        } while (!termine(plateauAffiche, x, y, x2, y2));
    }

}
