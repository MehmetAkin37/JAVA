package day16_forLoop;

import java.util.Scanner;

public class C13_Pro9_Loop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.next() ;
        String ters = "" ;



        for (int i = kelime.length()-1 ; i >=0; i--) {
            ters = ters + kelime.charAt(i) ;
        }

            if (kelime.equalsIgnoreCase(ters) == true ){
                System.out.println("Kelime palindromedir");

            } else {
                System.out.println("Kelime palindrome degildir");
            }





    }

}
