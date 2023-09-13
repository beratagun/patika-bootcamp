package DikUcgendeHipotenusBulanProgram;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenleri belirleyelim

        double a,b,c,d,e;

        // Kullanıcıdan veriyi alalım

        Scanner input = new Scanner(System.in);

        System.out.print("A değerini giriniz: ");

        a = input.nextInt();

        System.out.print("B değerini giriniz: ");

        b = input.nextInt();

        System.out.print("C değerini giriniz: ");

        c = input.nextInt();

        // Alanı ve Çevresini Hesaplayalım

        d = ((a+b+c) / 2);

        e = Math.sqrt(d*(d-a)*(d-b)*(d-c));

        System.out.println("Çevresi: " + d*2);

        System.out.println("Alanı: " + e);




    }
}
