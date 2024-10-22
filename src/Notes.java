import java.util.Scanner;
import java.util.Arrays;

public class Notes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer le nombre des notes");
        int nombreNotes = scanner.nextInt();

        float[] notes = new float[nombreNotes];

        for(int i=0;i<nombreNotes;i++){
            System.out.println("veuillez entrer la " +(i+1)+ "note");
            notes[i]= scanner.nextFloat();
        }
        Arrays.sort(notes);

        System.out.println("la liste des notes triée "+ Arrays.toString(notes));

        float MoyenneNote = 0;
        float SommeNotes =0;
        for(float note : notes){
            SommeNotes+=note;
        }
        MoyenneNote=SommeNotes/nombreNotes;

        System.out.println("la moyenne des notes est :" + MoyenneNote);

        float noteMin=notes[0];
        for(float note : notes){
            if(note<noteMin){
                noteMin=note;
            }
        }
        System.out.println("la note minimale est" +noteMin);

        float noteMax=notes[0];
        for(float note : notes){
            if(note>noteMax){
                noteMax=note;
            }
        }
        System.out.println("la note maximale est" +noteMax);

        System.out.print("Veuillez entre une note ");
        float noteEntree = scanner.nextFloat();

        int cpt=0;
        for(float note : notes){
            if(note==noteEntree){
                cpt++;
            }
        }

    System.out.println("le nombre des étudiants ayant la note saisie par l'utilisateur est :" + cpt );




    }
}