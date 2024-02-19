import java.util.List;
import java.util.Scanner;

import entities.Agence;
import entities.Cheque;
import entities.Client;
import entities.Compte;
import entities.Epargne;
import entities.EtypeCompte;
import services.AgenceService;
import services.ClientService;
import services.CompteService;


public class View {
    public static void main(String[] args) throws Exception {
        int choix;
        Scanner sc=new Scanner(System.in);
        AgenceService agenceService=new AgenceService();
        ClientService clientService=new ClientService();
        CompteService compteService=new CompteService();

        
         
        do {
            System.out.println("1- Ajouter une agence");
            System.out.println("2- Lister les agences");
            System.out.println("3- Lister une agence par numero");
            System.out.println("4- Ajouter un client");
            System.out.println("5- Lister les clients");
            System.out.println("6- Ajouter un compte");
            System.out.println("7- Lister les comptes");
            System.out.println("8- Lister les comptes d'un client");
            System.out.println("10- Quitter");
            choix=sc.nextInt(); 
            sc.nextLine();

            switch (choix) {
            case 1:
                System.out.println("Entrer un numero :");
                String numero=sc.nextLine();
                System.out.println("Entrer un telephone :");
                String tel=sc.nextLine();
                System.out.println("Entrer une adresse :");
                String adresse=sc.nextLine();
                Agence ag=new Agence();
                 ag.setNumero(numero);
                 ag.setTelephone(tel);
                 ag.setAdresse(adresse);
                agenceService.ajouterAgence(ag);
                break;

            case 2:
                List<Agence> agences= agenceService.ListerAgence();
                for (Agence agence : agences) {
                    System.out.println("Numero :" + agence.getNumero());
                    System.out.println("Telephone :" + agence.getTelephone());
                    System.out.println("Adresse :" + agence.getAdresse());
                    System.out.println("=======================");
                }
                break;

            case 3:
                System.out.println("Entrer un numero : ");
                numero=sc.nextLine();
                Agence agence= agenceService.ListerAgence(numero);
                if (agence!=null) {
                 System.out.println("Numero " + agence.getNumero());
                 System.out.println("Telephone " + agence.getTelephone());
                 System.out.println("Adresse " + agence.getAdresse());
                } else {
                    System.out.println("Ce numero ne correspond pas à celui d'une agence.");
                }
                break;
                
            case 4:
                    System.out.println("Entrer un nom complet : ");
                    String nomComplet=sc.nextLine();
                    System.out.println("Entrer un telephone : ");
                    String telClient=sc.nextLine();
                    System.out.println("Entrer un nom email : ");
                    String email=sc.nextLine();
                    Client cl=new Client();
                     cl.setNomComplet(nomComplet);
                     cl.setTelephone(telClient);
                     cl.setEmail(email);
                     clientService.creerClient(cl);
                break;
                
            case 5: 
                List<Client> clients=clientService.ListerClient();
                for (Client client : clients) {
                    System.out.println("Nom Complet : " + client.getNomComplet());
                    System.out.println("Telephone : " + client.getTelephone());
                    System.out.println("Email : " + client.getEmail());
                    System.out.println("=======================");
                }
                break;
            case 6: 
                System.out.println("Entrer un Numero :");
                String numeroC=sc.nextLine();
                System.out.println("Entrer le Solde :");
                double solde=sc.nextDouble();
                // Compte compte=new Compte();
                System.out.println("Veuillez choisir le type de compte");
                System.out.println("1- Cheque");
                System.out.println("2- Epargne");
                int type=sc.nextInt();
                sc.nextLine();
                
                // Lier à un client s'il existe ou créer le client si non
                Client client=new Client();
                System.out.println("Entrer le nom du client");
                String nomClient=sc.nextLine();
                client= clientService.rechercherParNom(nomClient);
                if (client==null) {
                    System.out.println("Entrer un telephone : ");
                    telClient=sc.nextLine();
                    System.out.println("Entrer un nom email : ");
                    email=sc.nextLine();
                    client=new Client();
                     client.setNomComplet(nomClient);
                     client.setTelephone(telClient);
                     client.setEmail(email);
                    clientService.creerClient(client);
                }

                // Type de compte
                if (type==1) {
                    // Cheque
                    System.out.println("Entrer les Frais");
                    double frais=sc.nextDouble();
                    Cheque compte=new Cheque();
                    compte.setNumero(numeroC);
                    compte.setSolde(solde);
                    compte.setFrais(frais);
                    compte.setType(EtypeCompte.Cheque);
                    compte.setClient(client);
                    compteService.AjouterCompte(compte);

                } else if (type==2){
                    // Epargne
                    System.out.println("Entrer les Taux");
                    double taux=sc.nextDouble();
                    Epargne compte=new Epargne();
                    compte.setNumero(numeroC);
                    compte.setSolde(solde);
                    compte.setTaux(taux);
                    compte.setType(EtypeCompte.Cheque);
                    compte.setClient(client);
                    compteService.AjouterCompte(compte);
                }

                break;
                
            case 7:
            List<Compte> comptes= compteService.ListerComptes();
                for (Compte compte : comptes) {
                    System.out.println("Numero du compte : " + compte.getNumero());
                    System.out.println("Solde du compte : " + compte.getSolde());
                    System.out.println("Type du compte : " + compte.getType());
                    System.out.println("Client  : " + compte.getClient().getNomComplet());
                    System.out.println("=================================================");

                }    
                break;

            
            default:
                break;
            }

        } while (choix!=10);
    }
}
