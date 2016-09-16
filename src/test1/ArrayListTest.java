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
public class ArrayListTest {
    
    public static void main(String[] args) {
        
        ArrayList<String> liste1 = new ArrayList<>();
        ArrayList<String> liste2 = new ArrayList<>();
        
        liste1.add("Myrtha");
        liste1.add("Michel");
        liste1.add("Jean");
        liste1.add("Phil");
        
        liste2.add("Myrtha");
        liste2.add("Louis");
        
        liste2.addAll(liste1);
        
        System.out.println(liste2);
        
    }
    
}
