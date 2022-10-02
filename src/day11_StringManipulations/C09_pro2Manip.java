package day11_StringManipulations;

public class C09_pro2Manip {

    public static void main(String[] args) {

       String cumle = "Guzel gunler gorecegiz cocuklar, gunesli gunler" ;
       String kelime = "Guzel" ;

        int kelimeIlkIndex = cumle.indexOf(kelime) ;
        int kelimeSonIndex = cumle.lastIndexOf(kelime) ;

        if (kelimeIlkIndex == -1) {
            System.out.println("Girilen kelime cumlede kullanilmamis");

        } else if (kelimeIlkIndex == kelimeSonIndex) {
            System.out.println("Girilen kelime cumlede bir defa kullanilmis");

        } else {
            System.out.println("Girilen kelime cumlede birden fazla kullanilmis");

        }



    }

}
