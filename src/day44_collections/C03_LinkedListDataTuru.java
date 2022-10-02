package day44_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C03_LinkedListDataTuru {

    public static void main(String[] args) {

         /*
         COLLECTIONS : NESNELERDEN OLUSAN BIR TOPLULUGU BIRARADA TUTAN YAPILARDIR.

        Set(Kume)         --> benzersiz kumeler gibi unique --- TC gibi   --- Iki tane ayni elemandan olsa bile sadece birini alir

        Queue(Sira)       --> yemekhane kuyrugu gibi dusunulebilir.Kuyruk her zaman bastan baslamayabilir sondan da olabilir(Deque)
                              (Yemek Kuyrugu) eklenen sona eklenip, ayrilan bastan ayrilir

        Linked (Bagli)    --> Halay gibi birbirine bagli,istedigin yere ekleyip cikarmak cok kolaydir,ama aramada cok yavas.

        Tree (Agac gibi)  --> dogal sirali ozel  sortlanmis gibi (3,5,10 olan bir listeye 7 eklersek 5 ile 10 arasina koyar)

        Hash(hizli)       --> her bir element icin unique bir hash code olusturup, arsive yerlestirir, bulmada hizlidir
                              ozel raf adi sayesinde hizli erisim



        Hangisini kullanacagimiza biz karar veriyoruz. E devlet Dogum ve ölümlerde Tree yerine Linkedlist


        LinkedList
        Halaya benzer, birbirine bagli. Ekleme ve cikarmada rahat, arama yaparken yavas.

       1) Ilk eleman her zaman head'dir. Head'te data yoktur, sadece adress vardir.
       2) Son eleman(tail) null'i point eder.
       3) Her elemanin icinde data ve adress kismi olmak uzere iki kisim vardir.
       4) Tum elemanlar pointer'lar/adress'ler kullanilarak birbirine baglanir.
       5) Her eleman node olarak adlandirilir.
     */


        LinkedList ll1 = new LinkedList();

        List<String> ll2 = new LinkedList();  // LinkedList 'in parenti oldugu icin data turunu List de secebiliriz

        Queue<String> ll3 = new LinkedList(); // LinkedList 'in grandparenti oldugu icin data turunu Queue de secebiliriz

        Deque<String> ll4 = new LinkedList(); // LinkedList 'in parenti oldugu icin data turunu Deque de secebiliriz

        ll2.add("Berk");
        ll2.add("Done");
        ll2.add("Enes");
        ll2.add("Ayse");

        System.out.println(ll2);   //  [Berk, Done, Enes, Ayse]
        System.out.println( ll2.remove(3));  // Ayse

        // eger Listemiz Integer elementlerden olusuyorsa
        // direk sayi yazarsak index olarak kabul eder
        // bir variable'a atama yapar ve remove'da o variabe'in ismini yazarsak obje olarak kabul eder

        System.out.println(ll2.remove("Kemal")); // false
        System.out.println(ll2.isEmpty()); // false


        ll2.set(1,"Serap");
        System.out.println(ll2);  // [Berk, Serap, Enes]

        ll1.add("Berk");
        ll1.add("Ismail");
        System.out.println(ll1);  // [Berk, Ismail]

        ll2.retainAll(ll1); // ll2 deki tum elementleri ll1 ile karsilastirir
                           // ll1'de olmayanlari siler. Ortak elemanlari alir grisini siler.

        System.out.println(ll2);   // [Berk]


        System.out.println(ll2.hashCode()); // 2066939
        ll2.add("Fatih");
        System.out.println(ll2.hashCode()); //  131726141






    }
}
