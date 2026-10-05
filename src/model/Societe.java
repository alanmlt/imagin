package model;

import java.util.ArrayList;
import java.util.List;

public class Societe {
    private int id;
    private String raisonSociale;
    private String adresse;
    private int copos;
    private String ville;
    private int coutJournalier;
    private List<Prestataire> prestataires = new ArrayList<>();

    public Societe(){
    }

    public Societe(int id, String raisonSociale, String adresse, int  copos, String ville){
        this.id = id;
        this.raisonSociale = raisonSociale;
        this.adresse = adresse;
        this.copos = copos;
        this.ville = ville;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCopos() {
        return copos;
    }

    public void setCopos(int copos) {
        this.copos = copos;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getCoutJournalier(){
        return coutJournalier;
    }

    public void setCoutJournalier(int coutJournalier){
        this.coutJournalier = coutJournalier;
    }

    public List<Prestataire> getPrestataires() {
        return prestataires;
    }

    public void setPrestataires(List<Prestataire> prestataires) {
        this.prestataires = prestataires;
    }

    public void addPrestataire(Prestataire prestataire) {
        if (prestataire != null) {
            this.prestataires.add(prestataire);
        }
    }

}
