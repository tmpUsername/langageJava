/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author admin
 */
public class ForeachEtTableaux {

    public static void main(String[] args) {

        int[] tab = new int[10];
        
        
        for (int i = 0; i < tab.length; i++) {
            tab[i] = i * i;
        }

        for (int i : tab) {
            System.out.println(i);
        }
    }
}
