package day22_multiDimensionalArray;

public class C10_Pro2Multi {

    public static void main(String[] args) {

        // Soru 1) multi

        int[][] sayilar = {{1, 2, 3}, {4, 5, 6}};

        carpimi(sayilar) ;


    }

    public static void carpimi(int[][] sayilar) {

        int carpim = 1;

        for (int i = 0; i < sayilar.length; i++) {

            for (int j = 0; j < sayilar[i].length; j++) {

                carpim *= sayilar[i][j];


            }

        }
        System.out.println("Tüm elemanlarinin carpimi : " + carpim);


    }
}
