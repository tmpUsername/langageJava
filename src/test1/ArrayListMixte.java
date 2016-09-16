/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class ArrayListMixte {
    
    public static void main(String[] args) {
        //Declaration
        ArrayList liste = new ArrayList();
        ArrayList<Integer> filtre = new ArrayList<>();
        
        //affectation des valeurs à la liste
        liste.add('A');
        liste.add('B');
        liste.add(1);
        liste.add(true);
        liste.add("Coucou");
        liste.add(4);
        liste.add(5);
        liste.add(6);
        
        //affectation des valeurs à filtrer
        filtre.add(4);
        filtre.add(5);
        filtre.add(6);
        
        //Filtrage de la liste avec le filtre
        liste.removeAll(filtre);
        
        //impression
        System.out.println(liste);
    }
    
}
