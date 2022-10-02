package day13_extra;

import java.util.Scanner;

public class C01_extra1 {

    public static void main(String[] args) {

        /*
        Bir dükkan, satın alınan miktarın maliyeti 1000'den
        fazlaysa% 10 indirim yapacaktır. Kullanıcıdan miktar
        isteyin Varsayalım, bir birim 100'e mal olacak.
         Kullanıcı için toplam maliyeti yargılayın ve yazdırın.

         */

        Scanner scan = new Scanner(System.in) ;
        System.out.println("Lutfen kac tane urun aldiginizi giriniz");
        int sayi = scan.nextInt() ;

        int x = sayi*100 ;

        if (x >1000) {
            System.out.println("Indirimli maliyetiniz : " + (sayi*100*0.9));

        } else if (x >=100 && x <=1000){
            System.out.println("Indirimsiz maliyetiniz : " + sayi*100);

        } else {
            System.out.println("Lutfen gecerli bir sayi giriniz");
        }



    }
}
