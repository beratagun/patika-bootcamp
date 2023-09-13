package KDVTutariHesaplayanProgram;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Değişkenleri belirleyelim
        double fiyat, kdvTutari, kdvOrani;

        // Scanner sınıfını tanımlayalım

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan ürünün fiyatını alalım

        System.out.print("Ürünün fiyatını giriniz: ");

        fiyat = input.nextDouble();


        // Girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        // tutar 1000 TL'den büyük ise KDV oranını %8 olarak
        // KDV tutarı hesaplayan koşulu yazalım.

        kdvOrani = (fiyat<1001) ? 0.18 : 0.08;

        kdvTutari = (fiyat * kdvOrani);

        System.out.println(kdvOrani + " KDV oranı.");

        System.out.println(kdvTutari + " KDV tutarı.");

        fiyat += (fiyat * kdvOrani );

        System.out.println(fiyat + " KDV'li toplam tutarı. ");



      }
    }

