package day16_forLoop;

import java.util.Scanner;

public class C11_Pro7_Loop {

    public static void main(String[] args) {

        // Kullanicidan bir String isteyin ve Stringi tersten yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.next() ;
        String ters = "" ;


        for (int i = kelime.length()-1 ; i >=0; i--) {
            ters = ters + kelime.charAt(i) ;

        }
        System.out.println("Girdiginiz kelimenin tersi :\n" + ters );


    }
}
