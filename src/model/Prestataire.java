package model;

import java.util.List;

public class Prestataire extends Intervenant {
    private boolean forfait;
    private int coutJournalier;
    private Societe societe;
    private String raisonSociale;

    public Prestataire(int id, String prenom, String nom, boolean forfait, int coutJournalier, String raisonSociale) {
        super(id, nom, prenom);
        this.forfait = forfait;
        this.coutJournalier = coutJournalier;
        this.raisonSociale = raisonSociale;
    }

    public boolean getForfait() {
        return forfait;
    }

    public void setForfait(boolean forfait) {
        this.forfait = forfait;
    }

    public int getCoutJournalier() {
        return coutJournalier;
    }

    public void setCoutJournalier(int coutJournalier) {
        this.coutJournalier = coutJournalier;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public double calculCoutProjet(int nbJours) {
        if (forfait == true) {
            double coutFinal = nbJours * getSociete().getCoutJournalier();
            return coutFinal;
        } else {
            double coutFinal = nbJours * coutJournalier;
            return coutFinal;
        }
    }
}
