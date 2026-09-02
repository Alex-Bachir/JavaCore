package javaCore.chapter05Object.practice;

public class PracticeObjectCar {

    String    brand;
    String    model;
    String    color;
    double    price;
    double odometer;

    public PracticeObjectCar(String brand, String model, String color, double price, double odometer) {

        this.brand    =    brand;
        this.model    =    model;
        this.color    =    color;
        this.price    =    price;
        this.odometer = odometer;

        this.displayInformation();


    }




    public double run(double distance) {

        System.out.println("La voiture à parcouru " + distance + " kilomètre.");
        this.odometer += distance;
        return distance;

    }

    public void displayInformation() {
        System.out.println("| Marque : " + this.brand + " | Model : " + this.model + " | Couleur : " + this.color + " | Prix : " + this.price + "  | Kilometre : " + this.odometer + " |");
    }
}
