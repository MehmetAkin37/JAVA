package day06_concatenation;

public class C03_Problemler {

    public static void main(String[] args) {

        String str1 = "Java" ;

        String str2 = "Guzel" ;

        int sayi1 = 5 ;
        int sayi2 = 4 ;

        System.out.println(str1 + " " + str2 + " " + sayi1 + sayi2);
        System.out.println(str1 + " " + sayi1 + " " + str2);
        System.out.println(str1 + " " + (sayi1+sayi2) + sayi2);
        System.out.println(str1 + " " + (sayi1-sayi2) + (sayi1+sayi2));
        System.out.println("" + sayi1 + sayi2 + " " + str2);

          /* Java Guzel 54
            Java 5 Guzel
            Java 94
            Java 19
           54 Guzel

           */




    }

}
