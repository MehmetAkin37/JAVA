package day03__scanner;

public class C01_AsciiTable {

    public static void main(String[] args) {

        // Soru 6 : Bir tamsayi bir de char degiskeni olusturun ve bunlarin toplamini yazin

        int sayi=10 ;
        char harf= 'a' ;
        String str="banan" ;


        System.out.println(sayi + harf);         // 107
        System.out.println(sayi * harf);        // 970
        System.out.println(str + harf);         // banana
        System.out.println(harf + 2);           // 99
        System.out.println(str + sayi + harf);  // banan10a

        /*
        char data turu girdigi degiskenin türüne göre farkli davaranabilir
        eger matematiksel isleme girdigi variable sayisal bir degerse sayi gibi davranir


         */

        // peki konsolda 10a gormek istersek nasil yazdirmaliyiz ?

        System.out.println("" + sayi + harf);



    }

}
