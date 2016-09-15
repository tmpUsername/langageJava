/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.util;

/**
 *
 * @author admin
 */
public class MathUtil {

    public static int carre(int n) {
        return n * n;
    }

    public static int calculerNombreAleatoire() {
        return (int) (Math.random() * 100 + 1);
    }
    /**
     * calcule un nombre aléatoire entre min et max
     * @param min la valeur la plus basse
     * @param max la valeur sup
     * @throws RuntimeException
     * 
     * @return 
     */
    public static int genererNombreAleatoire(int min, int max) {
        //Renvoie un erreur si min > max
        if (min > max) {
            throw new RuntimeException("Min > à Max");
        }
        int res = (int) (Math.random() * (max - min + 1) + min);
//        if ( res > max || res < min) {
//            throw new RuntimeException("res vaut" + res + "alors que min vaut : " + min + " et max vaut : " + max);
//        }
        return res;
    }

    public static int exposant(int nombre, int puissance) {
        if (puissance <= 0) {
            return 1;
        }
        int resultat = nombre;
        for (int i = 1; i < puissance; i++) {
            resultat = resultat * nombre;
        }
        return resultat;
    }

    public static int factorielle(int n) {
        if ( n < 0) 
            throw new RuntimeException("Erreur mathématique");
        if (n < 2) 
            return 1;
        int resultat = 1;
        while (n > 1) 
            resultat = resultat * n--;
        return resultat;
    }

    public static int rFactorielle(int n) {
        if ( n < 0) 
            throw new RuntimeException("Erreur mathématique");
        if (n < 2) 
            return 1;
        return n * rFactorielle(n - 1);
    }

    public static void main(String[] args) {
//        System.out.println(exposant(2, 10));
//        System.out.println(exposant(3, 3));
//        System.out.println(factorielle(2));
//        System.out.println(factorielle(3));
//        System.out.println(factorielle(4));
//        System.out.println(rFactorielle(2));
//        System.out.println(rFactorielle(3));
//        System.out.println(rFactorielle(4));
        int test;        
        System.out.println(genererNombreAleatoire(1, 100));
        System.out.println(genererNombreAleatoire(50, 60));
        //test 50 60
        do {
            test = genererNombreAleatoire(50, 60);
            System.out.println(test);
        } while (test != 50);
        System.out.println("50 ok");
        do {
            test = genererNombreAleatoire(50, 60);
            System.out.println(test);
        } while (test != 60);
        System.out.println("60 ok");
        //test 1 10
        do {
            test = genererNombreAleatoire(0, 10);
            System.out.println(test);
        }while (test != 0);
        System.out.println("0 ok");
        do {
            test = genererNombreAleatoire(0, 10);
            System.out.println(test);
        }while (test != 10);
        System.out.println("10 ok");
        
    }
}
