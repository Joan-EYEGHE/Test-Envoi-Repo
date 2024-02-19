package entities;

import java.util.ArrayList;

public class Client {
    private int id;
    private String nomComplet;
    private String telephone;
    private String email;
    // One to Many
    private ArrayList<Compte> CompteList;


    // Getters and Setters
    public ArrayList<Compte> getCompteList() {
        return CompteList;
    }
    public void setCompteList(ArrayList<Compte> compteList) {
        CompteList = compteList;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomComplet() {
        return nomComplet;
    }
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
