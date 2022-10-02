package day03__scanner;

import java.util.Scanner;

public class C15_ScannerProDataTür {


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in) ;

        System.out.println("Lutfen isminizi giriniz");
        String isim=scan.next() ;


        System.out.println("Isminizin ilk harfi : " + isim.substring(0,1));





    }
}
