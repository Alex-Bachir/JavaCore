package javaCore.chapter05Object.exercice.pen;

public class Pen {

    public static void main(String[] args) {
    
        ObjectPen pen1 = new ObjectPen();
        ObjectPen pen2 = new ObjectPen();

        pen2.name = "Plume";
        pen2.color = "Noir";
        pen2.price = 8;
        pen2.quantity = 12;
        pen2.factory = "Phoenix";
        pen2.weight = 22;

        pen1.name     = "Stylo";
        pen1.color    =  "Bleu";
        pen1.price    =    2.50;
        pen1.quantity =      10;
        pen1.factory  =   "Bic";
        pen1.weight   =      15;

        pen1.displayInformation();
        pen2.displayInformation();
}
}
