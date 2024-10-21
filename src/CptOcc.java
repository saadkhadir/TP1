import java.util.Scanner;

public class CptOcc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer une chaine de caractère");
        String chaine = scanner.nextLine().toLowerCase();

        int[] nb_occurrences= new int[26];

        for (char ch='a'; ch<='z';ch++){
            int occ=0;
            for(int i=0;i<chaine.length();i++){
                if(chaine.charAt(i)==ch){
                   occ++;
                }
            }
          nb_occurrences[ch - 'a'] = occ;

        }
        System.out.println("la chaine" + chaine + "contient:");
        for(int i=0;i<nb_occurrences.length;i++){
            if(nb_occurrences[i] > 0){
                char lettre = (char) (i + 'a');
                System.out.println(nb_occurrences[i] + " fois la lettre '" + Character.toUpperCase(lettre) + "'");
            }
        }
    }
}