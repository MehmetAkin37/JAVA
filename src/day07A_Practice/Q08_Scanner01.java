package day07A_Practice;

import java.util.Scanner;

public class Q08_Scanner01 {


    // kullanicidan 2 tam sayi alin
    // bu tam sayilari toplayin ve sonucu yazdirin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;

        System.out.print("Lutfen birinci sayiyi giriniz : ");
        int sayi1 = scan.nextInt() ;

        System.out.print("Lutfen ikinci sayiyi giriniz : 10");
        int sayi2 = scan.nextInt() ;

        System.out.println("Iki sayinin toplami : " + (sayi1 + sayi2));




    }

}
