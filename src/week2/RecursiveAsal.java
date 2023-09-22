package week2;

import java.util.Scanner;

public class RecursiveAsal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        scanner.close();

        if (isAsal(sayi, sayi - 1)) {
            System.out.println(sayi + " asal bir sayıdır.");
        } else {
            System.out.println(sayi + " asal bir sayı değildir.");
        }
    }

    // Recursive olarak asal sayı kontrolü yapan metot
    public static boolean isAsal(int sayi, int bolen) {
        if (bolen <= 1) {
            return true;
        } else {
            if (sayi % bolen == 0) {
                return false;
            } else {
                return isAsal(sayi, bolen - 1);
            }
        }
    }


}
