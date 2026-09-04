package javaCore.chapter05Object.practice;

public class VariableReference {
    public static void main(String[] args) {
        

        /*
         Exemple de variable primitive
        */
        int age1 = 20;
        int age2 = age1;
        

        System.out.println("Premiere valeur de age1 : " + age1);
        System.out.println("Premiere valeur de age2 : " + age2);

        age2 = 35;

        System.out.println("Seconde valeur de age1 : " + age1);
        System.out.println("Seconde valeur de age2 : " + age2);

        afficherAge(age2);

        // pas d'incidence age2 = 35
        System.out.println("Troisieme valeur de age2 : " + age2);

        /*
            Exemple Variable référence
        */

        PracticeObjectCar car1 = new PracticeObjectCar("Ford", "Focus", "Noir",27500.0,0.00);
        PracticeObjectCar car2 = car1;

        System.out.println("Premiere Marque de car1 " + car1.brand);
        System.out.println("Premiere Marque de car2 " + car2.brand);

        afficherVoiture(car2);

        System.out.println("Deuxieme Marque de car1 " + car1.brand);
        System.out.println("Deuxieme Marque de car2 " + car2.brand);

        car1 = new PracticeObjectCar("Ford", "Focus", "Noir", 27800.0,0);
        car2 = new PracticeObjectCar("Subaru", "Impreza", "Bleu", 47000.0, 0);

        System.out.println(car1);
        System.out.println(car2);

    }

    public static void afficherAge(int age) {

        age = 40;
        
        System.out.println("Age : " + age);

    }

    public static void afficherVoiture(PracticeObjectCar car) {

        car.brand = "Nissan";
        System.out.println(car.brand);

    }





}
