import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         //array list 
      ArrayList<Apprenant> listeApprenants = new ArrayList<>();
        int choix;
        do {
          System.out.println("=====MENU===== :");
          System.out.println("1.Ajouter un nouvel apprenant.");
          System.out.println("2.Modifier les informations d'un apprenant.");
          System.out.println("3.Supprimer un apprenant existant.");
          System.out.println("4.Consulter la liste des apprenants.");
          System.out.println("5.Rechercher un apprenant par nom, prénom ou numéro d'identifiant.");
          System.out.println("0.Quitter");
          System.out.print("Votre choix : ");
          choix = scanner.nextInt();
          Apprenant apprenant1 = new Apprenant("Nom", "Prenom", "11/11/1111", "Abcd,21,azerty",071235);
          switch (choix) {
          case 1:
            apprenant1.ajouter(listeApprenants );
            break;
          case 2:
            apprenant1.Modifier(listeApprenants, scanner);
            break;
          case 3:
            apprenant1.Supprimer(listeApprenants);
            break;
          case 4:
            apprenant1.Afficher(listeApprenants);
            break;
          case 5:
            apprenant1.Rechercher(listeApprenants);
            break;
          case 0:
           // ("Le programme est termine");
            break;
          default:
          //  printf("Choix invalide. Veuillez ressayer. \n");
          }
        } while (choix != 0);
        scanner.close();

    
  }
}