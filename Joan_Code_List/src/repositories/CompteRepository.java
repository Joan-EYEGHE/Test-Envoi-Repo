package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Compte;

public class CompteRepository {
    // Créer la base de données
    // Ici c'est juste une liste
    private List<Compte> tComptes=new ArrayList<>();

    // Insert
    public void insert(Compte cpte){
        tComptes.add(cpte);
    }

    // Lister les comptes SelectAll
    public List<Compte> selectAll(){
        return tComptes;
    }
}
