package day01b_sorular;

import java.util.Scanner;

public class C3_Arr {

    public static void main(String[] args) {

        /*
        Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.

        Array: [12,15,43,23,56,76,78,90,77,43]

       Aranan değer:56
       Beklenen Çıktı:
       56 sayısı arrayin 4. elemanı
         */

        int[] arr = {12, 15, 43, 23, 56, 76, 78, 90, 77, 43};

        Scanner scan = new Scanner(System.in);
        System.out.println("Indeksini bulmak istediginiz sayiyi giriniz");
        int sayi = scan.nextInt();


        for (int i = 0; i < arr.length; i++) {

            if (sayi == arr[i]) {
                System.out.println(sayi + " sayisi Array'in " + (i) + ". elemanidir" ); // i+1 olmasi lazimdi

            }

        }


    }
}
