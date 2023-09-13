package TaksimetreProgrami;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double kilometre,tutar;

        Scanner input = new Scanner(System.in);

        System.out.print("KM değerini giriniz: ");

        kilometre = input.nextDouble();

        tutar = (kilometre * 2.20);

        tutar += 10;

        tutar = (tutar < 20) ? 20 : tutar;

        System.out.print("Toplam tutar " + tutar);


    }
}
