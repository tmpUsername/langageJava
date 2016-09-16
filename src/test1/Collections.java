package test1;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Collections {
    public static void main(String[] args) {
        ArrayList<Integer> liste1 = new ArrayList<>();
        for (int i = 10; i <= 100; i = i + 10) {
            liste1.add(i);
        }
        System.out.println(liste1);
        
        ArrayList<Integer> liste2 = new ArrayList<>();
        for (int i = 2; i < 101; i = i + 2) {
            liste2.add(i);
        }
        System.out.println(liste2);
        
        ArrayList<Integer> liste3 = new ArrayList<>();
        for (int i = 3; i < 100; i = i + 3) {
            liste3.add(i);
        }
        System.out.println(liste3);
        
        ArrayList<Integer> liste4 = new ArrayList<>();
        liste4.addAll(0, liste2);
        liste4.removeAll(liste3);
        liste4.removeAll(liste1);
        
        System.out.println(liste4);
        
        
    }
}
