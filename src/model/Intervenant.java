package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Intervenant {
    private int id;
    private String prenom;
    private String nom;
    private Categorie categorie;
    private List<Affectation> affectations = new ArrayList<>();

    public Intervenant(int id, String prenom, String nom){
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public List<Affectation> getAffectations() {
        return affectations;
    }

    public void setAffectations(List<Affectation> affectations) {
        this.affectations = affectations;
    }

    public abstract double calculCoutProjet(int nbJours);
}
