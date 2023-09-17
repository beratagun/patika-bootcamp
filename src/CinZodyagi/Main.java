package CinZodyagi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String horoscope = "";
        boolean isError = false;

        System.out.print("Doğum yılınızı giriniz : ");
        int dateOfBirth = input.nextInt();

        int number = dateOfBirth % 12;

        switch (number) {
            case 0 -> horoscope = "Maymun";
            case 1 -> horoscope = "Horoz";
            case 2 -> horoscope = "Köpek";
            case 3 -> horoscope = "Domuz";
            case 4 -> horoscope = "Fare";
            case 5 -> horoscope = "Öküz";
            case 6 -> horoscope = "Kaplan";
            case 7 -> horoscope = "Tavşan";
            case 8 -> horoscope = "Ejderha";
            case 9 -> horoscope = "Yılan";
            case 10 -> horoscope = "At";
            case 11 -> horoscope = "Koyun";
            default -> isError = true;
        }

        if (isError) {
            System.out.println("Hatalı giriş yaptınız!.");
        } else {
            System.out.println("Çin zodyağınız : " + horoscope);
        }

    }

}



