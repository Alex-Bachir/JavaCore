package javaCore.chapter05Object.exercice;

import java.util.Scanner;

public class PaperOrderPriceCalculator  {
    public static void main(String[] args) {
        
        final int PRICE_FOR_50K_SHEETS = 250;
        final int PRICE_FOR_15K_SHEETS = 125;
        final int PRICE_FOR_10K_SHEETS =  50;

        int count50k = 0;
        int count15k = 0;
        int count10k = 0;

        

        Scanner sc = new Scanner(System.in);

        System.out.println("""

        Bienvenue sur le site internet de l'entreprise Dunder Mifflin, distributeur de feuilles !

        Warning ! Une commande peut se faire à partir de 200 feuilles jusqu'à 200.000 feuilles.

        Exemples de tarifs :
          -  10.000 feuilles :  50€ (5.000 x 0.01)
          - 15.000 feuilles : 125€ (10.000 x 0.01 + 5.000 x 0.005)
          - 50.000 feuilles : 250€ (10.000 x 0.01 + 20.000 x 0.005 + 20.000 x 0.0025)

        Livraison offerte pour toute commande supérieure à 200€, sinon 9.99€.
        Les prix sont hors taxes, une TVA de 20 % sera appliquée.

        """);

        System.out.println("Avant toute chose, êtes-vous une entreprise ? répondez par oui où par non. Merci.");

        double valueAddedTax;
        double sheetPrice;
        boolean isCompany;
        String answer;

        // demande a l'utilisateur si c'est une entreprise ou pas afin de deduire automatiquement la TVA
        answer = sc.nextLine().trim();
        if(answer.equalsIgnoreCase("oui")) {
            isCompany = true;
            valueAddedTax = 0;
            System.out.println("Vous êtes une entreprise on appliquera pas la TVA");
        } else {
            isCompany = false;
            valueAddedTax = 0.20;
            System.out.println("Vous êtes un particulier on appliqueras la TVA de 20%");
        }

        // la boucle do while demande un nombre de feuille entre 200 et 200_000 
        int paperOrder;
        
        do {
            System.out.println("Si toujours partant combien vous faudra-t-il de feuilles ?");
            paperOrder = sc.nextInt();
            if(paperOrder < 200 || paperOrder > 200_000) {
                System.out.println("Nombres de feuilles incorectes. Veuillez vous réferrer au message de bienvenus et au tarification pour insérer une commande acceptable.");
            }
        } while (!(paperOrder >= 200 && paperOrder <= 200_000));

        


        


        
    }
}









// if (paperOrder >= 50_000) {
        //     System.out.println("La commande est de " + paperOrder + ".");
        //     paperOrder -= 50_000;
        //     count50k ++;
        //     System.out.println("Il reste " + paperOrder + " feuilles. " + count50k + " donc " +  PRICE_FOR_50K_SHEETS);

        // }
        // if (paperOrder >= 15_000) {
        //     paperOrder -= 15_000;
        //     count15k++;
        //     System.out.println("Il reste" + paperOrder + " feuilles. " + count15k + " donc " +  PRICE_FOR_15K_SHEETS);
        // }
        // if (paperOrder >= 10_000) {
        //     paperOrder -= 10_000;
        //     count10k++;
        //     System.out.println("Il reste " + paperOrder + " feuilles. " + count10k + " donc " +  PRICE_FOR_10K_SHEETS);
        // }

        // double totalPrice = ((PRICE_FOR_50K_SHEETS * count50k) + (PRICE_FOR_15K_SHEETS * count15k) + (PRICE_FOR_10K_SHEETS * count10k) + (paperOrder * 0.01));
        // double totalPriceafterVAT = totalPrice + (totalPrice * valueAddedTax);

        // System.out.println("le prix de la commande est de " + totalPrice + " euros. Apres la TVA " + totalPriceafterVAT + " euros.");
