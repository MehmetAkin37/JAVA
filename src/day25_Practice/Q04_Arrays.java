package day25_Practice;

public class Q04_Arrays {

    public static void main(String[] args) {

        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         */

        String str = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz." ;

        str = str.replace(" ", "") ;
        System.out.println("str = " + str);

        System.out.println("str.lenght() = " + str.length());


        // VEYA 2. YOL

        String harf [] = str.split("");
        System.out.println(harf.length);

        // VEYA 3. YOL

        String str1 = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz." ;
        String kelime [] = str1.split(" ") ;
        int boslukSayisi = kelime.length-1 ;
        System.out.println("boslukSayisi = " + boslukSayisi);

        String character[] = str1.split("");
        System.out.println("character sayisi = " + (character.length - boslukSayisi));



    }
}
