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
        Gateau premier = new Gateau();
        Gateau deuxieme = new Gateau();
        Gateau troisieme = new Gateau();
        
        premier.setGout("Chocolat");
        premier.setCouleur("Blanc");
        deuxieme.setGout("Chocolat");
        deuxieme.setCouleur("Noir");
        troisieme.setGout("Citron");
        troisieme.setCouleur("Jaune");
        
        System.out.println(premier + "\n" + deuxieme + "\n" + troisieme);
    }
    
}
