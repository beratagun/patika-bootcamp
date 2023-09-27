package week2;

import java.util.Scanner;

public class DizidekiElemanlarınFrekansı {

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

        // Elemanların frekanslarını hesaplamak için bir döngü kullanalım
        int[] frekanslar = new int[n]; // Dizinin elemanları kadar bir frekans dizisi oluşturalım

        for (int i = 0; i < n; i++) {
            int eleman = dizi[i];
            int frekans = 1; // Eleman kendisi için başlangıç frekansı 1 olarak ayarlanır

            for (int j = i + 1; j < n; j++) {
                if (dizi[j] == eleman) {
                    frekans++; // Elemanın tekrar eden bir kopyası bulunduğunda frekans artırılır
                }
            }

            // Elemanın frekansını diziye kaydet
            frekanslar[i] = frekans;

            // Aynı elemanı bir daha işlememek için kontrol
            for (int k = i + 1; k < n; k++) {
                if (dizi[k] == eleman) {
                    dizi[k] = -1; // Eleman işlendi, -1 olarak işaretlenir
                }
            }
        }

        System.out.println("Tekrar Sayıları");
        for (int i = 0; i < n; i++) {
            if (frekanslar[i] != -1) {
                if (dizi[i] != -1) {
                    System.out.println(dizi[i] + " sayısı " + frekanslar[i] + " kere tekrar edildi.");
                }
            }
        }


    }
}
