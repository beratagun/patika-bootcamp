package UcakBileti;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double amount, ageDiscount, discountedAmount, ticketDiscount, totalAmount;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        int distance = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        int age = input.nextInt();

        System.out.print("Yolculuk tipini seçiniz (1-Tek yön 2-Gidiş dönüş) : ");
        int tripType = input.nextInt();

        amount = distance * 0.10;

        if (distance > 0 && age > 0 && tripType == 1 || tripType == 2) {
            if (age < 12) {
                if (tripType == 2) {
                    ageDiscount = amount * 0.50;
                    discountedAmount = amount - ageDiscount;
                    ticketDiscount = discountedAmount * 0.20;
                    totalAmount = (discountedAmount - ticketDiscount) * 2;
                    System.out.println("Toplam tutar : " + totalAmount);
                }
                if (tripType == 1) {
                    ageDiscount = amount * 0.50;
                    discountedAmount = amount - ageDiscount;
                    totalAmount = discountedAmount;
                    System.out.println("Toplam tutar : " + totalAmount);
                }

            }
            if (age >= 12 && age <= 24) {
                if (tripType == 2) {
                    ageDiscount = amount * 0.10;
                    discountedAmount = amount - ageDiscount;
                    ticketDiscount = discountedAmount * 0.20;
                    totalAmount = (discountedAmount - ticketDiscount) * 2;
                    System.out.println("Toplam tutar : " + totalAmount);
                }
                if (tripType == 1) {
                    ageDiscount = amount * 0.10;
                    discountedAmount = amount - ageDiscount;
                    totalAmount = discountedAmount;
                    System.out.println("Toplam tutar : " + totalAmount);
                }

            }
            if (age > 24 && age < 65) {
                if (tripType == 2) {

                    ticketDiscount = amount * 0.20;
                    totalAmount = (amount - ticketDiscount) * 2;
                    System.out.println("Toplam tutar : " + totalAmount);
                }
                if (tripType == 1) {

                    totalAmount = amount;
                    System.out.println("Toplam tutar : " + totalAmount);

                }
            }
            if (age >= 65) {
                if (tripType == 2) {
                    ageDiscount = amount * 0.30;
                    discountedAmount = amount - ageDiscount;
                    ticketDiscount = discountedAmount * 0.20;
                    totalAmount = (discountedAmount - ticketDiscount) * 2;
                    System.out.println("Toplam tutar : " + totalAmount);
                }
                if (tripType == 1) {
                    ageDiscount = amount * 0.30;
                    discountedAmount = amount - ageDiscount;
                    totalAmount = discountedAmount;
                    System.out.println("Toplam tutar : " + totalAmount);
                }
            }
        } else {
            System.out.println("Hatalı veri girdiniz!");
        }

    }


}
