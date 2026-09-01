package javaCore.chapter05Object.practice;

public class PracticeObject {
    public static void main(String[] args) {

        PracticeObjectCar car1 = new PracticeObjectCar();
        PracticeObjectCar car2 = new PracticeObjectCar();

        car1.brand    = "Mercedes";
        car1.color    =     "noir";
        car1.model    =      "CLK";
        car1.odometer =          0;
        car1.price    =      55000;

        car2.brand    = "Nissan";
        car2.color    = "Bleu";
        car2.model    = "Silvia";
        car2.odometer = 0;
        car2.price    = 38000;

        car2.displayInformation();
        car2.run(800);
        car2.displayInformation();
        car2.run(145);
        car2.displayInformation();  

        System.out.println("----------------------------------------------------------------------------------------------------------------");

        car1.displayInformation();
        car1.run(123);
        car1.displayInformation();
        car1.run(259);
        car1.displayInformation();











        // Ce qu'on doit faire si on connais pas la POO

        // String carBrand1 = "Ferarri";
        // String carModel1 = "F458";
        // String carColor1 = "Rouge";
        // double carOdometer1 = 0;

        // String carBrand2 = "BMW";
        // String carModel2 = "M5";
        // String carColor2 = "Grise";
        // double carOdometer2 = 0;

        // System.out.println("Ma " + carBrand1 + " " + carModel1 + " de couleur " + carColor1 + " a au compteur seulement " + carOdometer1 + " kilomètre");



        // System.out.println(carOdometer1);


        // System.out.println("Ma nouvelle " + carBrand2 + " " + carModel2 + " de couleur " + carColor2 + " a " + carOdometer2 + " kilomètre au compteur.");












    }

    


}
