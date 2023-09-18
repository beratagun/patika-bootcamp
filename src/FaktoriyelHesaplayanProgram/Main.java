package FaktoriyelHesaplayanProgram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n, r;
        int factorialOfn = 1, factorialOfr = 1, factorialOfn_r = 1;

        do {
            System.out.print("n değerini giriniz : ");
            n = inp.nextInt();
            System.out.print("r değerini giriniz : ");
            r = inp.nextInt();

            if (r > n) {
                System.out.println("n değeri r değerinden büyük olmalıdır ");
            }
        }
        while (r > n);

        for (int i = 1; i <= n; i++) {
            factorialOfn *= i;
            if (i <= r) {
                factorialOfr *= i;
            }
            if (i <= n - r) {
                factorialOfn_r *= i;
            }
        }
        int combination = factorialOfn / (factorialOfr * factorialOfn_r);
        System.out.println("Kombinasyon : " + combination);
    }


}
