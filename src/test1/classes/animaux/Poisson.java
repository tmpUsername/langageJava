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
public class Poisson extends Animal{
    ////CONSTRUCTOR
    public Poisson(String nom) {
        super(nom);
    }
    
    ////METHODS
    @Override
    public void manger() {
        System.out.println(this.getNom() + " gobe.");
    }

    @Override
    public void bouger() {
        System.out.println(this.getNom() + " nage.");
    }
    
}
