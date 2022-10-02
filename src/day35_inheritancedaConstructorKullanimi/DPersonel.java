package day35_inheritancedaConstructorKullanimi;

public class DPersonel {

    DPersonel() {   // 7  2. nin 7
        // Burada Super cons yok ,cunku extends yok
        System.out.println("Personel Parametresiz cons");  // 8   2. nin 8
    }  // 9   2. nin 9


    DPersonel(String isim) {
        System.out.println("Personel Parametreli cons");
    }


}
