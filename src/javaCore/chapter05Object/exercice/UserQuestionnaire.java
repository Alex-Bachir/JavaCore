package javaCore.chapter05Object.exercice;

import java.util.Scanner;

public class UserQuestionnaire {

    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Veuillez entrer votre nom : ");
        String name = sc.nextLine();
        System.out.println("Merci ! Désormais je t'appelerai " + name + ".");
        System.out.print("Veuillez entrer votre age : ");
        int age = sc.nextInt();
        System.out.println("Merci pour l'information ! Vous avez donc " + age + " ans.");
       
        System.out.println("Voulez-vous continuer le questionnaire ? Répondez par oui où par non.");
        boolean question = sc.nextBoolean();
        // ajouter la condition si oui ou non il veut continuer ..
        
    }
    
}
