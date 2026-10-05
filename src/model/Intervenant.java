package model;

import java.util.ArrayList;
import java.util.List;

public class Intervenant {
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

    public List<Affectation> getAffectations() {
        return affectations;
    }
}
