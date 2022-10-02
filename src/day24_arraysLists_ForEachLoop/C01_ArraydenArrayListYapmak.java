package day24_arraysLists_ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapmak {

    public static void main(String[] args) {

        /*
        Uzun listeler olusturmamiz gerektiginde,
        tek tek eklemek yerine array olusturup, bunlari list'e cevirmek
        daha pratik olabilir
        1- loop ile array'deki tum elementleri list'e atabiliriz
        2- Arrays.asList() kullanabiliriz
           Ancak bu method'un 2 tane kotu yan etkisi var
           - Arrays class'i kullanildigi icin array ozellikleri gecerli olur
             dolayisiyla list'te olan add, remove gibi size'i degistiren method'lar
             bu sekilde olusturulan list'lerde kullanilamaz
           - kaynak olan array ile urun olan list ozdeslestirilir
             birinde yapilan degisiklik, otomatik olarak digerine de islenir
         */

        String[] arr = {"Ismail", "Nurullah", "Fatih"};

        List<String> sinifList = Arrays.asList(arr);

        System.out.println(sinifList);   // [Ismail, Nurullah, Fatih]

        // 1.yan etki
        // sinifList.add("Erdi"); // UnsupportedOperationException
        // sinifList.remove(1); // UnsupportedOperationException
        // 2.yan etki

        arr[1] = "Emre" ;
        System.out.println("Degisim sonrasi array : " + Arrays.toString(arr));    // [Ismail, Emre, Fatih]
        System.out.println("Array'i degistirince List : " + sinifList);           // [Ismail, Emre, Fatih]

        sinifList.set(0,"Utku") ;
        System.out.println("List'i degisitirince list : " + sinifList);            // [Utku, Emre, Fatih]
        System.out.println("List'i degistirnce array : " + Arrays.toString(arr));  // [Utku, Emre, Fatih]


    }

}
