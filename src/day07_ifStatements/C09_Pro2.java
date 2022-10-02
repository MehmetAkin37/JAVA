package day07_ifStatements;

import java.util.Scanner;

public class C09_Pro2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        System.out.println("Lutfen bir karakter girin");
        char harf = scan.next().charAt(0) ;


        if (harf >= 'a' && harf <= 'z' || harf >= 'A' && harf <= 'Z') {
            System.out.println("Bu bir harftir");

        } else {
            System.out.println("Bu bir harf degildir");
        }


    }



}
