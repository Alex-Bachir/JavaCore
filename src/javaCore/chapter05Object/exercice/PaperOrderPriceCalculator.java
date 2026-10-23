package javaCore.chapter05Object.exercice;

import java.util.Scanner;

public class PaperOrderPriceCalculator  {
    public static void main(String[] args) {

        double valueAddedTax = 0.20;
        int paperOrder;
        String answer;
        boolean isCompany;

        Scanner sc = new Scanner(System.in);

        System.out.println("""

        Bienvenue sur le site internet de l'entreprise Dunder Mifflin, distributeur de feuilles !

        Warning ! Une commande peut se faire à partir de 200 feuilles jusqu'à 200.000 feuilles.

        Exemples de tarifs :
          -  5.000 feuilles :  50 € (5.000 x 0.01)
          - 15.000 feuilles : 125 € (10.000 x 0.01 + 5.000 x 0.005)
          - 50.000 feuilles : 250 € (10.000 x 0.01 + 20.000 x 0.005 + 20.000 x 0.0025)

        Livraison offerte pour toute commande supérieure à 200 €, sinon 9.99 €.
        Les prix sont hors taxes, une TVA de 20 % sera appliquée.

        """);

        System.out.println("Avant toute chose, êtes-vous une entreprise ? répondez par oui où par non. Merci.");

        answer = sc.nextLine().trim();
        if(answer.equalsIgnoreCase("oui")) {
            isCompany = true;
            valueAddedTax = 0;
            System.out.println("Vous êtes une entreprise on appliquera pas la TVA");
        } else {
            isCompany = false;
            System.out.println("Vous êtes un particulier on appliqueras la TVA de 20%");
        }
        
        do {
            System.out.println("Si toujours partant combien vous faudra-t-il de feuilles ?");
            paperOrder = sc.nextInt();
            if(paperOrder < 200 || paperOrder > 200_000) {
                System.out.println("Nombres de feuilles incorectes. Veuillez vous réferrer au message de bienvenus et au tarification pour insérer une commande acceptable.");
            }
        } while (!(paperOrder >= 200 && paperOrder <= 200_000));


        double result = paperOrder * 0.01 + valueAddedTax;

        System.out.println(result);


        
    }
}
