package day10_StringManipulation;

public class C05_Length {

    public static void main(String[] args) {

        String str = "Java ogren, isi kap" ;

        System.out.println(str.length());   //  str'in karakter sayisini dondurur 19

        System.out.println(str.charAt(str.length()-1));  // son karakterini yazdiralim p

        System.out.println(str.charAt(str.length()-3));   // sondan 3. karakteri yazdiralim y



        /*
          java'da null pointer (isaretleyici) bir deger degil,
          karsisina yazildigi variable'ın hic bir deger almadiginin isaretcisidir.

        */

        String str2 = "" ;                         // str2'ye bir deger atanmis midir EVET
        System.out.println(str2.length());         // bu deger nedir : hiclik


        String str3 = null ;            // str3'e bir deger atanmis midir HAYIR
                                        // null bu deger atamamayi isaret etmektedir

        System.out.println(str3.length());   // bir deger atanmamis ki nasil uzunlugu olsun ?
                                             // NullPointerException olarak hata verir


    }


}
