package day35_inheritancedaConstructorKullanimi;

public class FMemur extends EMuhasebe{

    /*
      Extends keyword kullanilan classlarda
      ister default consructor bulunsun
      istersek de biz yeni constructor(lar) olusturalim
      Java constructor'in ilk satirina
      super(); constructor call yazar
      super(); constructor call, default constructor'a benzer
      gorunmese de orada vardir ve calisir
      ancak biz ilk satira farkli bir constructor call yazarsak
      Java super(); 'i siler
      Eger biz mudahale edip kendi constructor call'umuzu olusturmazsak
      Javanin default olarak olusturdugu constructor call
      her zaman parametresizdir
      super();
     */


    FMemur(){   // 3

        // 4 Burada gorunmeyen Super cons var
        System.out.println("Memur Parametresiz cons"); // 12
    }  // 13

    FMemur(String isim){     // 2. nin 3
        // Super cons var  2. nin 4
        System.out.println("Memur Parametreli cons");  // 2. nin 12
    }  // 2. nin 13

    public static void main(String[] args) {  // 1    2. nin 1

        FMemur mmr1 = new FMemur("ali");  // 2 --- // 14     2. nin  2 ve 2. nin 14
    }   // 15 ve bitti      2. nin 15

// Ilk once mmr1 i parametresiz yaptik sonra da bir parametreli yaptik




}
