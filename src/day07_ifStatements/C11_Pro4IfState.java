package day07_ifStatements;

import java.util.Scanner;

public class C11_Pro4IfState {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        System.out.println("Lutfen ücgenin üc kenar uzunlugunu giriniz");
        double kenar1 = scan.nextDouble() ;
        double kenar2 = scan.nextDouble() ;
        double kenar3 = scan.nextDouble() ;


        if (kenar1 == kenar2 && kenar2 == kenar3) {
            System.out.println("Eskenar ucgen");

        } else {

            System.out.println("Eskenar degil");
        }


    }
}
