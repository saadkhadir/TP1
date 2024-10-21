import java.util.Scanner;

public class Conjugaison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un verbe du 1er groupe");
        String verbe = scanner.nextLine().toLowerCase();

        if (verbe.length() > 2 && verbe.substring(verbe.length() - 2).equals("er")) {
            String radical = verbe.substring(0, verbe.length() - 2);
            System.out.println("je " + radical + "e");
            System.out.println("tu " + radical + "es");
            System.out.println("il/elle/on " + radical + "e");
            System.out.println("nous " + radical + "ons");
            System.out.println("vous " + radical + "ez");
            System.out.println("ils/elles " + radical + "ent");
        } else {
            System.out.println("Le verbe doit se terminer par 'er'.");
        }
        }

    }

