package day09_Ternary;

import java.util.Scanner;

public class C08_Pro2Tern {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();

        System.out.println(sayi % 2 == 0 ? "Sayi cift" : "Sayi tek");


    }

}
