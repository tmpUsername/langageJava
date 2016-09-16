/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author admin
 */
public class CollecTest {
    
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> liste = new ArrayList<>();
        
        //ajout à l'ensemble
        for (int i = 1; i < 4; i++) {
            set.add(i);
        }
        
        //ajout à la liste
        for (int i = 1; i < 7; i++) {
            liste.add(i);
        }
        for (int i = 3; i < 5; i++){
            liste.add(i);
        }
        
        //ajout de l'ensemble à la liste
        liste.addAll(set);
        System.out.println(liste);
        
        //ajout de la liste à l'ensemble
        set.addAll(liste);
        System.out.println(set);
        
    }
}
