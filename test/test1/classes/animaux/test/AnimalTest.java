/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.classes.animaux.test;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import test1.classes.animaux.Animal;
import test1.classes.animaux.Poisson;
import test1.classes.animaux.Serpent;
import test1.classes.animaux.Tortue;

/**
 *
 * @author admin
 */
public class AnimalTest {
    
    @Test
    public void testouillage(){
        Animal p = new Poisson("Michel");
        
        p.bouger();
        p.manger();
        
        System.out.println("FIn premier test");
        
        ArrayList<Animal> listeDAnimaux = new ArrayList<>();
        
        listeDAnimaux.add(new Poisson("Maurice"));
        listeDAnimaux.add(new Serpent("Kaa"));
        listeDAnimaux.add(new Tortue("Franklin"));
        
        listeDAnimaux.forEach(animal -> {
            animal.bouger();
            animal.manger();
        });
    }
    
}
