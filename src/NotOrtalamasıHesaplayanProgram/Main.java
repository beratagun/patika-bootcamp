package NotOrtalamasıHesaplayanProgram;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        // Değişkenleri oluşturdum
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfını tanımladım
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan notların değerlerini alalım
        System.out.print("Matematik Notunuzu Giriniz: ");

        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");

        fizik = input.nextInt();

        System.out.print("Kimya Notunuzu giriniz: ");

        kimya = input.nextInt();

        System.out.print("Turkce Notunuzu giriniz: ");

        turkce = input.nextInt();

        System.out.print("Tarih Notunuzu giriniz: ");

        tarih = input.nextInt();

        System.out.print("Muzik Notunuzu giriniz: ");

        muzik = input.nextInt();

        // Notları toplayacak değişkeni yazalım

        int sonuc = (mat+fizik+kimya+turkce+tarih+muzik);

        // Ortalamayı alacak değişkeni yazalım

        int ort = (sonuc/6);

        // Not ortalaması 60'dan büyük olması durumunda çıktı verecek koşulu yazalım


        System.out.println("Ortalamanız " + ort );

        System.out.println(ort > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");


    }
}
