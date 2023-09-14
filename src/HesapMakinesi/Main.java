package HesapMakinesi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri belirleyelim
        int n1, n2, choose;

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değerleri alalım

        System.out.print("İlk değeri giriniz: ");
        n1 = input.nextInt();

        System.out.print("İkinci değeri giriniz: ");
        n2 = input.nextInt();

        //Kullanıcıya işlem için seçim yaptıralım

        System.out.println("İşlemi seçiniz : \n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        choose = input.nextInt();

        //Seçim sonrası işlemleri yaptıralım

        switch (choose) {
            case 1:
                System.out.print("Toplama sonucu:" + (n1 + n2));
                break;
            case 2:
                System.out.print("Çıkarma sonucu:" + (n1 - n2));
                break;
            case 3:
                System.out.print("Çarpma sonucu:" + (n1 * n2));
                break;
            case 4:
                switch (n2) {
                    case 0:
                        System.out.println("Bir sayı 0'a bölünemez, tekrar deneyiniz.");
                        break;
                    default:
                        System.out.println("Bölme işlemi sonucu = " + (n1 / n2));
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız, tekrar deneyiniz.");

                break;

        }


    }


}


