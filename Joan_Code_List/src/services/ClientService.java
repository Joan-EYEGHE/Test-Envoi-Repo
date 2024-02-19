package services;

import java.util.List;

import entities.Client;

import repositories.ClientRepository;


public class ClientService {
    
    // Créer val repository 
    ClientRepository clientRepository=new ClientRepository();

    // Créer client 
    public void creerClient(Client client){
        clientRepository.insert(client);
    }

    // Lister Client
    public List<Client> ListerClient(){
        return clientRepository.SelectAll();
    }

    // Rechercher par phone
    public Client rechercherParTel(String tel){
        return clientRepository.selectClientByTel(tel);
    }

    // Rechercher par nom
    public Client rechercherParNom(String nom){
        return clientRepository.selectClientByNom(nom);
    }

}
