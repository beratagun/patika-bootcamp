package week2.BoksOyunu;

public class Main {

    public static void main(String[] args) {
        Fighter berat = new Fighter("Berat", 15, 100, 90, 50);
        Fighter ahmet = new Fighter("Ahmet", 10, 95, 100, 0);
        Ring r = new Ring(berat, ahmet, 80, 110);
        ahmet.printFighter();
        berat.printFighter();
        r.run();


    }

}
