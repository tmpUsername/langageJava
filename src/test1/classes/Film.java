/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.classes;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Film {
    
    ////ATTRIBUTS////
    private String titre;
    private Integer duree;
    private String synopsis;
    private Integer annee;
    private Genre genre;
    private ArrayList<Acteur> acteurs = new ArrayList<>();
    
    ////CONSTRUCTOR////
    public Film(String titre, Integer duree, String synopsis, Integer annee, Genre genre) {
        this.titre = titre;
        this.duree = duree;
        this.synopsis = synopsis;
        this.annee = annee;
        this.genre = genre;
    }
    public Film(String titre, Integer duree, String synopsis, Integer annee, Genre genre, ArrayList<Acteur> acteurs) {
        this.titre = titre;
        this.duree = duree;
        this.synopsis = synopsis;
        this.annee = annee;
        this.genre = genre;
        this.acteurs = acteurs;
    }
    
    ////ACCESSOR////
    public void setTitre(String titre) {
        this.titre = titre;
    }
    
    public String getTitre(){
        return this.titre;
    }
    
    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }
    
    ////METHODS////

    @Override
    public String toString() {
        return "Film {" + "titre:" + titre  + ", synopsis:" + 
                synopsis + "}";
    }
    
}
