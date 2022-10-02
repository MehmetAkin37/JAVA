package day16_forLoop;

import java.util.Scanner;

public class C12_Pro8_Loop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.next() ;


        kelimeninTersi(kelime) ;



    }

    public static void kelimeninTersi(String kelime) {

        String ters = "" ;

        for (int i = kelime.length()-1 ; i >=0; i--) {
            ters = ters + kelime.charAt(i) ;

        }

        System.out.println("Girdiginiz kelimenin tersi :\n" + ters );

    }
}
