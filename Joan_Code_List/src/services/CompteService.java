package services;

import java.util.List;

import entities.Compte;
import repositories.CompteRepository;

public class CompteService {
    // Objet de type Repository
    CompteRepository compteRepo=new CompteRepository();

    // Ajouter un compte 
    public void AjouterCompte(Compte cpte){
        compteRepo.insert(cpte);
    }

    // Lister les comptes 
    public List<Compte> ListerComptes(){
        return compteRepo.selectAll();
    }

}
