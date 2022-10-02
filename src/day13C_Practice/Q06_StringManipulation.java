package day13C_Practice;

import java.util.Scanner;

public class Q06_StringManipulation {

    public static void main(String[] args) {

        //Scanner kullanarak iki ayri deger giriniz ve bu iki
        // kelimeyi method kullanarak birlestiriniz.
        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin
        // ilk harflerini atip birlestiriniz.

        Scanner scan = new Scanner(System.in) ;

        System.out.println("Lutfen 1. degeri giriniz");
        String deger1 = scan.nextLine() ;

        System.out.println("Lutfen 2. degeri giriniz");
        String deger2 = scan.nextLine() ;

        System.out.println("Birinci satir : " + (deger1 + " " + deger2));
        //System.out.println("Birinci satir : " + deger1.concat(" " + deger2)); IKINCI YOL




        deger1 = deger1.substring(1) ;
        deger2 = deger2.substring(1) ;

        System.out.println("Ikinci satir : " + deger1 + deger2);



















    }
}
