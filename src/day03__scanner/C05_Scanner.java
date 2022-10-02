package day03__scanner;

import java.util.Scanner;

public class C05_Scanner {


    public static void main(String[] args) {
        /*
        Kullanicidan iki sayi alip bu sayilarin carpimini yazdirin

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ilk sayiyi girin");
        double sayi1 =scan.nextDouble() ;


        System.out.println("Lütfen ikinci sayiyi giriniz");
         double sayi2 = scan.nextDouble() ;

        System.out.println("Girilen sayilarin carpimi" + sayi1*sayi2);

    }

}
