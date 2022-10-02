package day03__scanner;

import java.util.Scanner;

public class C10_ScannerPro {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in) ;

        System.out.println("Lutfen bir sayi giriniz");
        double sayi=scan.nextDouble() ;

        System.out.println("Karenin cevresi :" + sayi * 4);
        System.out.println("Karenin alani :" + sayi * sayi);



    }


}
