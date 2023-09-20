package VucutKitleIndeksiHesaplama;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenleri belirleyelim

        double boy,kilo,result;

        //Kullanıcıdan verileri alalım

        Scanner input = new Scanner(System.in);

        System.out.print("Metre cinsinden boyunuzu giriniz: ");

        boy = input.nextDouble();

        System.out.print("Kilonuzu giriniz: ");

        kilo = input.nextDouble();

        //Formülü yazalım

        result = kilo / (boy*boy);

        System.out.print("Vücüt kitle indeksiniz: " + result);

    }
}
