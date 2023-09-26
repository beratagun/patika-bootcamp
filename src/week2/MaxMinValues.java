package week2;

import java.util.Scanner;

public class MaxMinValues {

    public static void main(String[] args) {
        int[] dizi = {5,10,15};
        int girilenSayi;

        Scanner input = new Scanner(System.in);
        System.out.print("Girilen Sayı: ");
        girilenSayi = input.nextInt();

        int enYakinBuyuk = Integer.MAX_VALUE; // En yakın büyük sayıyı başlangıçta en büyük değerle başlat
        int enYakinKucuk = Integer.MIN_VALUE; // En yakın küçük sayıyı başlangıçta en küçük değerle başlat

        for (int sayi : dizi) {
            if (sayi < girilenSayi && sayi > enYakinKucuk) {
                enYakinKucuk = sayi;
            } else if (sayi > girilenSayi && sayi < enYakinBuyuk) {
                enYakinBuyuk = sayi;
            }
        }

        if (enYakinKucuk != Integer.MIN_VALUE) {
            System.out.println("Girilen Sayıdan Küçük En Yakın Sayı: " + enYakinKucuk);
        } else {
            System.out.println("Girilen Sayıdan Küçük En Yakın Sayı Bulunamadı");
        }

        if (enYakinBuyuk != Integer.MAX_VALUE) {
            System.out.println("Girilen Sayıdan Büyük En Yakın Sayı: " + enYakinBuyuk);
        } else {
            System.out.println("Girilen Sayıdan Büyük En Yakın Sayı Bulunamadı");
        }

        input.close();
    }

}
