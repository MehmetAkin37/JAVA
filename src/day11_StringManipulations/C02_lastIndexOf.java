package day11_StringManipulations;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String cumle = "Java cok kolay, Java cok guzel" ;
        String kelime = "java" ;

        /* verilen kelime icin asagidaki sartlardan uygun olani yazan bir program yaziniz
           - verilen kelime cumlede kullanilmamis
           - verilen kelime cumlede sadece 1 kere kullanilmis
           - verilen kelime cumlede birden fazla kullanilmis
         */


        int kelimeIlkIndex = cumle.indexOf(kelime) ;
        int kelimeSonIndex = cumle.lastIndexOf(kelime) ;


        if (kelimeIlkIndex ==-1){
            System.out.println("Verilen kelime hic kullanilmamis");

        } else if (kelimeIlkIndex == kelimeSonIndex) {
            System.out.println("Verilen kelime cumlede sadece 1 kere kullanilmis");
        } else {
            System.out.println("Verilen kelime cumlede birden fazla kullanilmis");

        }


    }
}
