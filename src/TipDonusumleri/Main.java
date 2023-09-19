package TipDonusumleri;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        // Scanner kullanarak kullanıcıdan bir tam sayı ve ondalıklı sayı alıyoruz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tam sayı girin: ");
        int tamSayi = scanner.nextInt();

        System.out.print("Bir ondalıklı sayı girin: ");
        double ondalikliSayi = scanner.nextDouble();

        // Tam sayıyı ondalıklı sayıya dönüştürerek ekrana yazdırıyoruz
        System.out.println("Tam sayıyı ondalıklı sayıya dönüştürdüğümüzde: " + (double) tamSayi);

        // Ondalıklı sayıyı tam sayıya dönüştürerek ekrana yazdırıyoruz
        int ondalikliSayiTam = (int) ondalikliSayi;
        System.out.println("Ondalıklı sayıyı tam sayıya dönüştürdüğümüzde: " + ondalikliSayiTam);

        scanner.close();


    }
}
