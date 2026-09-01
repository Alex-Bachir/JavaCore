package javaCore.chapter05Object.exercice.pen;

public class ObjectPen {
    
    String    name;
    String   color;
    double   price;
    int   quantity;
    String factory;
    double  weight;


    public void displayInformation() {
        System.out.println("Nom : " + name + " | Couleur : " + color + " | Prix : " + price + " $ | Quantité : " + quantity + " | Fabricant : " + factory + " | Poids : " + weight + " g");
    }
}
