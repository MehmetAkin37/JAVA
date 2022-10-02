package day16_forLoop;

import java.util.Scanner;

public class C14_Pro11_Loop {

    public static void main(String[] args) {

        // Kullanicidan 10 dan kucuk bir tamsayi isteyin ve girilen sayinin faktoriyelini bulun.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi =scan.nextInt() ;
        int faktoryel = 1;

        for (int i = 1; i <= sayi ; i++) {

            faktoryel *=i ;  // faktoryel = (faktoryel*i) ;

        }
        System.out.println("Faktoriyel degeri : " + faktoryel);

















    }


}
