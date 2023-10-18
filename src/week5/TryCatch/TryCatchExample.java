package week5.TryCatch;

import java.util.Arrays;
import java.util.Scanner;

public class TryCatchExample {

    public static void main(String[] args) {
        tryCatchMethod();
    }

    public static void tryCatchMethod() {
        Scanner scan = new Scanner(System.in);
        int[] numbers = {25, 8, 35, 26, 70, 92, 73, 14, 3, 48};
        System.out.println("Sayı dizisi: " + Arrays.toString(numbers));

        int input;

        try {
            System.out.print("Lütfen 1 ile 10 arasında bir sayı giriniz: ");
            input = scan.nextInt();
            System.out.println("Dizideki " + input + " nolu değer: " + numbers[input - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: Geçersiz indeks! 1 ile 10 arasında bir sayı girmelisiniz.");
        }
    }
}