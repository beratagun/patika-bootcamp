package week6.DosyadanSayilariOkumaveToplama;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        try {
            FileReader input = new FileReader("C:/Users/Berat/Desktop/patika-bootcamp/javaAssignment/src/week6/DosyadanSayilariOkumaveToplama/numbers.txt");
            BufferedReader bufferedReader = new BufferedReader(input);
            String line = bufferedReader.readLine();
            int sum = 0;
            int i;

            while (line != null) {
                System.out.println(line);
                i = Integer.parseInt(line);
                line = bufferedReader.readLine();
                sum = sum + i;
            }
            System.out.println("toplam: " + sum);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}