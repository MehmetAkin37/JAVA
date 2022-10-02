package day01_variables;

import java.util.Arrays;

public class C27_7_14 {

    public static void main(String[] args) {

        /*
        Methoda iki sayı girelim ve  bize bir array dönsün.
     Array elemanları 1.sayının 2. sayı kadar kendisi ile
     toplamından oluşsun.
​
    Test Data:
    arrayOfMultiples(7, 5)
​
    sonuç: [7,14,21,28,35]
         */

        arrayOfMultiples(7, 5);

    }

    private static void arrayOfMultiples(int i, int i1) {

        int s1 = 7 ;
        int s2 = 5 ;

        int[] arr = new int[s2] ;

       //  List<Integer> result = new ArrayList<Integer>();

        for (int j = 0; j < arr.length ; j++) {

            arr[j] = s1 * (j+1) ;
        }

        System.out.println(Arrays.toString(arr));

    }
}
