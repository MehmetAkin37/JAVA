package day13D_MethodCreation;

public class C03_StringManipulation {

    public static void main(String[] args) {

        String yazi =" Java ogrenmek123 Cok guzel@ " ;

        // Java ogrenmek cok guzel. yazdirmak istiyoruz



        yazi = yazi.replaceAll("\\d" , "") ;
        System.out.println(yazi);

        yazi = yazi.replace("@" , "").replace("C" , "c") ;
        System.out.println(yazi);

        yazi = yazi.trim() ;
        System.out.println(yazi.trim());

        yazi = yazi + "." ;
        System.out.println(yazi);



        yazi = yazi.toUpperCase() ;








    }


}
