package day35_inheritancedaConstructorKullanimi;

public class EMuhasebe extends DPersonel{

    EMuhasebe(){ // 5   2. nin 5
        // 6 Super cons var    2. nin 6
        System.out.println("Muhasebe Parametresiz cons"); // 10 2. nin 10
    }  // 11   2. nin 11

    EMuhasebe(String isim){
        System.out.println("Muhasebe Parametreli cons");
    }





}
