package KullaniciGirisi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String userName, password, choice, newPassword;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adını giriniz: ");
        userName = input.nextLine();

        System.out.print("Şifreyi giriniz: ");
        password = input.nextLine();

        if (userName.equals("beratagun") && password.equals("bagun")) {

            System.out.print("Tebrikler giriş yaptınız! ");

        } else if (!(userName.equals("beratagun"))) {
            System.out.print("Hatalı kullanıcı adı! Lütfen bilgileri kontrol edip tekrar deneyiniz.");

        } else if (!(password.equals("bagun"))) {
            System.out.print("Şifre yanlış! ");
            System.out.println("Şifrenizi sıfırlamak ister misiniz ?\n1-Evet\n2-Hayır");

            choice = input.nextLine();
            if (choice.equals("1")) {
                System.out.print("Yeni şifre giriniz: ");

                newPassword = input.nextLine();

                if (!newPassword.equals("bagun")) {

                    System.out.print("Yeni Şifre Oluşturuldu.");

                    password = newPassword;

                } else {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");

                }

            } else {
                System.out.print("Şifreyi sıfırlamak istemediniz.İyi günler.");
            }


        }

    }
}
