package ManavKasaProgrami;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenleri tanımlayalım

        double toplam, kg, armut ,elma ,domates ,muz ,patlican;

        //Kullanıcıdan verileri alıp kilogram fiyatlarıyla çarparak toplam tutarı bulalım

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kilogram armut aldınız?: ");

        kg = input.nextDouble();

        armut = kg * 2.14;

        System.out.print("Kaç kilogram elma aldınız?: ");

        kg = input.nextDouble();

        elma = kg * 3.67;

        System.out.print("Kaç kilogram domates aldınız?: ");

        kg = input.nextDouble();

        domates = kg * 1.11;

        System.out.print("Kaç kilogram muz aldınız?: ");

        kg = input.nextDouble();

        muz = kg * 0.95;

        System.out.print("Kaç kilogram patlıcan aldınız?: ");

        kg = input.nextDouble();

        patlican = kg * 5;

        //Toplam tutarı bulup kullanıcıya çıktı verelim

        toplam = armut+elma+domates+muz+patlican;

        System.out.print("Toplam tutar: " + toplam);


    }


}
