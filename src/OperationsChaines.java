import java.util.Scanner;

public class OperationsChaines {
    private static String chaine ="";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choix;
        do {
            System.out.println("\nMENU :");
            System.out.println("1. Saisir une chaîne");
            System.out.println("2. Afficher la chaîne");
            System.out.println("3. Inverser la chaîne");
            System.out.println("4. Nombre de mots");
            System.out.println("5. Quitter");
            System.out.print("Choisissez une option : ");
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.print("Entrez une chaîne de caractères : ");
                    chaine=scanner.nextLine();
                    break;
                case 2:
                    if(chaine.isEmpty()) {
                        System.out.println("rien à afficher");
                    }
                        else{
                            System.out.println("voici la chaine" + chaine);
                        }
                        break;
                case 3:
                    if(chaine.isEmpty()){
                        System.out.println("rien à inverser");
                    }
                    else{
                        String chaineInversee = new StringBuilder(chaine).reverse().toString();
                        System.out.println("la chaine de caractère inversée" +chaineInversee);
                    }
                    break;
                case 4:
                    if(chaine.isEmpty()){
                        System.out.println("chaine vide");
                    }
                    else {
                        String[] tabch = chaine.trim().split("");
                        System.out.println("le nombre de mots de la chaine est" + tabch.length);
                    }
                   break;
                case 5 :
                    System.out.println("Vous avez quittez");
                default:
                    System.out.println("option invalide");
            }
            if(choix!=5){
                System.out.println("Frappez une touche pour revenir au menu");
                scanner.nextLine();
            }


        }while(choix!=5);
     scanner.close();
    }
}