package javaCore.chapter05Object.practice;

public class PractiveVariableDefault {

    int entier;
    double virgule;
    boolean trueOrFalse;
    char character;

    String textValue;

    public static void main(String[] args) {

        PractiveVariableDefault testDefaultValueObject = new PractiveVariableDefault();

        System.out.println("Entier : " + testDefaultValueObject.entier);
        System.out.println("Virgule : " + testDefaultValueObject.virgule);
        System.out.println("Booleen : " + testDefaultValueObject.trueOrFalse);
        System.out.println("Lettre : " + testDefaultValueObject.character);
        System.out.println("Texte : " + testDefaultValueObject.textValue);

    }
    
}
