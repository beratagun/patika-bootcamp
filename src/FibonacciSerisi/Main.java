package FibonacciSerisi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Eleman sayısını giriniz: ");
        int n = input.nextInt();
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println(a + " ");
            int total = a + b;
            a = b;
            b = total;

        }
    }


}
