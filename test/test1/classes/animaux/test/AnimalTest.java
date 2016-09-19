/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.classes.animaux.test;

import org.junit.Test;
import static org.junit.Assert.*;
import test1.classes.animaux.Animal;
import test1.classes.animaux.Poisson;

/**
 *
 * @author admin
 */
public class AnimalTest {
    
    @Test
    public void testouillage(){
        Animal p = new Poisson();
        
        p.bouger();
        p.manger();
    }
    
}
