package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Client;

public class ClientRepository {
    
    private List<Client> tClients=new ArrayList<>();

    // creer client
    public void insert(Client client){
        tClients.add(client);
    }

    // Lister Clients
    public List<Client> SelectAll(){
        return tClients;
    }

    // Rechercher par numero
    public Client selectClientByTel(String tel){
        for (Client client : tClients) {
            if (client.getTelephone().compareTo(tel)==0) {
                return client;
                
            }
        }
        return null;

    }
    
    public Client selectClientByNom(String nom){
        for (Client client : tClients) {
            if (client.getNomComplet().compareTo(nom)==0) {
                return client;
                
            }
        }
        return null;

    }

}
