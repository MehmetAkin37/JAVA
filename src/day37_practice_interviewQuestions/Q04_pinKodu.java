package day37_practice_interviewQuestions;

import java.util.Scanner;

public class Q04_pinKodu {

    public static void main(String[] args) {

        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
        //bunu kart sifre kontrol de de kullabilirinisz

        String sifre = "erdal.bey123";
        int girisSayisi = 3 ;

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");

        while(true) {
            System.out.println("Sifre gir");
            String girilenSifre = scan.nextLine();

            if (sifre.equals(girilenSifre)) {
                System.out.println("Sifre basarili");
                break;
            } else {
                System.out.println("Sifre yanlis");
                girisSayisi -- ;
                System.out.println("Kalan giris hakki " + girisSayisi);
            }

            if (girisSayisi == 0) {
                System.out.println("Giris hakkin kalmadi, kart bloke oldu " + girisSayisi);
            }

        }

    }

}
