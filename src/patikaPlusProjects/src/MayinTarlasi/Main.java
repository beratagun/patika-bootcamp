package MayinTarlasi;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Mayın tarlası oyununa hoşgeldiniz!");
        System.out.println("Haritanın boyutunu belirleyin.");

        //Dizi (matris) boyutu kullanıcıdan alıyoruz
        System.out.print("Satır sayısını giriniz: ");
        int row = input.nextInt();
        System.out.print("Sütun sayısını giriniz: ");
        int col = input.nextInt();
        System.out.println("------------------------------------");

        MineSweeper mine = new MineSweeper(row,col);
        mine.run();
    }



}
