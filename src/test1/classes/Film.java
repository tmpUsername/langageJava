/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.classes;

import java.util.Collection;
import java.util.HashSet;

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
    private HashSet<Acteur> acteurs = new HashSet<>();
    
    ////CONSTRUCTOR////
    public Film(String titre, Integer duree, String synopsis, Integer annee, Genre genre) {
        this.titre = titre;
        this.duree = duree;
        this.synopsis = synopsis;
        this.annee = annee;
        this.genre = genre;
    }
    public Film(String titre, Integer duree, String synopsis, Integer annee, Genre genre, Collection<Acteur> acteurs) {
        this.titre = titre;
        this.duree = duree;
        this.synopsis = synopsis;
        this.annee = annee;
        this.genre = genre;
        this.acteurs.addAll(acteurs);
    }

    public Film() {
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

    public HashSet<Acteur> getActeurs() {
        return acteurs;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    
    
    ////METHODS////
    public void ajouteActeur(Acteur acteur){
        this.acteurs.add(acteur);
    }
    
    public void ajouteActeurs(Collection<Acteur> acteurs){
        this.acteurs.addAll(acteurs);
    }
    
    @Override
    public String toString() {
        return "Film {" + "titre:" + titre  + ", synopsis:" + 
                synopsis + "}";
    }
}