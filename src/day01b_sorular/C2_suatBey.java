package day01b_sorular;

import java.util.Scanner;

public class C2_suatBey {

    public static void main(String[] args) {

        /*
          Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
           tamkare ise true  değilse false yazdırınız.
            Not: sqrt gibi fonksiyonları  kullanmayın.
            Example 1:
            Input: 16
            Output: true
            Not: bu sayı tamkare çünkü 4*4 = 16
            Example 2:
            Input: 25
            Output: true
            Note: bu sayı tamkare çünkü 5*5=25
            Example 3:
            Input: 14
            Output: false*/

        int i = 0;
        int sayac = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = input.nextInt();

        for (i = 0; i <= sayi/2 + 1 ; i++) {   //    1  1+1  4  2 2
            // 9
            // 3 3
            // 16    25        16   1 2 3 4 ... 9 10 11 12


            if (sayi == i * i) {
                sayac = 1;
                break;
            }
        }

        if (sayac != 0)
            System.out.println("true");

        else {
            System.out.println("false");

        }





    }

}
