package day03__scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {
        // kullanicidan ismini isteyin
        // girilen ismi
        // isminiz :-. ....... seklinde yazdirin


        // 1- Scanner objesi olusturun

        Scanner scan =new Scanner(System.in) ;

        // 2- Kullaniciya ne istedigimizi söyleyelim
        System.out.println("Lütfen isminizi giriniz");

        // 3- olusturdugumuz scan objesi ile kullanicinin girdigi degeri alip
        // olusturacagimiz uygun bir variable a atayalim

        String kullaniciIsmi = scan.next() ;


        System.out.println("isminiz :" + kullaniciIsmi );



    }

}
