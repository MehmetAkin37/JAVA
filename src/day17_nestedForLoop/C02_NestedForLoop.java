package day17_nestedForLoop;

import java.util.Scanner;

public class C02_NestedForLoop {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir rakam isteyin ve girilen rakama gore carpim tablosu olusturun.
        // ornegin kullanici 3 girerse

        // 1 2 3
        // 2 4 6
        // 3 6 9

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir rakam giriniz");
        int rakam = scan.nextInt();

        for (int i = 1; i <= rakam; i++) {

            for (int j = 1; j <= rakam; j++) {

                System.out.print(i * j + " ");

            }

            System.out.println();
        }






    }
}
