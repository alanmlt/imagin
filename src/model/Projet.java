package model;

import java.util.ArrayList;
import java.util.List;

public class Projet {
    private int id;
    private String nom;
    private int nbJours;
    private double budgetPrevu;
    private Intervenant responsable;
    private List<Affectation> affectations = new ArrayList<>();

    public Projet(int id, String nom, int nbJours, int budgetPrevu){
        this.id = id;
        this.nom = nom;
        this.nbJours = nbJours;
        this.budgetPrevu = budgetPrevu;
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

    public int getNbJours() {
        return nbJours;
    }

    public void setNbJours(int nbJours) {
        this.nbJours = nbJours;
    }

    public double getBudgetPrevu() {
        return budgetPrevu;
    }

    public void setBudgetPrevu(double budgetPrevu) {
        this.budgetPrevu = budgetPrevu;
    }

    public Intervenant getResponsable() {
        return responsable;
    }

    public void setResponsable(Intervenant responsable) {
        this.responsable = responsable;
    }

    public List<Affectation> getAffectations() {
        return affectations;
    }

    public void setAffectations(List<Affectation> affectations) {
        this.affectations = affectations;
    }
}
