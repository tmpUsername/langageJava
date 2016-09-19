/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.classes.animaux;

/**
 *
 * @author admin
 */
abstract public class Reptile extends Animal{
    
    public Reptile(String nom) {
        super(nom);
    }

    @Override
    public void sleep() {
        System.out.println(this.getNom() + " dors allongé");
    }
    
}
