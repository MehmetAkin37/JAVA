package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {

    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();

        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste);  // [10, 20, 30]

        // liste'deki tum elementleri INDEX KULLANMADAN 3 artirin

        for (Integer each: liste
             ) {
            each += 3;
            System.out.print(each + " "); // 13 23 33
        }

        System.out.println();
        System.out.println(liste);  // [10, 20, 30]

         /* Java index yapisi olmayan collection'lardaki
         elementlere ulasmak veya degistirmek icin
         Iterator interface'ini olusturmustur.

         Java iterator, collection elemanlarımızın arasında gezinmemize ve elemanlari degistirmemize
         yarar.

        Iterator interface oldugundan ondan obje uretmemiz mumkun degilr
        bunun yerine bize iterator döndüren  liste.iterator() method'unu kullaniyoruz


         */



        // Listteki Iterator methodunu kullaniyoruz ama o abstract,dolayisiyla onu override edene
        // gidiyor ve override eden bu methodun bana döndürdügü iterator new iteratoru aliyor ve
        // burada benim olusturdugum itr1 objesine atama yapiyor.


        // [10, 20, 30]

        Iterator itr1 = liste.iterator();

        // Iteratorün 3 tane methodu var : next , remove ve hasnext

        System.out.println(itr1.next());   // 10
        System.out.println(itr1.next());   // 20
        System.out.println(itr1.next());   // 30
        //System.out.println(itr1.next());   // 30 ' dan sonra element kalmadigindan next methodu NoSuchElementException verir

        // Iterator'da geri donus yok, adim adim sona ulastiktan sonra
        // basa gelmek isterseniz yeniden bir iterator olusturmaniz gerekir

        // [10, 20, 30]


        Iterator itr2 = liste.iterator();


        // yeni itr2'yi kullanarak listenin tum elementlerini silelim

        itr2.next();
        itr2.remove();
        System.out.println(liste);   //  [20, 30]

        itr2.next();
        itr2.remove();
        System.out.println(liste);   //  [30]

        itr2.next();
        itr2.remove();
        System.out.println(liste); // []

        // iterator ile elementleri gezip, remove yapinca
        // liste kalici olarak degisti

        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println("Yeniden liste : " + liste);  // [10, 20, 30]

        Iterator itr3 = liste.iterator();

        while (itr3.hasNext()) {
            itr3.next();
            itr3.remove();
        }
        System.out.println("Loop'dan sonra liste: " + liste);  // []

         /*
         Goruldugu gibi Iterator kullanarak yapabildigim
         1- tum collection elementlerini yazdirmak
         2- tum collection elementlerini silmek
         Bu da bize yetmez
         */

    }


}
