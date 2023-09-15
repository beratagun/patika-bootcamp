package HavaSicakligiEtkinlikOnerme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Değişkeni belirleyelim

        int heat;

        //Sıcaklığı alalım
        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklığı giriniz: ");
        heat = input.nextInt();

        //Sıcaklık koşullarına göre etkinliği önermesini sağlayalım

        if (heat <= 5) {

            System.out.println("Kayak yapabilirsiniz.");

        } else if (heat <= 14) {

            System.out.println("Sinemaya gidebilirsiniz.");

        } else if (heat == 15) {

            System.out.println("Sinemaya veya pikniğe gidebilirsiniz.");

        } else if (heat <= 25) {

            System.out.println("Pikniğe gidebilirsiniz.");

        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }


    }
}
