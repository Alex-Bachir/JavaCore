package javaCore.chapter05Object.exercice;

import java.util.Scanner;

public class ScannerWeek {

    public static void main(String[] args) {

        String reponse;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Quel jour sommes nous ?");
            reponse = sc.nextLine();

            // recommence tant que la réponse n’est pas un des jours "!"
        } while (!( reponse.equalsIgnoreCase("lundi")      ||
                    reponse.equalsIgnoreCase("mardi")      || 
                    reponse.equalsIgnoreCase("mercredi")   || 
                    reponse.equalsIgnoreCase("jeudi")      || 
                    reponse.equalsIgnoreCase("vendredi")   || 
                    reponse.equalsIgnoreCase("samedi")     || 
                    reponse.equalsIgnoreCase("dimanche"))
                );

        System.out.println("D'accord nous sommes " + reponse);

        sc.close();

    }
    
}
