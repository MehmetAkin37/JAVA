package day13C_Practice;

import java.util.Scanner;

public class Q08_StringManipulation {

    public static void main(String[] args) {

        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */

        Scanner scan = new Scanner(System.in) ;
        System.out.println("Lutfen bir kelime giriniz");
        String str = scan.nextLine() ;




        if (str.length() >= 3){

           String str1 = str.substring(str.length() -2) ;
            System.out.println(str1 + str1 + str1);

        } else {
            System.out.println(str);

        }


    }
}
