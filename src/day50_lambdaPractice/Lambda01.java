package day50_lambdaPractice;

import java.util.*;
import java.util.stream.Stream;

public class Lambda01 {

    /* 1. Soru :

     * Input olarak verilen listteki isimlerden
     * icinde 'a' harfi bulunanlari silen bir code create ediniz
     */


    static ArrayList<String> names = new ArrayList<>(Arrays.asList("Tulay", "zekeriya",   // Soru 1
            "hasan", "ismail", "osman", "fatih", "Ersin", "Mevlut"));

    static List<Integer> numbers = new ArrayList<>(Arrays.asList(25, 65, -56, 55, 98, -89, 65, 55, 21, 54, 9, 35, 35, 34)); // Soru 2


    static List<String> menu = new ArrayList<>(Arrays.asList("kusleme", "adana", "trilice", "havucdilim", "buryan",
            "kokorec", "kuzutandir", "guvec"));


    public static void aHarfleriSilenGerisiniYazdiran(ArrayList<String> isimler) {

        /*System.out.println(isimler.stream()                    //akisa alindi
                             .map(m -> m.toLowerCase())          //hepsi kucuk harffe cevrilfi
                             .filter(m -> !m.contains("a"))      //a harfi olmayanlar filtrelendi
                             .collect(Collectors.toList()));     //lisste atildi


      2.yol
       System.out.println(isimler.stream()                                      //akisa alindi
                         .filter(m -> !m.contains("a") && !m.contains("A"))    //a harfi olmayanlar filtrelendi
                         .collect(Collectors.toList()));                      //lisste atildi */


        //3.yol

        isimler.removeIf(t -> t.contains("a") || t.contains("A"));
        System.out.println(names);
    }


    //2. Soru : En buyuk elemani bulun

    public static void maxElemanBul(List<Integer> sayi) {

        Optional<Integer> maxSayi = sayi.stream().reduce(Math::max);
        System.out.println("maxSayi = " + maxSayi);


        //2.yol
        System.out.println("maxSayi2 = " + sayi.stream().reduce(Integer::max).get());

        //spesifik bir method cagirirsani daha hizli yani alirsinz


    }

    // 3. Soru : List'teki tum elemanlarin toplamini yazdiriniz.
    //Lambda Expression...

    public static void elemanlariTopla(List<Integer> sayilar) {

        System.out.println("toplam = " + sayilar.stream().reduce(0, (a, b) -> a + b));

        System.out.println("toplam2 = " + sayilar.stream().reduce(Integer::sum).get());   //spesifik methoda daha hizlidir
    }


    // 4. Soru: List'teki cift elemanlarin carpimini  yazdiriniz.

    public static void elemanlariCarp(List<Integer> sayilar) {

        //lambda expression ile

        System.out.println("carpim1 = " +
                sayilar.stream().filter(Methodlarim::ciftElemaniBul)
                        .reduce(1, (a, b) -> a * b));


        //method referans ile

        System.out.println("carpim2 = " +
                sayilar.stream().
                        filter(Methodlarim::ciftElemaniBul).
                        reduce(Math::multiplyExact));
    }


    //TODO task tek sayilarin karesini buyukten kucuge
    public static void teklerinKareBuyuktenKucuge(List<Integer> sayi) {

        sayi.stream().//liste aaskisa alindi
                filter(t-> t % 2 ==1)//tek olan rakamlari filtreeledim
                .map(t-> t*t)//her tek sayinin  karesi alindi
                .sorted(Comparator.reverseOrder())//buyukten kucuge srialandi
                .forEach(Methodlarim::yazdir);//seed method kullanilarakl method ref ile yazdirldi


    }

    // Task : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.
    public static void alfabetikBuyukHarfTekrarsiz(List<String> yemek) {






    }

    // Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void strKarakterSayisiYazdir(List<String> yemek) {








    }

    // Task :TODO list elemanlarinin son harfine gore ters sirali print ediniz.
    public static void sonHarfeGoreTersSira(List<String> yemek) {

        yemek.stream().//
                sorted(Comparator//siralama aksiyonuna girildi
                .comparing(t-> t.toString()//her bir eleman strige cevrildi elemanin kendisi alindi
                        .charAt(t.toString().length()-1))//son karakter i charAt ile alindi
                .reversed())////son harfe gore tersine sirlandi
                .forEach(Methodlarim::yazdir);//yazdirldi


    }

    // Task : listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz
    // buyukten kucuge sirali  print ediniz..
    public static void karakterCiftKareBuyuktenKucuge(List<String> yemek) {








    }

    // TODO Task : List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.

    public static void karakterSayiYedidenBuyuk(List<String> yemek) {

        // 1. YOL :
        boolean kontrol = yemek.stream().allMatch(t -> t.length() <= 7);

        if (kontrol) {
            System.out.println("list elamanlari 7 ve daha az harften olusmus");

        } else System.out.println("bazi elemanlar 7 den buyuk");

        // 2. YOL :
        System.out.println(yemek.stream()//akisa alindi
                .allMatch(t -> t.length() <= 7) ?//7 den kucuk olma durumu kontrol eildi tearnary ile sart a bakildi
                "list elemanlari 7 ve daha az harften olusmus" ://true ise mesaj donderildi
                "bazi elemanlar 7 den buyuk");//false ise mesaj donderildi


    }







    //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
    //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
    //noneMatch() --> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.




    // Task : List elelmanlarinin "W" ile baslamasını kontrol ediniz.

    public static void basHarfiWIleBaslayan(List<String> yemek) {






    }

    // TODO Task : List elelmanlarinin "x" ile biten en az bir elemaı kontrol ediniz.
    public static void xIleBitenEleman(List<String> yemek) {







    }

    // TODO Task : Karakter sayisi en buyuk elemani yazdiriniz.

    public static void karakterEnFazla(List<String> yemek) {
        //limit(1) => Sınırlandırma demek. Bu akışın elemanlarından oluşan, uzunluğu maxSize'dan uzun olmayacak
        // şekilde kesilmiş bir akış return eder. Stream return eder.

        Stream<String> sonIsim=//limit kullandigimiz icin bu sonucu sonIsim objesine atadik
                yemek.stream().//akisa alindi
                        sorted(Comparator.//sortladik
                        comparing(t-> t.toString().length()).//sortlamayi length ine gore yaptik
                        reversed()).//tersine cevirdik yani karakter sayisi en cok olan en basa geldi
                        limit(1);//limity ile ilk elemani aldik yani liteyi ilk eleman ile siniriladik

        System.out.println(//sonIsim objesi data turu nedir -> Stream oldugu icin ben bunu arraya cevirmem gerekli
                Arrays.toString//array olanlari stringe donusturup yazdirmamizi saglar
                        (sonIsim.toArray()));//Stream tipi arraya cevrildi



    }

    /*
TRİCK : •    Stream'ler ekrana direk yazdırılamaz. Stream'i toArray() ile Array'e çeviririz.
Array'i de Arrays.toString() 'in içine alıp yazdırabiliriz.
•  Ör; System.out.println(Arrays.toString(***.toArray())); veya System.out.println(Arrays.asList(***.toArray()));
kullanılabilir.
*/
    //TODO Task : list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari print ediniz.
    public static void sonHarfeGoreSiralaIlkHaricElmanlariYaz(List<String> yemek) {









    }


}


/*reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
                kullanımı yaygındır pratiktir.
        Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
       bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
                reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
              reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
      İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.*/