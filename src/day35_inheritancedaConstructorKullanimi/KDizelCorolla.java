package day35_inheritancedaConstructorKullanimi;

public class KDizelCorolla extends HCorolla {


    KDizelCorolla() {

        System.out.println("KDizelCorolla Parametresiz cons"); // 12     2. nin 3
    }  // 13

    KDizelCorolla(String isim) {  // 3  2. nin 3
        // supercons  4    parametrelide superi siler
        super(isim);  // 2. nin 4
        System.out.println("KDizelCorolla Parametreli cons"); //2. nin 12
    }  //2. nin 13

    public static void main(String[] args) {   //  1    2. nin 1

        KDizelCorolla obj1 = new KDizelCorolla("Hasan");  // 2     2. nin 2 ve //2. nin 14

    } //2. nin 15






}
