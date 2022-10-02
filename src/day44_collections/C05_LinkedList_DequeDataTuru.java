package day44_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C05_LinkedList_DequeDataTuru {

    public static void main(String[] args) {

        Deque<String> ll4 = new LinkedList();

        ll4.add("Cavidan");
        ll4.add("Mesut");
        ll4.add("Selim");
        ll4.add("Tevfik");
        ll4.add("Selim");

        ll4.removeLastOccurrence("Selim");
        ll4.removeLastOccurrence("Hasan");
        System.out.println(ll4);           // [Cavidan, Mesut, Selim, Tevfik]

        System.out.println(ll4.pop());    // Cavidan
        System.out.println(ll4);          // [Mesut, Selim, Tevfik]

        ll4.remove();
        System.out.println(ll4);   // [Selim, Tevfik]


        Deque<String> ll5 = new LinkedList();
        //System.out.println(ll5.remove());  // NoSuchElementException
        //System.out.println(ll5.pop());  // NoSuchElementException


        // Deque iki tarafli queue demektir, dolayisiyla her method'un first ve last'i var

        ll4.removeFirst();
        System.out.println(ll4);  // [Tevfik]

        ll4.removeLast();
        System.out.println(ll4);  // []











    }


}
