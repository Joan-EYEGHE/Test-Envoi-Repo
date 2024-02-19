package entities;

import java.time.LocalDate;

public class Carte {
    private int id;
    private String numero;
    private LocalDate dateExpiration;
    private String code;

    // Many to one (0..*)
    private Cheque cheque;


    public Cheque getCheque() {
        return cheque;
    }
    public void setCheque(Cheque cheque) {
        this.cheque = cheque;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    // Many to one 
    private Compte compte;
    
    public Compte getCompte() {
        return compte;
    }
    public void setCompte(Compte compte) {
        this.compte = compte;
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
    public LocalDate getDateExpiration() {
        return dateExpiration;
    }
    public void setDateExpiration(LocalDate dateExpiration) {
        this.dateExpiration = dateExpiration;
    }
}

