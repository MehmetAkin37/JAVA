package day01b_sorular;

import java.util.Arrays;

public class C12_listEkle {

    public static void main(String[] args) {

        /*  LIST 2
        Create a 10-element list. Swap the 8th element with the 3rd element.
        INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

        Output:

        [Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
         */

        String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

        int birinciElement = 1 ;
        int ikinciElement = 9 ;

        String temp = names[birinciElement] ;        // Kemali kaybolmamasi icin gecici tempe atadim
        names[birinciElement] = names[ikinciElement] ;    // 7. indexi 2. indexe atadim
        names[ikinciElement] = temp ;               // tempe atadigim Kemali Furkanin yerine koydum

        System.out.println(Arrays.toString(names));



    }
}
