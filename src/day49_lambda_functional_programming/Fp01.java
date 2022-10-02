package day49_lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {

    public static void main(String[] args) {

    /*
    1) Lambda (Functional Programming) Java 8 ile kullanılmaya başlanmıştır.
    2) Functional Programming'de "Ne yapılacak" (What to do) üzerine yoğunlaşılır.
   Structured Programming "Nasıl yapılacak" (How to do) üzerine yoğınlaşılır.
    3) Functional Programming, Arrays ve Collections ile kullanılır.
    4) "entrySet() methodu ile Map, Set'e dönüştürülerek Functional Programming'de kullanılabilir.

    */


        List<Integer> liste = new ArrayList<>();

        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);

        System.out.println(liste); // [8, 9, 131, 10, 9, 10, 2, 8]

        listElemanlariniYazdirStructured(liste);
        System.out.println();
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirStructured(liste);
        System.out.println();
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKaresiniYazdir(liste);
        System.out.println();
        tekrarsizTekElemanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareleriToplami(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKupununCarpimi(liste);

        getMaxEleman(liste);
        getMaxEleman02(liste);
        getYedidenBuyukCiftMin1(liste);
        getYedidenBuyukCiftMin2(liste);
        getYedidenBuyukCiftMin3(liste);


        getTersSiralamaylaTekrarsizElemanlarinYarisi(liste);

        //1) Ardışık list elementlerini aynı satırda aralarında boşluk
        // bırakarak yazdıran bir method oluşturun.(Structured)

    }

    public static void listElemanlariniYazdirStructured(List<Integer> list) {

        for (Integer w : list) {

            System.out.print(w + " "); // 8 9 131 10 9 10 2 8

        }

    }

    //1)Ardışık list elementlerini aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void listElemanlariniYazdirFunctional(List<Integer> list) {


        list.stream().forEach(t -> System.out.print(t + " "));  // 8 9 131 10 9 10 2 8


    }

    //2)Cift list elemanlarini aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.(Structured)

    public static void ciftElemanlariYazdirStructured(List<Integer> list) {

        for (Integer w : list) {

            if (w % 2 == 0) {
                System.out.print(w + " "); // 8 10 10 2 8
            }

        }


    }

    //2)Cift list elemanlarini aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {

        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " ")); // 8 10 10 2 8

    }

    //3) Ardışık tek list elementlerinin karelerini aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlarinKaresiniYazdir(List<Integer> list) {

        list.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " ")); // 81 17161 81

    }

    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak
    // aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.

    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list) {

        list.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));

    }

    // //5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKareleriToplami(List<Integer> list) {

        Integer toplam = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);

        System.out.println(toplam);
    }

    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKupununCarpimi(List<Integer> list) {


        Integer carpim = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t * t).reduce(1, (t, u) -> t * u);

        System.out.println(carpim);
    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    // 1. Yol :

    public static void getMaxEleman (List<Integer> list){

       Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)-> t>u ? t : u); // list.get(0)

        System.out.println(max);

    }

    // 2. Yol :
     public static void getMaxEleman02 (List<Integer> list){

        Integer max2 = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);

         System.out.println(max2);


         //Ödev
         //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)

     }

    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    // 1. Yol :

    public static void getYedidenBuyukCiftMin1(List<Integer> list) {

      Integer min =  list.
              stream().
              distinct().
              filter(t-> t%2 ==0).
              filter(t-> t>7).
              reduce(Integer.MAX_VALUE,(t,u)-> t<u ? t : u);

        System.out.println(min);

    }

    // 2. Yol :

    public static void getYedidenBuyukCiftMin2(List<Integer> list){

        Integer min2 =  list.
                stream().
                distinct().
                filter(t-> t%2==0).
                filter(t-> t>7).
                sorted(Comparator.reverseOrder()).
                reduce(Integer.MAX_VALUE,(t,u)-> t<u ? t : u);

        System.out.println(min2);
    }

    //3. Yol:
    public static void getYedidenBuyukCiftMin3(List<Integer> list){

        Integer min = list.
                stream().
                filter(t->t%2==0).
                filter(t->t>7).
                sorted().
                findFirst().
                get();

        System.out.println(min);

    }
      //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı
     // değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

    public static void getTersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> list){

       List<Double> sonuc = list.stream().distinct().filter(t-> t >5).map(t -> t/2.0).
                            sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(sonuc);

    }


}