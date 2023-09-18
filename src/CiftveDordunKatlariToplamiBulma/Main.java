package CiftveDordunKatlariToplamiBulma;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Tek sayı girince işlemi sonlandıran, çift ve dördün katlarını toplayıp ekrana yazan program.
        Scanner input = new Scanner(System.in);
        int t;
        int total = 0;

        do {
            System.out.print("Sayıları Giriniz: ");
            t = input.nextInt();
            if (t % 4 == 0) {  //Dördün katı her zaman çift olacağı için sadece bu koşul yeterlidir.
                total += t;
            }
        }
        while (t > 0 && t % 2 == 0);
        System.out.print(" Döngü bitti, girilen sayıların toplamı: " + total);
    }
}
