package week2;

import java.util.Scanner;
import java.util.Arrays;

public class DiziyiKucuktenBuyugeSiralama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz: ");
        int n = scanner.nextInt();

        int[] dizi = new int[n];

        System.out.println("Dizinin elemanlarını giriniz:");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı: ");
            dizi[i] = scanner.nextInt();
        }

        Arrays.sort(dizi);
        System.out.println("Sıralama: " + Arrays.toString(dizi));


    }
}
