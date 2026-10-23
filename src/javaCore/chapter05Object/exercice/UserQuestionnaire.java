package javaCore.chapter05Object.exercice;

import java.util.Scanner;

// ici j'ai pas tout à fait fini 

public class UserQuestionnaire {

    
    
    public static void main(String[] args) {

        String pet = " ";
        double result = 0;
        

        Scanner sc = new Scanner(System.in);

        System.out.print("Veuillez entrer votre nom : ");
        String name = sc.nextLine();
        System.out.println("Merci ! Désormais je t'appelerai " + name + ".");
        System.out.print("Veuillez entrer votre age : ");
        int age = sc.nextInt();
        // ici on consomme le \n du buffer car sinon le prochain nextLine il sera sauté
        sc.nextLine();
        System.out.println("Merci pour l'information ! Vous avez " + age + " ans.");
        System.out.println("Voulez vous continuez le questionnaire ?");
        String question = sc.nextLine();

        // avec equalsIgnoreCase accepte aussi "Oui" ou "OUI"
        if (question.equalsIgnoreCase("oui")) {
            System.out.println("D'accord on continue !");
            System.out.println("Quel animal de compagnie aimez vous avoir à vos côté ?");
            pet = sc.nextLine();
            System.out.println("D'accord vous aimez les " + pet + ".");
            System.out.println("Que fais le resultat en divisant 5 par 2 ?");
            result = sc.nextFloat();
            System.out.println("Vous avez trouvé " + result + ".");
            System.out.println("Merci d'avoir participer au questionnaire !");
        } else {
            System.out.println("D'accord on arrete là !");
        }

        sc.close();

        System.out.println("\n--- Synthèse ---");
        System.out.println("Nom    : " + name);
        System.out.println("Age    : " + age + " ans");
        System.out.println("Animal : " + pet);
        System.out.println("Calcule : " + result);
        
        

    }

}
