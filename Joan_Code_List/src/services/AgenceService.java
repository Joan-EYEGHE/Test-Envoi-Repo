package services;

import java.util.List;

import entities.Agence;
import repositories.AgenceRepository;


public class AgenceService {

    /*  Créer une méthode 
     public type_de_retour nomMethode(Type_de_données NomDonnées){
    return;
    }*/
    private AgenceRepository agenceRepository=new AgenceRepository();
    
    // Créer les fonctions des Agences
    
    // Lister les agences
    public List<Agence> ListerAgence(){
        return agenceRepository.selectAllAgence();
    }

    // Lister les agences par numero
    public Agence ListerAgence(String numero){
        return agenceRepository.selectbyNumero(numero);
    }

    // Ajouter une agence
    public void ajouterAgence(Agence agence){
        agenceRepository.insert(agence);
    }

}
