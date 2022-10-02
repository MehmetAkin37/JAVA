package day21A_Practice;

import java.util.Scanner;

public class Q04_MetCreationForLoop {

    public static void main(String[] args) {

        /* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString */

        Scanner scan = new Scanner(System.in) ;
        System.out.println("Bir string giriniz");
        String kelime = scan.nextLine() ;



        terstenYaz(kelime) ;


    }

    public static void terstenYaz(String kelime) {

       String tersKelime = "" ;

        for (int i = kelime.length() -1; i >=0; i--) {
            tersKelime += kelime.substring(i,i+1) ;     // veya  tersKelime += kelime.charAt(i) ;

        }

        System.out.println(tersKelime);

    }

}
