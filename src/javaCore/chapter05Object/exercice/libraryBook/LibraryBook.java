package javaCore.chapter05Object.exercice.libraryBook;

public class LibraryBook {


    public static void main(String[] args) {
        
        LibraryBookObject book1 = new LibraryBookObject();

        book1.name        =     "Etre et Temps";
        book1.author      =  "Martin Heidegger";
        book1.publication =                1927;
        book1.ISBN        = "978-2-07-070739-3";
        book1.isBorrow    =               false;

        book1.showInformation();
    }
}