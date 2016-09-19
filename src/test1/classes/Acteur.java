/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.classes;

/**
 *
 * @author admin
 */
public class Acteur {
    ////ATTRIBUTS
    private String nom;
    private String prenom;
    
    ////CONSTRUCTOR
    public Acteur(String nom, String prenom) {    
        this.nom = nom;
        this.prenom = prenom;
    }

    ////ACCESSORS
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    ////METHODS
}
