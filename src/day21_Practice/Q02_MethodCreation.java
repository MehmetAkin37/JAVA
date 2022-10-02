package day21_Practice;

import java.util.Scanner;

public class Q02_MethodCreation {

    public static void main(String[] args) {

        /*
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
      */
/*
        Scanner scan = new Scanner(System.in) ;
        System.out.println("metre ve km ye donusturmek istediginiz cm degerini giriniz");
        double sayi1 = scan.nextDouble() ;
        double sayi2 ;
        double sayi3 ;


          // km dm hm m dm cm mm

        sayi2 = sayi1 / 100 ;
        sayi3 = sayi1 /100000 ;

        System.out.println(sayi1 + "cm = " + sayi2 + " m" );
        System.out.println(sayi1 + "cm = "+ sayi3 +" km");
        */


        Scanner scan = new Scanner(System.in) ;
        System.out.println("metre ve km ye donusturmek istediginiz cm degerini giriniz");
        double santimetreValue = scan.nextDouble() ;

        convertSM(santimetreValue) ;

    }

    private static void convertSM(double santimetreValue) {

        double meter = santimetreValue / 100 ;
        double kMeter = santimetreValue / 100000 ;
        System.out.println("Girdiginiz santimetre degeri : " + santimetreValue + " \n" +
                          meter + " metredir," + kMeter + " km 'dir.");

    }
}
