package javaCore.chapter05Object.practice;

import java.util.Scanner;

public class PracticeScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // String userValue = scanner.nextLine();
        System.out.print("Entrer une valeur : ");
        // int userValue = scanner.nextInt();
        float userValue = scanner.nextFloat();
        System.out.print("La valeur est : " + userValue);
    }
}
