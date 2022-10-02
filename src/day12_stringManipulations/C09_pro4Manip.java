package day12_stringManipulations;

import java.util.Scanner;

public class C09_pro4Manip {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        System.out.println("Lutfen isminizi giriniz");
        String isim = scan.nextLine() ;

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scan.nextLine() ;

        System.out.println( "Uzun olan : " + (isim.length() > soyisim.length() ? isim : soyisim) );


    }



}
