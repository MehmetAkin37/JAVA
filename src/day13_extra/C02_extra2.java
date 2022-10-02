package day13_extra;

import java.util.Scanner;

public class C02_extra2 {

    public static void main(String[] args) {

        /*
          Bir öğrencinin devam oranı %75'in altında olması durumunda
          sınava girmesine izin verilmeyecektir. Kullanıcıdan
          aşağıdaki girdiyi alın Tutulan sınıf sayısı Katılan sınıf sayısı.
          Ve katıldığı sınıfın baskı yüzdesi Öğrencinin sınava girmesine
          izin verilir mi verilmez mi?

          Yukarıdaki soruyu, öğrencinin tıbbi bir nedeni varsa oturmasına
          izin verecek şekilde değiştirin. Kullanıcıya tıbbi bir nedeni
          olup olmadığını sorun ( 'Y' veya 'N' ) ve buna göre yazdırın.
         */

        // yapilan ders sayiyi , gelme sayisi , rapor varsa katilabilecek

        Scanner scan = new Scanner(System.in) ;
        System.out.println("Raporu Y veya N seklinde giriniz");
        char rapor = scan.nextLine().toUpperCase().charAt(0) ;

        int ders = 100 ;
        System.out.println("Kac gun geldiginizi yaziniz");
        int gun = scan.nextInt() ;

       if (rapor == 'Y') {
           System.out.println("Sinava girebilirsiniz");

       }

       if (gun > ders*0.75){
           System.out.println("Sinava girebilirsiniz");

       } else {
           System.out.println("Sinava giremezsiniz");

       }

       // Ternary ile

        System.out.println(rapor == 'Y' ? "Sinava girebilirsin" : (gun >ders*0.75) ? "Sinava girebilirisin" : "Sinava giremezsin");









    }
}
