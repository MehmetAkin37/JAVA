package day01cProjeler;

import java.util.Scanner;

public class C11_Koln2 {


    static String sehir;
    static int tutar = 0;
    static int frankfurtKm = 60;
    static int kolnKm = 80;
    static int kmBirimFiyat = 5;
    static int islem = 20;


    static Scanner scan = new Scanner(System.in);

    // sehir = sehir.toUpperCase();


    public static void main(String[] args) {

        System.out.println("Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM, Köln : 80 KM " +
                "(20 KM başına 5 euro bilet parası alınmaktadir..)");

        sehirSec();

    }

    public static void sehirSec() {

        sehir = scan.nextLine();

        if (sehir.equalsIgnoreCase("Frankfurt")) {

            tutar = frankfurtKm * kmBirimFiyat / islem;

            System.out.println(sehir + ": Rota = Frankfurt");
            System.out.println("Frankfurt " + tutar + " Euro");


        } else if (sehir.equalsIgnoreCase("Koln")) {

            tutar = kolnKm * kmBirimFiyat / islem;

            System.out.println(sehir + ": Rota = Koln");
            System.out.println("Koln " + tutar + " Euro");

        }


        kisiSec();
        ikiKisi();

    }


    public static void kisiSec() {

        System.out.println("Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):");
        int kisi = scan.nextInt();

        if (kisi == 1) {
            System.out.println("1 kisilik");
            sehirSec();

        } else if (kisi == 2) {
            System.out.println("2 kisilik");
            ikiKisi();


        }


    }

    public static void ikiKisi() {


        sehir = scan.nextLine();

        if (sehir.equalsIgnoreCase("Frankfurt")) {

            tutar = 2 * frankfurtKm * kmBirimFiyat / islem;

            System.out.println(sehir + ": Rota = Frankfurt");
            System.out.println("Frankfurt " + tutar + " Euro");


        } else if (sehir.equalsIgnoreCase("Koln")) {

            tutar = 2 * kolnKm * kmBirimFiyat / islem;

            System.out.println(sehir + ": Rota = Koln");
            System.out.println("Koln " + tutar + " Euro");


        }

    }
}