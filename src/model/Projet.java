package model;

import java.util.ArrayList;
import java.util.List;

public class Projet {
    private int id;
    private String nom;
    private int nbJours;
    private int budgetPrevu;
    private Intervenant responsable;
    private List<Affectation> affectations = new ArrayList<>();

    public Projet(int id, String nom, int nbJours, int budgetPrevu){
        this.id = id;
        this.nom = nom;
        this.nbJours = nbJours;
        this.budgetPrevu = budgetPrevu;
    }

    public List<Affectation> getAffectations() {
        return affectations;
    }
}
