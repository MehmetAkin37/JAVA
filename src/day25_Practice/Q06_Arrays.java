package day25_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q06_Arrays {

    public static void main(String[] args) {

 /*
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */
       farkiniBul();

    }

    private static void farkiniBul() {

       Scanner scan = new Scanner(System.in);
        System.out.println("array uzunlugunu giriniz");
        int uzunluk = scan.nextInt();
        int arr[] = new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.println("array'in" + (i+1) + ". elemanini giriniz"); //i -> oldugunda 0.eleman diyecek, biz index degil, direkt eleman sorduk
            arr[i] = scan.nextInt();  // fori den gelen indexler, bu satirda kullanici tarafindan dongu bitene kadar girilen elemanlar okunur

        }
        Arrays.sort(arr);

        System.out.println("arraydeki en buyuk eleman ile en kucuk eleman arasindaki fark : "+ (arr[arr.length-1] - arr[0]));

        //  odev: bu soruyu Math classi kullanrak cozunuz..

    }
}
