package day12_stringManipulations;

import java.util.Scanner;

public class C08_pro3Manip {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        System.out.println("Lutfen bir isim giriniz");
        String isim = scan.nextLine() ;


        if (isim.contains("a")){
            System.out.println("Girdiginiz isim a harfi iceriyor");

        } else if (isim.contains("Z")) {
            System.out.println("Girdiginiz isim Z harfi iceriyor");

        } else {
            System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
        }


    }
}
