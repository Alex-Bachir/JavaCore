package javaCore.chapter04Function.exercise;

public class FunctionOverload {

    public static void main(String[] args) {

        // tester nombre positif et negatif et resultat qui vaut 0

        System.out.println(sum(4, 6, 1));
        System.out.println(sum(-5, -8, -3));
        System.out.println(sum(5, -5));
        System.out.println(sum(18, 2, -20));
        System.out.println(sum(-20, 2, 18));
        System.out.println(sum(1, 1, 1, 1));

        
    }

    public static int sum(int number1, int number2) {

        return number1 + number2;

    }

    // comme en mathématique on résout ce qu'il y a dans les parenthèses
    // ici la fonction délègue à la fonction ci-dessus

    public static int sum(int number1, int number2, int number3) {

        return sum(sum(number1, number2), number3 );

    
    }

    public static int sum(int number1, int number2, int number3, int number4) {

        return sum(sum(sum(number1, number2), number3), number4);
    }

   
    
}


