package model;

import java.util.ArrayList;
import java.util.List;

public class Categorie {
    private int id;
    private String nom;
    private List<Intervenant> intervenants = new ArrayList<>();

    public Categorie(int id, String nom){
        this.id = id;
        this.nom = nom;
    }

    public void addIntervenant(Intervenant intervenant) {
        if (intervenant != null) {
            this.intervenants.add(intervenant);
        }
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Intervenant> getIntervenants() {
        return this.intervenants;
    }

    public void setIntervenants(List<Intervenant> intervenants) {
        this.intervenants = intervenants;
    }

}
