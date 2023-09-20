package yildizlarlaElmas;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısını girin :");
        int n = input.nextInt();

        for (int i = 1; i < n / 2; i++) {
            for (int j = 1; j <= (n / 2) - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = (n / 2); i >= 0; i--) {
            for (int j = 0; j <= (n / 2) - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
