package day03__scanner;

import java.util.Scanner;

public class C12_ScannerPro {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in) ;
        System.out.println("Lutfen uzun kenari , kisa kenari ve yükseklik degerlerini giriniz");

        int a=scan.nextInt() ;
        int b=scan.nextInt() ;
        int h=scan.nextInt() ;

        System.out.println("Prizmanin hacmi :" + a*b*h);


    }

}
