package day08_IfStatements;

import java.util.Scanner;

public class C08_Pro2IfElseIf {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in) ;
        System.out.println("Lutfen teklifi giriniz");
        int teklif = scan.nextInt() ;

        if (teklif <= 60000) {
            System.out.println("Maalesef kabul edemem");

        } else if (teklif <=80000) {
            System.out.println("Konusabiliriz");

        } else {
            System.out.println("Kabul ediyorum");
        }


    }
}
