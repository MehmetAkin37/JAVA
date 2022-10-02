package day12_stringManipulations;

public class C02_replaceAll {

    public static void main(String[] args) {

        String str = "1Bu2gu3n Ja*va- cok gu3z/el";

        // str'i Bugun Java cok guzel haline getirin
        // replaceAll() deki all'un amaci ayni ozellikteki tum karakterleri kapsamasidir
        // butun sayilari sil
        // butun ozel karakterleri sil
        // tum ozel karakterleri silelim dedigimizde space'ler de siliniyor
        // space'leri korumak icin en basta onlarin yerine cumlede bulunmayacak
        // bir string koyalim
        // "qazwsx"


        str = str.replace(" " , "qazwsx") ;
        System.out.println(str);

        str = str.replaceAll("\\W", "");
        System.out.println(str);

        str = str.replaceAll("\\d" , "" );
        System.out.println(str);

        // istenmeyen ozel karakter ve sayilardan kurtulduk
        // simdi space'leri geri getirelim

        str = str.replace("qazwsx" , " ") ;
        System.out.println(str);


    }


}
