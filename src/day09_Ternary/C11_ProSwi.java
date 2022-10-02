package day09_Ternary;

import java.util.Scanner;

public class C11_ProSwi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen SDET kisaltmasindaki harflerden birisini yaziniz");
        char harf = scan.next().charAt(0);

        switch (harf) {

            case 'S':
                System.out.println("Software");
                break ;
            case 'D':
                System.out.println("Developer");
                break ;
            case 'E':
                System.out.println("Engineer");
                break ;
            case 'T':
                System.out.println("In Testing");
                break ;
            default:
                System.out.println("Lutfen gecerli bir harf giriniz");


        }

    }

}
