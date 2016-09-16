/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.HashSet;

/**
 *
 * @author admin
 */
public class SetTest {
    
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        
        set.add("Thomas");
        set.add("Digna");
        set.add("Thomas");
        
        System.out.println(set);
    }
}
