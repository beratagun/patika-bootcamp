package week2;

import java.util.Scanner;

public class usluSayiHesaplama {

    public static long calculateExponent(long base, long exponent) {
        if (exponent == 1) {
            return base;
        }
        return base * calculateExponent(base, exponent - 1); //Örnek vermek gerekirse 2^3 ü bulmak için 2*2^2 işlemini yaptırıyoruz.
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        long base, exponent;
        System.out.print("Bir sayı giriniz: ");
        base = input.nextLong();

        System.out.print("Üssünü giriniz: ");
        exponent = input.nextLong();

        System.out.println(base + "^" + exponent + " = " + calculateExponent(base, exponent));

    }
}
