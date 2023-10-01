package MayinTarlasi;

import java.util.ArrayList;
import java.util.Scanner;

public class MineSweeper {

    private int rowNumber, colNumber, size;
    private String[][] board; // Mayınların bulunduğu harita
    private String[][] map; // Oyuncunun gördüğü harita
    private int totalMines;
    private boolean game = true;
    private boolean isGameSuccesfullyFinished = false; // Oyunun başarıyla bitip bitmediğini kontrol etmek için boolean oluşturduk
    Scanner input = new Scanner(System.in);

    MineSweeper(int rowNumber, int colNumber) {
        this.colNumber = colNumber;
        this.rowNumber = rowNumber;
        this.size = colNumber * rowNumber;
    }

    public void run() {
        int selectedRow, selectedCol;
        makeBoard();
        System.out.println("Oyun başlıyor iyi eğlenceler ! ");
        printBoard();
        System.out.println("------------------------------");
        printMap();

        while (game) {
            System.out.print("Satır giriniz: ");
            selectedRow = input.nextInt();
            System.out.print("Sütun giriniz: ");
            selectedCol = input.nextInt();
            System.out.println("------------------------------");
            // Kullanıcının girdiği koordinatların geçerli olup olmadığını kontrol ediyoruz
            if ((selectedRow < 0 || selectedRow >= rowNumber) || (selectedCol < 0 || selectedCol >= colNumber)) {
                System.out.println("Geçersiz bir koordinat girdiniz. Lütfen tekrar giriniz.");
            } else {
                // Kullanıcının hamlesini gerçekleştiriyoruz ve haritayı güncelliyoruz
                turn(selectedRow, selectedCol);
                printMap();
                System.out.println("------------------------------");

                // Kazanma durumu kontrolü her hamle sonrasında yapıyoruz
                checkGameIsSuccesfullyFinished();
                // Duruma göre uygun mesajları gösteriyoruz
                if (!game) {
                    if (isGameSuccesfullyFinished) {
                        System.out.println("Tebrikler oyunu kazandınız!");
                    } else {
                        System.out.println("Mayına bastınız oyunu kaybettiniz. Game over ! ");
                    }
                }


            }
        }
    }

    private void makeBoard() {
        this.board = new String[rowNumber][colNumber];
        map = new String[rowNumber][colNumber];
        totalMines = (size / 4);
        generateMap();
        generateMines();
    }

    private void generateMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = "-0";  // Oyuncunun görüntülediği harita
            }
        }
    }

    // Rastgele mayınları tahtaya yerleştiriyoruz

    private void generateMines() {
        int generatedMineCounter = 0;
        do {
            int mineXLocation = (int) (Math.random() * rowNumber);
            int mineYLocation = (int) (Math.random() * colNumber);
            if (board[mineXLocation][mineYLocation] != "*") {
                generatedMineCounter++;
                board[mineXLocation][mineYLocation] = "*";
            }
        } while (generatedMineCounter < totalMines); //size/4 olarak bulduğumuz total mine kadar mayın koyuyoruz
    }

    // Oyunun başarıyla bitip bitmediğini kontrol ediyoruz

    private void checkGameIsSuccesfullyFinished() {

        int remainingEmptyCells = 0;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j].equals("-0")) {
                    remainingEmptyCells++;
                }
            }
        }

        if (remainingEmptyCells == totalMines) {
            isGameSuccesfullyFinished = true;
            game = false;
        }
    }

    private void turn(int selectedRow, int selectedCol) {
        if (board[selectedRow][selectedCol] == "*") {
            game = false;  // Mayına basıldığında oyunu kaybeder
        } else {
            int mineCount = 0;

            ArrayList<Integer> xLocation = new ArrayList<Integer>();
            ArrayList<Integer> yLocation = new ArrayList<Integer>();

            xLocation.add(selectedRow);

            if (selectedRow != 0) {
                xLocation.add(selectedRow - 1);
            }
            if (selectedRow != rowNumber - 1) {
                xLocation.add(selectedRow + 1);
            }

            yLocation.add(selectedCol);

            if (selectedCol != 0) {
                yLocation.add(selectedCol - 1);
            }
            if (selectedCol != colNumber - 1) {
                yLocation.add(selectedCol + 1);
            }
            for (int i = 0; i < xLocation.size(); i++) {
                for (int j = 0; j < yLocation.size(); j++) {
                    int x = xLocation.get(i);
                    int y = yLocation.get(j);
                    mineCount = board[x][y] == "*" ? mineCount + 1 : mineCount;
                }
            }
            map[selectedRow][selectedCol] = Integer.toString(mineCount); // Seçilen konumda etrafındaki mayın sayısını almak için

        }

    }

    private void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == "*") {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }

    private void printMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
