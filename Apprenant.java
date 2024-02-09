import java.util.ArrayList;
import java.util.Scanner;

public class Apprenant{
    private String nom;
    private String prenom;
    private String dateNaissance;
    private String adresse;
    private long nmtele;
    public Classe salle;

    //constructor
    public Apprenant(String nom, String prenom, String dateNaissance, String adresse, long nmtelephone){
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.nmtele = nmtelephone;
    }

    //Method pour ajouter un apprenant
    public void ajouter(ArrayList<Apprenant> listeApprenants ){
        Scanner myObj = new Scanner(System.in);

    System.out.print("Preom: ");
    String prenom = myObj.nextLine();

    System.out.print("Nom: ");
    String nom = myObj.nextLine();

    System.out.print("Date de naissance: ");
    String dateNaissance = myObj.nextLine();

    System.out.print("Adresse: ");
    String adresse = myObj.nextLine();

    System.out.print("Numero de telephone: ");
    long nmtele = myObj.nextInt();

    System.out.print("Classe: ");
    int salle = myObj.nextInt();
    myObj.close();

    Apprenant nvApprenant = new Apprenant(nom,prenom,dateNaissance,adresse,nmtele);
    listeApprenants.add(nvApprenant);

    System.out.println(nom +" "+ prenom + " Ajoutee avec succes"); 
  }


    //Method pour AfficherApprenant
    public void Afficher(ArrayList<Apprenant> listeApprenants ){
        if (listeApprenants.isEmpty()) {
            System.out.println("Aucune apprenant à afficher.");     
        }else{
         System.out.println("Liste des apprenants :");
        for (Apprenant apprenant : listeApprenants) {
            System.out.println("-"+" "+"Nom: " +apprenant.nom +" || "+"Prenom: " +apprenant.prenom+" || " +"Date de naissance: "+apprenant.dateNaissance
            +" || " +"Adresse: " +apprenant.adresse + " || "+"Telephone: " +apprenant.nmtele + " || " + "Classe: "+apprenant.salle);
        }
        }
    }

    //Method pour ModifierApprenant
    public void Modifier(ArrayList<Apprenant> listeApprenants, Scanner scanner){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Liste des apprenants :");
        for (int i = 0; i < listeApprenants.size(); i++) {
            System.out.println((i + 1) + "." +listeApprenants.get(i).getPrenom()+" " + listeApprenants.get(i).getNom() );
        }
        System.out.print("Entrez le numéro de l'apprenant à modifier: ");
        int choixApprenant = myObj.nextInt();
        myObj.nextLine(); 
        myObj.close();
    
        if (choixApprenant < 1 || choixApprenant > listeApprenants.size()) {
            System.out.println("Choix invalide.");
            return;
        }
    
        Apprenant apprenant = listeApprenants.get(choixApprenant - 1);
    
        System.out.println("Quelles informations souhaitez-vous modifier pour " +apprenant.getPrenom()+" "+ apprenant.getNom() + " ?");
        System.out.println("1. Nom");
        System.out.println("2. Prenom");
        System.out.println("3. Date de naissance");
        System.out.println("4. Adresse");
        System.out.println("5. Numero de telephone");
       // System.out.println("6. Classe");
        System.out.print("Votre choix: ");
        int choix = myObj.nextInt();
        myObj.nextLine();
    
        switch (choix) {
            case 1:
                System.out.print("Nouveau nom: ");
                String nouveauNom = myObj.nextLine();
                apprenant.setNom(nouveauNom);
                break;
            case 2:
                System.out.print("Nouveau prenom: ");
                String nouveauPrenom = myObj.nextLine();
                apprenant.setPrenom(nouveauPrenom);
                break;
            case 3:
                System.out.print("Nouvelle date de naissance: ");
                String nouvelleDateNaissance = myObj.nextLine();
                apprenant.setDateNaissance(nouvelleDateNaissance);
                break;
            case 4:
                System.out.print("Nouvelle adresse: ");
                String nouvelleAdresse = myObj.nextLine();
                apprenant.setAdresse(nouvelleAdresse);
                break;
            case 5:
                System.out.print("Nouveau numero de telephone: ");
                long nouveauNmtele = myObj.nextLong();
                apprenant.setNmtele(nouveauNmtele);
                break;
           
            default:
                System.out.println("Choix invalide");
                break;
        }
        System.out.println("Informations de l'apprenant modifiées avec succès.");
            }

    //Method pour RechercherApprenant
    public void Rechercher(ArrayList<Apprenant> listeApprenants) {
        Scanner scanner = new Scanner(System.in);
    
        // Prompt the user to enter the search key
        System.out.print("Entrez le nom, le prenom ou le numéro de téléphone de l'apprenant à rechercher: ");
        String recherche = scanner.nextLine();
        scanner.close();
    
        boolean found = false;
    
        for (Apprenant apprenant : listeApprenants) {
            if (apprenant.getNom().equalsIgnoreCase(recherche) ||
                    apprenant.getPrenom().equalsIgnoreCase(recherche) ||
                    Long.toString(apprenant.getNmtele()).equals(recherche)) {
                System.out.println("Apprenant trouvé :");
                System.out.println("Nom: " + apprenant.getNom());
                System.out.println("Prenom: " + apprenant.getPrenom());
                System.out.println("Date de naissance: " + apprenant.getDateNaissance());
                System.out.println("Adresse: " + apprenant.getAdresse());
                System.out.println("Numero de telephone: " + apprenant.getNmtele());
                System.out.println("Classe: " + apprenant.salle);
                found = true;
                break; // No need to continue searching once found
            }
        }
    
        // If the apprenant is not found, print a message
        if (!found) {
            System.out.println("Apprenant non trouvé.");
        }
    }

    //Method pour SuprimmerApprenant
    public void Supprimer(ArrayList<Apprenant> listeApprenants){
        Scanner myObj = new Scanner(System.in);
    System.out.println("Liste des apprenants :");
    for (int i = 0; i < listeApprenants.size(); i++) {
        System.out.println((i + 1) + "."+listeApprenants.get(i).getPrenom()+" " + listeApprenants.get(i).getNom());
    }
    System.out.print("Entrez le numéro de l'apprenant à supprimer: ");
    int choixApprenant = myObj.nextInt();
    myObj.nextLine(); 

    myObj.close();
    if (choixApprenant < 1 || choixApprenant > listeApprenants.size()) {
        System.out.println("Choix invalide.");
        return;
    }

    Apprenant apprenant = listeApprenants.get(choixApprenant - 1);
    listeApprenants.remove(apprenant);
    System.out.println("L'apprenant "+apprenant.getPrenom()+" "+ apprenant.getNom() + " a été supprimé avec succès.");

    }


    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNaissance() {
        return this.dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public long getNmtele() {
        return this.nmtele;
    }

    public void setNmtele(long nmtele) {
        this.nmtele = nmtele;
    }

}