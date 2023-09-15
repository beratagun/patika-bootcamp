package BurcBulanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int month, day;

        String burc = "";

        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı giriniz: ");
        month = input.nextInt();

        System.out.print("Doğduğunuz günü giriniz: ");
        day = input.nextInt();

        if (day >= 1 && day <= 31) {

            if (month == 1) {
                if (day < 22) {
                    burc = "Oğlak";
                } else {
                    burc = "Kova";
                }
            } else if (month == 2) {
                if (day < 20) {
                    burc = "Kova";

                } else {
                    burc = "Balık";
                }
            } else if (month == 3) {
                if (day < 21) {
                    burc = "Balık";

                } else {
                    burc = "Koç";
                }
            } else if (month == 4) {
                if (day < 21) {
                    burc = "Koç";

                } else {
                    burc = "Boğa";
                }
            } else if (month == 5) {
                if (day < 22) {
                    burc = "Boğa";

                } else {
                    burc = "İkizler";
                }
            } else if (month == 6) {
                if (day < 23) {
                    burc = "İkizler";

                } else {
                    burc = "Yengeç";
                }
            } else if (month == 7) {
                if (day < 23) {
                    burc = "Yengeç";

                } else {
                    burc = "Aslan";
                }
            } else if (month == 8) {
                if (day < 23) {
                    burc = "Aslan";

                } else {
                    burc = "Başak";
                }
            } else if (month == 9) {
                if (day < 23) {
                    burc = "Başak";

                } else {
                    burc = "Terazi";
                }
            } else if (month == 10) {
                if (day < 20) {
                    burc = "Terazi";

                } else {
                    burc = "Akrep";
                }
            } else if (month == 11) {
                if (day < 22) {
                    burc = "Akrep";

                } else {
                    burc = "Yay";
                }
            } else if (month == 12) {
                if (day < 22) {
                    burc = "Yay";

                } else {
                    burc = "Oğlak";
                }
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("Hatalı gün girişi yaptınız! ");
        } else {
            System.out.println("Burcunuz: " + burc);
        }


    }

}
