package day04_dataCasting;

public class C09_Pro4 {

    public static void main(String[] args) {

        double sayi1 = 255.36 ;

        int sayi2 = (int) sayi1;

        byte sayi3 = (byte) sayi2;

        System.out.println(sayi1);    // 255.36
        System.out.println(sayi2);    // 255
        System.out.println(sayi3);    // -1

    }


}
