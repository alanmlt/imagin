package model;

import java.time.LocalDate;

public class Salarie extends Intervenant {
    private LocalDate dtEmbauche;
    private String echelon;

    public Salarie(int id, String prenom, String nom, LocalDate dtEmbauche, String echelon){
        super(id, prenom, nom);
        this.dtEmbauche = dtEmbauche;
        this.echelon = echelon;
    }

    public LocalDate getDtEmbauche() {
        return dtEmbauche;
    }

    public void setDtEmbauche(LocalDate dtEmbauche) {
        this.dtEmbauche = dtEmbauche;
    }

    public String getEchelon() {
        return echelon;
    }

    public void setEchelon(String echelon) {
        this.echelon = echelon;
    }

    public double calculCoutProjet(int nbJours){
        double coutFinal = nbJours * 550;
        return coutFinal;
    }
}
