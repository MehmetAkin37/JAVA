package day16_Practice;

import java.util.Scanner;

public class Q05_StringManipulastion {

    public static void main(String[] args) {

        // Kullanicidan isim ve soyismini girmesini isteyin
        // ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan = new Scanner(System.in) ;
        System.out.println("Lutfen isminizi ve soyisminizi giriniz \nisim");
        String isim = scan.next() ;
        System.out.println("soyisim");
        String soyisim = scan.next() ;

        if (isim.length() > soyisim.length()) {
            System.out.println("Isminiz soyisminizden uzundur");

        } else if (isim.length() == soyisim.length()){
            System.out.println("Isminiz soyisminizle esit uzunlukta");

        } else {
            System.out.println("Soyisminiz isminizden uzundur");
        }







    }
}
