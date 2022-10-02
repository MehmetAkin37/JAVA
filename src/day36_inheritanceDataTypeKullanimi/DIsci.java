package day36_inheritanceDataTypeKullanimi;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DIsci extends BMuhasebe{


    protected int saatUcreti = 11 ;
    protected int gunlukMesai = 7;


    protected void maasIsci(){
        System.out.println("Isciler : " + (30*saatUcreti*gunlukMesai) + " maas alir");
    }


    protected void ozelSigortaIsci(){
        System.out.println("Isciler %70 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {

        BMuhasebe isc1 = new DIsci();     // DIsci kismini muhasebe yaptik

         /*
          Bir obje olusturulurken
          Data turu ve constructor ayni class'dan ise
          direk o class'a gidiyorduk
          Eger data turu ve cons. farkli ise
          Obje constructor'in oldugu class'in objesidir
          ancak, bizden istenen
          Isci class'indaki spesifik ozellikler degil
          Bir iscinin muhasebe classindaki
          tum calisanlarla beraber sahip oldugu
          genel ozellikleri yazdirir
         */

        System.out.println(isc1.gunlukMesai);  // 8 Muhasebeden aldik
        System.out.println(isc1.saatUcreti);   // 10 Muhasebeden aldik

        isc1.maas();           //  Muhasebeden aldik
        isc1.ozelSigorta();    // Muhasebeden aldik
        isc1.sigorta();      //  Personelden aldik

        System.out.println(isc1.isim);           // Personelden aldik
        System.out.println(isc1.soyIsim);        // Personelden aldik
        System.out.println(isc1.departmant);     // Personelden aldik




        APersonel isc2 = new DIsci();
        //System.out.println(isc2.gunlukMesai);  // Personel classinda olmadigi icin geri de gidemedi CTE verdi
       // System.out.println(isc2.saatUcreti);   // Personel classinda olmadigi icin geri de gidemedi CTE verdi

       // isc2.ozelSigorta();    // Personel classinda olmadigi icin geri de gidemedi CTE verdi
        isc2.maas();   // cons ismini degistirdigimiz icin overriding ile isci classa gitmesi gerekirken muhsebede kalir
        isc2.sigorta();          //   Personelden aldik

        System.out.println(isc2.isim);           // Personelden aldik
        System.out.println(isc2.soyIsim);        // Personelden aldik
        System.out.println(isc2.departmant);     // Personelden aldik

         /*
         Eger Data turu olan class'da aradigimiz ozellik yoksa
         varsa onun parent'ina gidebilir
         ama child'a donus olmaz
         Aradigi ozelligi bulamazsa CTE verir
         */


        List<String> list1 = new LinkedList<>();
        Deque<String> list2 = new LinkedList<>();
        Queue<String> list3 = new LinkedList<>();

         /*
         Eger Data turu olan class'da aradigimiz ozellik yoksa
         varsa onun parent'ina gidebilir
         ama child'a donus olmaz
         Aradigi ozelligi bulamazsa CTE verir
         */



    }
}
