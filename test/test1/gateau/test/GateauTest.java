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
        Gateau premier = new Gateau("chocolat", "blanc");
        Gateau deuxieme = new Gateau("chocolat", "noir");
        Gateau troisieme = new Gateau("chocolat", "jaune");
        
        System.out.println(premier + "\n" + deuxieme + "\n" + troisieme);
    }
    
}
