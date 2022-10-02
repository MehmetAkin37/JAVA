package day22_multiDimensionalArray;

public class C11_Pro3Multi {

    public static void main(String[] args) {

        // soru 3 ) multi

        int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};


        for (int i = 0; i < arr1.length && i < arr2.length; i++) {

            for (int j = 0; j < arr1[i].length && j < arr2[i].length; j++)

                System.out.print(arr1[i][j] + arr2[i][j] + " ");

        }

    }
}

// ikinci yol

/*
int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};


        int sinir = 0;
        int toplam = 0;

        for (int i = 0; i < arr1.length; i++) {
            sinir = arr1[i].length;
            if (arr1[i].length > arr2[i].length) {
                sinir = arr2[i].length;
            }
            for (int j = 0; j < sinir; j++) {
                toplam = arr1[i][j] + arr2[i][j];
                System.out.println(i + "," + j + " index indeki elemanlarin toplami : " + toplam);
            }

        }
 */
