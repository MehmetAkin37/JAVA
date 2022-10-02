package day11_StringManipulations;

import java.util.Scanner;

public class C08_pro1Manip {

    public static void main(String[] args) {

        String cumle ="Korkma sonmez bu safaklarda yuzen al sancak." ;
        Scanner scan = new Scanner(System.in) ;
        System.out.println("Lutfen bir harf giriniz") ;
        char harf = scan.nextLine().charAt(0);

         int harfIndex = cumle.indexOf(harf) ;

         if (harfIndex == -1) {
             System.out.println("Girdiginiz harf cumlede yoktur");

         } else {
             System.out.println("Girdiginiz harf cumlede vardir");
         }

    }
}
