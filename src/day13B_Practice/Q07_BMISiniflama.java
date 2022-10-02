package day13B_Practice;

import java.util.Scanner;

public class Q07_BMISiniflama {

    public static void main(String[] args) {

        /*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.

		 */

        Scanner scan = new Scanner(System.in) ;
        System.out.println("Boyunuzu cm olarak giriniz :");
        double boy = scan.nextDouble() /100;   // boyu metreye cevirdik

        System.out.println("Kilonuzu kilogram olarak giriniz");
        double kilo = scan.nextInt() ;

        double bmi = kilo / (boy*boy) ;
        System.out.println(bmi);


        if (bmi <= 20) {
            System.out.println("Bmi indeksiniz " + bmi + " Oldukca zayifsiniz");

        } else if (bmi <=25) {
            System.out.println("Bmi indeksiniz " + bmi + " Normal sinirlardasiniz");

        } else if (bmi<=30) {
            System.out.println("Bmi indeksiniz " + bmi + " Sisman kategorisindesiniz");

        } else if (bmi>30){
            System.out.println("Bmi indeksiniz " + bmi + " Obez grubundasiniz");
        }


    }

}
