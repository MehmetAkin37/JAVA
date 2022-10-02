package day22_multiDimensionalArray;

import java.util.Scanner;

public class C12_Pro5Multi {

    public static void main(String[] args) {

        /*Soru=
        Kullanicidan bir cumle isteyin ve kelime sayisini yazdirin.
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz ");
        String verilenCumle = scan.nextLine();
        int kelimeSayisi = 0;


        String[] Cumle = verilenCumle.split(" ");
        kelimeSayisi = Cumle.length;

        System.out.println(kelimeSayisi);


    }
}









