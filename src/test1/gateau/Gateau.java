/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.gateau;

/**
 *
 * @author admin
 */
public class Gateau {
    
    ////ATTRIBUTS
    private static String forme = "rond";
    private String gout;
    private String couleur;
    private static int nbGateau = 0;
    
    ////CONSTRUCTOR
    public Gateau(String gout, String couleur) {
        this.gout = gout;
        this.couleur = couleur;
        Gateau.nbGateau++;
    }

    public Gateau() {
        this.gout = "chocolat";
        this.couleur = "noir";
        Gateau.nbGateau++;
    }
    
    ////ACCESSORS
    public String getForme() {
        return forme;
    }

    public void setForme(String forme) {
        this.forme = forme;
    }

    public String getGout() {
        return gout;
    }

    public void setGout(String gout) {
        this.gout = gout;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public static int getNbGateau() {
        return nbGateau;
    }
    
    ////METHODS

    @Override
    public String toString() {
        return "Gateau " + Gateau.forme + " au " + this.gout + " de couleur " + this.couleur;
    }
    
}
