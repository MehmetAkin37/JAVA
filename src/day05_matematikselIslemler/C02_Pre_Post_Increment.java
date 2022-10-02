package day05_matematikselIslemler;

public class C02_Pre_Post_Increment {

    public static void main(String[] args) {

        int sayi = 10;

        System.out.println("pre-increment : " + ++sayi);           // 11 pre once arttirma sonra atama

        System.out.println("post-increment : " + sayi++);          // 11 post once atama sonra arttirma

        System.out.println("post-increment'den sonra : " + sayi);   // 12


    }

}
