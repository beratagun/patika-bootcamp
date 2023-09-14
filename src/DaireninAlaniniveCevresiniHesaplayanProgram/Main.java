package DaireninAlaniniveCevresiniHesaplayanProgram;
import java.util.Scanner;
public class Main {
    public static void main(String[]    args){

        //Değişkenleri belirleyelim

        int r , a;
        double pi = 3.14 , sonuc;

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değeleri alalım

        System.out.print("Dairenin yarı çapını giriniz: ");

        r = input.nextInt();

        System.out.print("Merkez açısının ölçüşünü giriniz: ");

        a = input.nextInt();

        //Sonuç için gerekli olan formülü yazalım

        sonuc = (pi * ( r * r ) * a) / 360;

        System.out.println("Daire diliminin alanı: " + sonuc);

    }
}
