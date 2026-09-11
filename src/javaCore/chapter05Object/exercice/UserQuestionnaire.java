package javaCore.chapter05Object.exercice;

import java.util.Scanner;

// ici j'ai pas tout à fait fini 

public class UserQuestionnaire {

    
    
    public static void main(String[] args) {

        String pet = " ";
        

        Scanner sc = new Scanner(System.in);

        System.out.print("Veuillez entrer votre nom : ");
        String name = sc.nextLine();
        System.out.println("Merci ! Désormais je t'appelerai " + name + ".");
        System.out.print("Veuillez entrer votre age : ");
        int age = sc.nextInt();
        // ici on consomme le \n du buffer car sinon le prochain nextLine il sera sauté
        sc.nextLine();
        System.out.println("Merci pour l'information ! Vous avez donc " + age + " ans.");
        System.out.println("Voulez vous continuez le questionnaire ?");
        String question = sc.nextLine();

        // avec equalsIgnoreCase accepte aussi "Oui" ou "OUI"
        if (question.equalsIgnoreCase("oui")) {
            System.out.println("D'accord on continue !");
            System.out.println("Quel animal de compagnie aimez vous avoir à vos côté ?");
            String pet = sc.nextLine();
            System.out.println("D'accord vous aimez partager des moment avec un " + pet + ".");
            System.out.println("Merci d'avoir participer au questionnaire !");
        } else {
            System.out.println("D'accor don arrete là !");
        }

        sc.close();

        System.out.println("\n--- Synthèse ---");
        System.out.println("Nom    : " + name);
        System.out.println("Age    : " + age + " ans");
        System.out.println("Animal : " + pet);
        
        

    }

}
