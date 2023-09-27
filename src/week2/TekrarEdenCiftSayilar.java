package week2;

public class TekrarEdenCiftSayilar {

    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 5, 2, 6, 7, 8, 9, 3};

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 0) { // Eğer sayı çift ise if koşulunun içine giriyor
                boolean tekrarVar = false;

                // İkinci bir iç döngü ile, dizinin geri kalanınında tekrar ettiği bir yer varmı diye kontrol ediyoruz
                for (int j = i + 1; j < dizi.length; j++) {
                    if (dizi[i] == dizi[j]) {
                        tekrarVar = true;
                        break;
                    }
                }

                // Eğer tekrar eden bir sayı bulunduysa, ekrana yazdır
                if (tekrarVar) {
                    System.out.println(dizi[i] + "çift sayısı tekrar ediyor.");
                }
            }
        }
    }
}
