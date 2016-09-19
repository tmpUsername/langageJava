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
abstract public class Animal {
    ////ATTRIBUTS
    private String nom;
    ////ACCESSORS
    public String getNom() {
        return nom;
    }
    
    ////METHODS
    abstract public void manger();
    abstract public void bouger();
}
