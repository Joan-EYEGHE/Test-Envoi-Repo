package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Agence;

public class AgenceRepository {
    
 
    //  Créer une liste pour Stocker les données (Sert de BD)
    private List<Agence> tAgences=new ArrayList<>();

    public List<Agence> selectAllAgence(){
        return tAgences;
    }
    

    // Algorithme de recherche, parceque nous sommes dans une liste
        public Agence selectbyNumero(String numero) {
            for (Agence ag : tAgences) {
                if (ag.getNumero().compareTo(numero)==0) {
                    return ag;
                }
            }
            return null;
        }
    // Dans une base de données 
        // Select * from agence where numero= numero;
    

    public void insert(Agence agence){
        tAgences.add(agence);
    }


}
