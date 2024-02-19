package entities;

import java.util.ArrayList;

public class Agence {
    private int id;
    private String numero;
    private String adresse;
    private String telephone;

    // One to many
    private ArrayList<Compte> Comptes=new ArrayList<>();

    public ArrayList<Compte> getComptes() {
        return Comptes;
    }
    public void setComptes(ArrayList<Compte> comptes) {
        Comptes = comptes;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

}
