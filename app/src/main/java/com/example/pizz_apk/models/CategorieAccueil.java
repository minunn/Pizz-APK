package com.example.pizz_apk.models;

public class CategorieAccueil {
    private String nom;
    private int image;

    public CategorieAccueil(String nom, int image) {
        this.nom = nom;
        this.image = image;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

