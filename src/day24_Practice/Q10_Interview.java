package day24_Practice;

import java.util.Scanner;

public class Q10_Interview {

    public static void main(String[] args) {


        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz");
        String input = scan.nextLine();

        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        ilkSonHarf(input,sayi) ;

        System.out.println(ilkSonHarf(input,sayi));


    }

    private static String ilkSonHarf(String input, int sayi) {    // input yrn str,sayi yrn n yazabiliriz

        String s = input.substring(0,1) + input.substring(input.length() - 1);
        String sonuc = "" ;

        for (int i = 1; i <=sayi ; i++) {
            sonuc += s;

        }
       return sonuc;
    }


}
