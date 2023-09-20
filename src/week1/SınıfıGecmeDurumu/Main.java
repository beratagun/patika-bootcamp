package SınıfıGecmeDurumu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri tanımlayalım
        int mat, fiz, trkc, kimya, muzik, lessons = 5;
        double total;
        Scanner input = new Scanner(System.in);


        // Değerleri alalım

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz: ");
        fiz = input.nextInt();

        System.out.print("Türkçe notunuz: ");
        trkc = input.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();

        //Girilen notlar 0 ile 100 arasında değil ise ortlamaya katılmasın.

        if (mat > 100 || mat == 0) {
            mat = 0;
            lessons--;
        }
        if (fiz > 100 || fiz == 0) {
            fiz = 0;
            lessons--;
        }
        if (trkc > 100 || trkc == 0) {
            trkc = 0;
            lessons--;
        }
        if (kimya > 100 || kimya == 0) {
            kimya = 0;
            lessons--;
        }
        if (muzik > 100 || muzik == 0) {
            muzik = 0;
            lessons--;
        }

        // Ortalamaya katılacak dersleri toplayıp ortalamasını alalım

        total = (mat + fiz + trkc + kimya + muzik) / lessons;

        System.out.println("Ortalamanız: " + total);

        if (total >= 55) {
            System.out.println("Sınıfı geçtiniz !");
        } else {
            System.out.println("Sınıfta kaldınız ! :(");
        }


    }
}
