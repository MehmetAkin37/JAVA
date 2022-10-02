package day01_variables;

import java.util.Arrays;

public class C30_sBey {

    public static void main(String[] args) {

        /*
        Bir dizi içerisindeki pozitif tam sayı sayısını ve
    negatif tam sayıların toplamını return (array olarak) eden bir method yazınız.

    Örnek:
    countPositivesSumNegative ([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15])
    [10, -65]
    // Toplam 10 pozitif sayı var.
    // Tüm negatif sayıların toplamı -65'tir.

    Notlar :
    Boş bir dizi verilirse, boş bir dizi döndürür: []
    0 pozitif değil.
         */

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};

        pozNegatif(arr);

        System.out.println(Arrays.toString(arr));

    }

    private static int[] pozNegatif(int[] arr) {

        int[] arr2 = new int[2];
        int sayac = 0;
        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                sayac++;
            }

            if (arr[i] < 0) {
                toplam += arr[i];
            }

            arr2[0] = sayac;
            arr2[1] = toplam;
        }

        return arr2;


    }
}
