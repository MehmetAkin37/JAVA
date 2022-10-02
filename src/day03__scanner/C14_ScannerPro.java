package day03__scanner;

import java.util.Scanner;

public class C14_ScannerPro {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in) ;
        System.out.println("Lutfen isminizi ve soyisminizi giriniz");


        String isim=scan.next() ;
        String soyIsim=scan.next() ;

        System.out.println("Isim - soyisim : " + (isim.substring(0,1).toUpperCase() + isim.substring(1)) +
                " " + (soyIsim.substring(0,1).toUpperCase() + soyIsim.substring(1))) ;



    }



}
