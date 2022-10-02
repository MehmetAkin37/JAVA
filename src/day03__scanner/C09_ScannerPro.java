package day03__scanner;

import java.util.Scanner;

public class C09_ScannerPro {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in) ;

        System.out.println("Lutfen birinci sayiyi giriniz");
        double sayi1=scan.nextDouble() ;

        //int sayi1=scan.nextInt() ;

        System.out.println("Lutfen ikinci sayiyi giriniz");
        double sayi2=scan.nextDouble() ;


        //int sayi2=scan.nextInt() ;

        System.out.println("Sayilarin toplami :" + (sayi1 + sayi2));

        System.out.println("Sayilarin farki :" +(sayi1 - sayi2));

        System.out.println("Sayilarin carpimi :" +(sayi1 * sayi2));


    }

}
