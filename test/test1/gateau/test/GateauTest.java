/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.gateau.test;

import org.junit.Test;
import test1.gateau.Gateau;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class GateauTest {
    
    @Test
    public void test(){
        System.out.println(Gateau.getNbGateau());
        Gateau premier = new Gateau("chocolat", "blanc");
        System.out.println(Gateau.getNbGateau());
        Gateau deuxieme = new Gateau();
        System.out.println(Gateau.getNbGateau());
        Gateau troisieme = new Gateau("chocolat", "jaune");
        System.out.println(Gateau.getNbGateau());
        System.out.println(premier + "\n" + deuxieme + "\n" + troisieme);
        System.out.println(Gateau.getNbGateau());
    }
    
}
