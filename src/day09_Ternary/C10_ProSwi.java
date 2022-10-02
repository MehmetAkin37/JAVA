package day09_Ternary;

import java.util.Scanner;

public class C10_ProSwi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        switch (sayi) {

            case 10:
                System.out.println("Iki basamakli en kucuk sayi");
                break;
            case 100:
                System.out.println("Uc basamakli en kucuk sayi");
                break;
            case 1000:
                System.out.println("Dort basamakli en kucuk sayi");
                break;
            default:
                System.out.println("Girdiginiz sayiyi degistirin");


        }


    }

}
