package entities;

public class Compte {
    protected int id;
    protected String numero;
    protected double solde;

    // Type de compte 
    private EtypeCompte type;
     
    // Many to One
     protected Agence agence;
     protected Client client;
    
     public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public EtypeCompte getType() {
        return type;
    }

    public void setType(EtypeCompte type) {
        this.type = type;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    
}
