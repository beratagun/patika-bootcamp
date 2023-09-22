package week2;

import java.util.Scanner;

public class RecursiveEklemeCikarma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Bir N değeri giriniz: ");
        int number = input.nextInt();

        decreaseFigure(number, number);
    }


    static int decreaseFigure(int number, int tempNumber) {
        System.out.print(number + " ");
        if (number > 0) {
            number -= 5;
            return decreaseFigure(number, tempNumber);
        } else {
            increaseFigure(number, tempNumber);
        }
        return number; //return koşulları işlevsel değildir
    }

    static int increaseFigure(int number, int tempNumber) {
        if (number < tempNumber) {
            number += 5;
            System.out.print(number + " ");
            return increaseFigure(number, tempNumber);
        } else return number; //return koşulları işlevsel değildir
    }
}
