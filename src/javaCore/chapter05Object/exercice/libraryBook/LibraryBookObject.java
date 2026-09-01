package javaCore.chapter05Object.exercice;

public class LibraryBookObject {

    String      name;
    String    author;
    int  publication;
    String      ISBN;
    boolean isBorrow;


    public void showInformation() {

        System.out.println(" Nom :      "  + name
                     +  " |  Auteur :   "  + author
                     +  " |  Parution : "  + publication
                     +  " |  N° ISBN :  "  + ISBN
                     +  " |  Emprunt :  "  + isBorrow
        );
    }

    
}