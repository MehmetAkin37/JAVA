package day07_ifStatements;

import java.util.Scanner;

public class C08_Pro1 {

        public static void main(String[] args) {

                Scanner scan = new Scanner(System.in) ;
                System.out.println("Lutfen kenar uzunluklarini giriniz");
                double sayi1 = scan.nextDouble() ;
                double sayi2 = scan.nextDouble() ;



               if (sayi1 <=0 || sayi2 <= 0) {
                       System.out.println("Lutfen sifirdan buyuk bir sayi giriniz");

               } else if (sayi1 == sayi2) {
                       System.out.println("Bu bir karedir");

               } else {
                       System.out.println("Bu bir dikdortgendir");
               }


        }

        }
