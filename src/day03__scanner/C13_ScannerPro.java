package day03__scanner;

import java.util.Scanner;

public class C13_ScannerPro {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in) ;

        System.out.println("Lutfen isminizi giriniz");
        String isim=scan.next() ;


        System.out.println("Lutfen soyisminizi giriniz");
        String soyIsim =scan.next() ;

        System.out.println("Isminiz : " + isim.substring(0, 1).toUpperCase() + isim.substring(1));
        System.out.println("Soyisminiz : " + soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1));
        System.out.println("Kursumuza katiliminiz alinmistir,tesekkur ederiz");



    }



}
