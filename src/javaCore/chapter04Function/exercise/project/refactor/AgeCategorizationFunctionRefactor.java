package javaCore.chapter04Function.exercise.project.refactor;

public class AgeCategorizationFunctionRefactor {
    //Chapter02Condition
    public static void AgeCategorizationFunction(int age) {

        if ( age < 10) {
            System.out.println("C'est un enfant.");
        } else if ( age <= 18) {
            System.out.println("C'est un adolescent.");
        } else if ( age <= 25) {
            System.out.println("C'est un jeune adulte.");
        } else if ( age <= 65) {
            System.out.println("C'est un adulte.");
        } else {
            System.out.println("C'est un senior.");
        }
    }
}
