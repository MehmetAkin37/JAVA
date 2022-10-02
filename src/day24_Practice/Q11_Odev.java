package day24_Practice;

import java.util.Scanner;

public class Q11_Odev {

    public static void main(String[] args) {

        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        String pin = "mehmet.1234";
        int girisHakki = 3;

        Scanner scan = new Scanner(System.in);
        System.out.println("*******HOSGELDINIZ*********");

        while (true) {
            System.out.println("Pin kodunuzu giriniz");
            String girilenPin = scan.nextLine();

            if (pin.equals(girilenPin)) {
                System.out.println("Basarili giris yaptiniz...");
                break;

            } else {
                System.out.println("Yanlis giris yaptiniz");
                girisHakki--;
                System.out.println("Kalan giris hakkiniz : " + girisHakki);

            }
            if (girisHakki == 0) {
                System.out.println("Giris hakkiniz kalmadi .. bloklandiniz...");
                break;
            }

        }

    }
}
