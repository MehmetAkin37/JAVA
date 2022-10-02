package day22_multiDimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class C06_List {

    public static void main(String[] args) {

        // array i aaray yapan sembol [] idi
        // arraylist i ise <> diamond(elmas) kullaniriz

        List<String> isimler = new ArrayList<>();

        System.out.println(isimler); // []

        // bir List'e eleman eklemek istersek

        isimler.add("Basak") ;

        System.out.println(isimler.add("Ayse"));   // true

        /*
         String'de bir method calistirdigimizda
         assign yapmazsak String degismiyordu
         String isim="Suleyman"
         isim.toUpperCase(); // SULEYMAN
         sout(isim) --> Suleyman
         */

        System.out.println(isimler);                // [Basak, Ayse]

         /*
         List'in tek kotu tarafi array alt yapisini kullandigi icin
         elemanlari birer birer eklemek zorunda olmamizdir
         */


    }
}
