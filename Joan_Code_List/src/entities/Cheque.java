package entities;

import java.util.ArrayList;

public class Cheque extends Compte {
  private double frais;
  private ArrayList<Carte> cheque; 

public ArrayList<Carte> getCheque() {
    return cheque;
  }

  public void setCheque(ArrayList<Carte> cheque) {
    this.cheque = cheque;
  }

public double getFrais() {
    return frais;
}

public void setFrais(double frais) {
    this.frais = frais;
}  

}
