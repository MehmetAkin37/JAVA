package day35_inheritancedaConstructorKullanimi;

public class HCorolla extends  GToyota {


    HCorolla(){ // 5
     // super cons 6
        System.out.println("HCorolla Parametresiz cons"); // 10
    } // 11

    HCorolla(String isim){   //2. nin 5
        super(isim);  //2. nin 6

        System.out.println("HCorolla Parametreli cons"); //2. nin 10
    }  //2. nin 11
}
