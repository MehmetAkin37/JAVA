package day32_practice;

import java.util.Scanner;

public class UzunKelime {

    public static void main(String[] args) {

        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir cumle giriniz");

        String cumle = scan.nextLine();

        enUzunKelime(cumle);

        // "Ben bugun javayi daha cok sevdim ama cok zorlandim" ;

        System.out.println("En uzun kelime : " + enUzunKelime(cumle));


    }

    public static String enUzunKelime(String cumle) {  //enuzun kelimeyi istiyor

        String arr[] = cumle.split(" ");
        int max = 0;
        String longestWord = "";

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() > max) {
                max = arr[i].length();     // ilk calistitiginda kod max = 3 oldu
                longestWord = arr[i];
            }

        }

        return longestWord;


    }


}
