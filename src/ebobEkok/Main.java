package ebobEkok;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ebob = 0;
        int ekok = 0;
        int i = 1;

        System.out.print("n1 sayısını giriniz : ");
        int n1 = input.nextInt();

        System.out.print("n2  sayısını giriniz : ");
        int n2 = input.nextInt();

        // en küçük sayının hangisi olduğuna karar vererek işlemin yapılması

        if (n1 < n2) {
            while (i <= n1) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }

            System.out.println("En büyük ortak bölen : " + ebob);

        } else {
            while (i <= n2) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
            System.out.println("En büyük ortak bölen : " + ebob);
        }

        System.out.println("========================");

        while (i <= n1 * n2) {                    // aynı işlemin kısayollu gösterimi ---> ekok = (n1 * n2) / ebob;
            if (i % n1 == 0 && i % n2 == 0) {    // ---> System.out.println("En küçük ortak kat : " + ekok);
                ekok = i;
            }
            i++;
        }
        System.out.println("En küçük ortak kat : " + ekok);

    }
}
