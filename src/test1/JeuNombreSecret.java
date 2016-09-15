/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.IOException;
import static test1.util.ConsoleUtil.lireTexte;
import static test1.util.MathUtil.genererNombreAleatoire;
import static test1.util.MathUtil.calculerNombreAleatoire;

/**
 *
 * @author admin
 */
public class JeuNombreSecret {

    public static void main(String[] args) throws IOException {
        
        //On demande à l'utilisateur un min et un max
        int min = Integer.valueOf(lireTexte("Entrez une valeure minimale"));
        int max = Integer.valueOf(lireTexte("Entrez une valeur maximale"));
        //calculer le nombre secret
        int nombreSecret = genererNombreAleatoire(min, max);
//        System.out.println(nombreSecret);
        int reponse;
        int nbEssai = 0;
        do {
            reponse = Integer.valueOf(lireTexte("Essayez de deviner le nombre secret!"));
            if (reponse > nombreSecret) {
                System.out.print("Trop haut! ");
            } else if (reponse < nombreSecret) {
                System.out.print("Trop bas!  ");
            }
            nbEssai++;
        } while (reponse != nombreSecret);

        if (nbEssai < 3) {
            System.out.print("GENIAL ! ");
        } else if (nbEssai < 6) {
            System.out.print("SUPER ! ");
        } else if (nbEssai < 9) {
            System.out.print("COOL ! ");
        } else if (nbEssai < 12) {
            System.out.print("PAS MAL ! ");
        } else {
            System.out.print("NUL ! ");
        }
        System.out.println("Vous avez gagné en " + nbEssai + " essais!");
    }
}
