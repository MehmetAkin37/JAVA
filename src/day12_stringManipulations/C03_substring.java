package day12_stringManipulations;

public class C03_substring {

    public static void main(String[] args) {

        String isim = "Suleyman" ;
        String soyisim = "Karanfil" ;
        String kartNo = "1234 6589 7458 9658" ;

        // S******* K*******
        // 1234  **** **** ****


        System.out.println(isim.substring(3));    // eyman

        System.out.println(soyisim.substring(soyisim.length()-3));  // fil

        System.out.println(isim.substring(2,4));   // le

        // isim ve soyismin ilk harfi buyuk harf, geriye kalan *
        // kredi kartinin ilk 4 rakami gorunsun geriye kalan *


        String isimIlkHarf = isim.substring(0,1).toUpperCase();
        String isimGeriyeKalanlar = isim.substring(1).replaceAll("\\w" , "*") ;

        String soyIsimIlkHarf = soyisim.substring(0,1).toUpperCase();
        String soyIsimGeriyeKalanlar = soyisim.substring(1).replaceAll("\\w" , "*") ;

        String kkIlk4 = kartNo.substring(0,5) ;
        String kkGeriyeKalanlar = " **** **** ****" ;
        //String kkGeriyeKalanlar = kartNo.substring(5).replaceAll("\\d" , "*" );  // Boyle de yazabiliriz

        System.out.println(isimIlkHarf + isimGeriyeKalanlar + " " +
                         soyIsimIlkHarf + soyIsimGeriyeKalanlar + " " + "\n"+
                         kkIlk4 + kkGeriyeKalanlar );


    }



}
