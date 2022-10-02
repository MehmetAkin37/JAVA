package day21Arrays;

import java.util.Arrays;

public class C06_ArrayElemanEkleme {

    public static void main(String[] args) {

        // C05 deki methodu kullanarak array'e eleman ekleyelim

        String [] takimListesi ={"Suleyman" ,"Osman"} ;
        String eklenecekIsim = "Talha" ;

        takimListesi = C05_ArrayeElementEkleme.elemanEkle(takimListesi,eklenecekIsim) ;

        System.out.println(Arrays.toString(takimListesi));


    }
}
