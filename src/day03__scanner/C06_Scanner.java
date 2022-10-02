package day03__scanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in) ;

        System.out.println("Lütfen isminizi giriniz");
        String isim=scan.nextLine() ;


        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim=scan.nextLine();

        System.out.println("Lütfen yasinizi giriniz");
        double yas=scan.nextDouble() ;

        System.out.println("girilen bilgiler =" +isim+" "+soyisim+" "+yas);




    }

}
