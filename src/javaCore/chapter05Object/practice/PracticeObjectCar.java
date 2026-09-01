package javaCore.chapter05Object.practice;

public class PracticeObjectCar {

    String    brand;
    String    model;
    String    color;
    double    price;
    double odometer;






    public double run(double distance) {

        System.out.println("La voiture à parcouru " + distance + " kilomètre.");
        odometer += distance;
        return distance;

    }

    public void displayInformation() {
        System.out.println("| Marque : " + brand + " | Model : " + model + " | Couleur : " + color + " | Prix : " + price + " | Couleur : " + color + " | Kilometre : " + odometer + " |");
    }
}
