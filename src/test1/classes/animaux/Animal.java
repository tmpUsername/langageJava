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
abstract public class Animal implements Sleepable{
    ////ATTRIBUTS
    private String nom;
    
    ////CONSTRUCTOR
    public Animal(String nom) {    
        this.nom = nom;
    }

    ////ACCESSORS
    public String getNom() {
        return nom;
    }
    
    ////METHODS
    abstract public void manger();
    abstract public void bouger();
}
