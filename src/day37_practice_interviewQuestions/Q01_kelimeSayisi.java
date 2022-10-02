package day37_practice_interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_kelimeSayisi {

    public static void main(String[] args) {


        /*
         Kullanicidan bir String aliniz.
         String'de var olan her character'in sayisini ekrana yazdiriniz.
         Ornek: yapacan ==> a = 3, y = 1, p = 1, n = 1, c = 1
         hallolur yaaa   ==> a=4  l=3 h=1 o=1 u=1 y=1
*/

       /*
        daha oncelikle Scanner den obje olusturacaz
        oncelikle split() kullanacagiz
        sort yapacaz
        for loop a alacaz
        if ile kontrol yapacaz
        sout ile yazdiracaz */


        Scanner scan = new Scanner(System.in);
        System.out.println("Bir String ifade giriniz");
        String str = scan.nextLine();

        String arr[] = str.split("");

        Arrays.sort(arr);

        System.out.println("arr = " + Arrays.toString(arr));
        int counter = 0;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i - 1].equals(arr[i])) {
                counter++;

            } else {

                System.out.println(arr[i-1] + " karakteri " + (counter+1));
                counter = 0;
            }

            if (i == arr.length - 1) {
                System.out.println(arr[i] + " karakteri " + (counter+1));
            }


        }


    }


}
