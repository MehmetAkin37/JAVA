package day44_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedList_QueueDataTuru {


    public static void main(String[] args) {


        Queue<String> ll3 = new LinkedList();

        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("HPolat");
        ll3.add("Kadir");

        // Queue kuyruk demektir, sira onemlidir
        // gelen sona gelir, giden bastan gider

        System.out.println(ll3); // [Adem, Zeynep, HPolat, Kadir]
        System.out.println(ll3.remove()); // Adem
        System.out.println(ll3);  // [Zeynep, HPolat, Kadir]

        System.out.println(ll3.remove("HPolat")); // true
        System.out.println(ll3);   // [Zeynep, Kadir]


        System.out.println(ll3.element());  // Zeynep    // element silmeden ilk elementi bize döndürür
        System.out.println(ll3.peek());  // Zeynep       // peek silmeden ilk elementi bize döndürür

        Queue<String> ll4 = new LinkedList();

        //System.out.println(ll4.element());  // throws exceptions NoSuchElementException
        System.out.println(ll4.peek());       // null

        // peek ve elementin aralarindaki fark , bos liste olursa peek null doner, element exception firlatir

        ll3.offer("Ahmet");   // offer add gibi istenilen elementi sona ekler
        ll3.offer("Sefa");


        System.out.println(ll3);  // [Zeynep, Kadir, Ahmet, Sefa]

        System.out.println(ll3.poll());  // Zeynep     Bastaki elementi silip ,bu elementi yazdirir.
        System.out.println(ll3);         // [Kadir, Ahmet, Sefa]

        //System.out.println(ll4.remove());  // throws exceptions NoSuchElementException
        System.out.println(ll4.poll());     // null


    }

}
