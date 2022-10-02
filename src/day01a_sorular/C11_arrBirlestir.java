package day01a_sorular;

import java.util.Arrays;

public class C11_arrBirlestir {

    public static void main(String[] args) {

        /*  ARRAY 8. SORU
        Write a return method that accepts 2 integer Arrays as parameters And adds 2 array into a new Array and prints it.
        Input1={1,2,3,4}
        Input2={5,6}
        Output={1,2,3,4,5,6}
         */

        int[] input1 = {1, 2, 3, 4};
        int[] input2 = {5, 6};


        yeniArr(input1, input2);

        System.out.println(Arrays.toString(yeniArr(input1, input2)));

    }

    public static int[] yeniArr(int[] input1, int[] input2) {

        int[] yeni = new int [input1.length + input2.length] ;

        for (int i = 0; i < input1.length; i++) {
            yeni[i] = input1[i];              //  [1,2,3,4]

        }

        for (int i = 0; i < input2.length; i++) {
            yeni[i+input1.length] = input2[i];       // 5,6

        }

        return yeni;

    }
}



        // IKINCI YOL
/*
        List<Integer> yeniList = new ArrayList<>();

        for (int i = 0; i < input1.length; i++) {
            yeniList.add(input1[i]);    // 1,2,3,4

        }

        for (int i = 0; i < input2.length; i++) {
            yeniList.add(input2[i]);   // 5,6

        }
        System.out.println(yeniList);
*/


