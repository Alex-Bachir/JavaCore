package javaCore.chapter05Object.exercice.CarImprovementV2;

public class CarImprovementObject {

    String            brand;
    String            model;
    String            color;
    double            price;
    double         odometer;
    boolean isEngineStarted = true;

    // Pas besoin de mettre en paramètre isEngineStarted, car pas besoin de savoir si la voiture est démarrer où pas dans les informations général d'un véhicule
    public CarImprovementObject(String brand, String model, String color, double price, double odometer) {

        this.brand    =    brand;
        this.model    =    model;
        this.color    =    color;
        this.price    =    price;
        this.odometer = odometer;

    }

    public void run(double distance) {
        
        if (this.isEngineStarted) {
        System.out.println("Impossible de rouler, le moteur est à l'arrêt");
        return;
    }

    this.odometer += distance;
    System.out.println("La voiture a parcouru " + distance + " kilomètres.");
        

    }

    public void displayInformation() {
        System.out.println("| Marque : " + this.brand + " | Model : " + this.model + " | Couleur : " + this.color + " | Prix : " + this.price + "  | Kilometre : " + this.odometer + " |");
    }

}
