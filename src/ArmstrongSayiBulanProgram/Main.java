package ArmstrongSayiBulanProgram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: : ");
        int number = scanner.nextInt();

        int total = 0;
        int remainder;

        while (number != 0) {
            remainder = number % 10;
            total += remainder;
            number /= 10;
        }

        System.out.println("Basamakların toplamı " + total);
    }


}
