package week5.BookSorter;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("Kuyucaklı Yusuf", "Sabahattin Ali", 150, 1937);
        Book b2 = new Book("İstanbul Hatırası", "Ahmet Ümit", 350, 2005);
        Book b3 = new Book("Körlük", "José Saramago", 330, 1995);
        Book b4 = new Book("Beyhude", "Halide Edib Adıvar", 200, 1919);
        Book b5 = new Book("Kürk Mantolu Madonna", "Sabahattin Ali", 120, 1943);

        TreeSet<Book> bookTreeSet = new TreeSet<>();

        bookTreeSet.add(b1);
        bookTreeSet.add(b2);
        bookTreeSet.add(b3);
        bookTreeSet.add(b4);
        bookTreeSet.add(b5);

        System.out.println("#######################################");
        System.out.println("Sorted by Book Name");
        System.out.println("#######################################");

        for (Book book : bookTreeSet) {
            System.out.println(book.toString());
        }

        System.out.println("#######################################");
        TreeSet<Book> bookTreeSet2 = new TreeSet<>(new PageComparator());

        bookTreeSet2.add(b1);
        bookTreeSet2.add(b2);
        bookTreeSet2.add(b3);
        bookTreeSet2.add(b4);
        bookTreeSet2.add(b5);

        System.out.println("Sorted by Number of Pages");
        System.out.println("#######################################");


        for (Book book : bookTreeSet2) {
            System.out.println(book.toString());
        }
    }
}