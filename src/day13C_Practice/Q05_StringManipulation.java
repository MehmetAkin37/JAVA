package day13C_Practice;

import java.util.Scanner;

public class Q05_StringManipulation {

    public static void main(String[] args) {

        //Kullanicidan ismini ve soyisimi girmesini isteyin,
        // sonrasinda konsola tam ismini buyuk harfler ile yazdirin

        Scanner scan = new Scanner(System.in) ;
        System.out.println("Lutfen isminizi ve soyisminizi giriniz");
        String isimsoyisim = scan.nextLine() ;

        isimsoyisim = isimsoyisim.toUpperCase() ;

        System.out.println("isimsoyisim = " + isimsoyisim);

       //  System.out.println("isimsoyisim = " + isimsoyisim.toUpperCase()); boyle de yazdirabiliriz


        /*
         Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz");
        String firstName = scan.nextLine() ;
        String lastName = scan.nextLine() ;

        String fullName = firstName.concat(" " + lastName).toUpperCase() ;
        System.out.println("fullName = " + fullName);







         */










    }
}
