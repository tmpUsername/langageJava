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
public class Tortue extends Reptile{

    public Tortue(String nom) {
        super(nom);
    }

    @Override
    public void manger() {
        System.out.println(this.getNom() + " mâche");
    }

    @Override
    public void bouger() {
        System.out.println(this.getNom() + " marche quand il est sur terre");
    }


    
}
