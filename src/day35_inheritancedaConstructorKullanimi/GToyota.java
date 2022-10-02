package day35_inheritancedaConstructorKullanimi;

public class GToyota {

    GToyota(){   // 7

        System.out.println("GToyota Parametresiz cons");  // 8
    }  // 9

    GToyota(String isim){  //2. nin7

        // super(isim);  extends olmadigi icin super constructor call'u java kabul etmez

        System.out.println("GToyota Parametreli cons"); //2. nin 8
    }  //2. nin 9


}
