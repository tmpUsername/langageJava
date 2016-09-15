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
public class Variables {

    public static void main(String[] args) {
        //types primitifs entiers
        byte byte1 = 99;
        short short1 = 9999;
        int entier1, entier2;
        long long1 = 999999999;

        //type primitifs décimaux
        float float1 = (float) 1234.56;
        double double1 = 1234.56;

        //type booleens
        boolean booleen = true; //ou false

        //Texte
        String string1 = "coucou";

//        entier1 = 123;
//        entier2 = 456;
//
//        System.out.println(entier1 + entier2);


        Integer f = 123;
        String sf = f.toString();
        long l = Long.valueOf(sf);
        l += 100;
        String s2 = Long.toString(l);
        System.out.println(s2);

        
                
    }

}
