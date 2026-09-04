package javaCore.chapter04Function.exercise;

public class RecursiveFibonacci {
    public static void main(String[] args) {

        // ça marche, mais c'est du gâchis de faire comme ça.
        // à chaque rappel de la fonction ça re-calcule ce qui a été fait.
        // je remarque que pour mon ordi à partir de 44 l'ordi galère à calculer.

        for (int term = 1; term <= 50; term++) {
            System.out.println("Fibonacci term " + term + " = " + fibonacci(term));
        }


    }
    
    
    public static int fibonacci(int n) {
        // on "return" jusqu'a 1 et à partir de 2 on commence fibonacci
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
