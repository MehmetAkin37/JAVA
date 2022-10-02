package day35_inheritancedaConstructorKullanimi;

public class LOgretmen {

    LOgretmen(){   // 7

        System.out.println("LOgretmen Parametresiz cons"); // 8
    }  //  9

    LOgretmen(String isim){

        this();
        System.out.println("LOgretmen Parametreli cons");
    }


}
