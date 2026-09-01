package javaCore.chapter04Function.exercise;

public class RecursiveFunction {
    public static void main(String[] args) {

        System.out.println(showNumber(1, 10000));
        showNumberWithVoid(1, 10000);

    }

    public static int showNumber(int current, int max) {
        System.out.println(current);
        if (current >= max) {

            return current + 1;

        }
        return showNumber(current + 1, max);
    }

    // autre façon de faire vu sur Baeldung
    public static void showNumberWithVoid(int current, int max) {
        System.out.println(current);
        if (current >= max) {
            return;
        }
        showNumberWithVoid(current + 1, max);
    }




}
