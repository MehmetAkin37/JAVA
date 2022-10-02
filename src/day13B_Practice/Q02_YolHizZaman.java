package day13B_Practice;

import java.util.Scanner;

public class Q02_YolHizZaman {

    public static void main(String[] args) {

         /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */

        Scanner scan = new Scanner(System.in );
        System.out.print("Gideceginiz yol mesafesi (km) : ");
        double yol = scan.nextInt() ;

        System.out.print("Ortalama hiziniz (km/sa) : ");
        double hiz = scan.nextDouble();

        double varisSuresi = yol / hiz ;

        System.out.println("Varis sureniz : " + varisSuresi + " sa") ;

        scan.close();








    }
}
