package day03__scanner;

import java.util.Scanner;

public class C11_ScannerPro {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in) ;

        System.out.println("Lutfen yaricapi giriniz");
        double yaricap=scan.nextDouble() ;

        System.out.println("Cemberin cevresi :" + yaricap*2*3.14);
        System.out.println("Dairenin alani :" + yaricap*yaricap*3.14);


    }

}
