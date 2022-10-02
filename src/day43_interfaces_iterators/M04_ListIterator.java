package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class M04_ListIterator {

    public static void main(String[] args) {

        /*
         ListIterator Iterator'interface'nin child interface'dir
         ama daha cok method'a sahiptir

        Iterator ve ListIterator arasındaki en büyük fark,
        Iterator'ın koleksiyondaki öğeleri
        yalnızca ileri yönde hareket ettirebilmesidir
        ListIterator ise bir koleksiyondaki öğeleri
        hem ileri hem de geri yönde
        hareket ettirebilir .
         */

        // liste'deki tum elementleri INDEX KULLANMADAN 3 artirin

        List<Integer> liste = new ArrayList<>();

        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste);  // [10, 20, 30]

        Integer temp ;

        ListIterator lit1 = liste.listIterator();

        while (lit1.hasNext()) {
            temp = (Integer)lit1.next() + 3;

            lit1.set(temp);

        }
        System.out.println(liste); // [13, 23, 33]


    }


}
