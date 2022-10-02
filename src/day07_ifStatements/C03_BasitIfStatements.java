package day07_ifStatements;

public class C03_BasitIfStatements {

    public static void main(String[] args) {

        /*
        Bir if statement'da { kullanilmazsa
        Java ilk satiri sart ile baglar, sonraki satirlar bagimsiz olur
         */

        int sayi = 23;

        if (sayi > 10)
            System.out.println("sayi pozitif");
            System.out.println("pozitif kalacaktik");
            System.out.println("ucuncu satir");


        if (sayi % 2 == 0)
            System.out.println("sayi cift");
            System.out.println("cift kalacaktik");

        if (sayi % 5 == 0)

            System.out.println("sayi 5' in kati");









    }


}
