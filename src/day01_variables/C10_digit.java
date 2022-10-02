package day01_variables;

import java.util.Arrays;

public class C10_digit {

    public static void main(String[] args) {

        /*  ARRAY 3. SORU
        Write a method which accepts a String as parameter and prints
        the sum of the digits, present in the given string.

          input : ade1r4d3

          output : 8
Hint :
     Use Character.isDigit()
     Integer.valueOf()
         */

        String str = "ade1r4d3";
        str = str.replaceAll("\\D", "");

        Integer.valueOf(str);

        String [] arr = str.split("") ;
        int toplam = 0;


        System.out.println(Arrays.toString(arr)); // [1, 4, 3]

        for (int i = 0; i < arr.length; i++) {
           // toplam += arr[i] ;
        }
        System.out.println(toplam);


        /*
        int toplam = 0;

        while (sayi != 0) {
            toplam += sayi % 10;
            sayi /= 10;


        }
        System.out.println(toplam);
*/

    }
}
