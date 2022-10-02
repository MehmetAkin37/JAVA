package day01_variables;

public class C14_repMaxMin {

    public static void main(String[] args) {

        //Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array
        //
        //Input : {3,2,5,4,1,6}
        //
        //Output :
        //
        //min: 1
        //
        //max: 6

        int [] arr = {3,2,5,4,1,6};

        minimumBul(arr);
        maximumBul(arr);
        
        
        
    }

    private static void minimumBul(int[] arr) {

        int minSayi = arr [0];

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i] < minSayi) {

                minSayi = arr[i];
            }

        }
        System.out.println("Min sayi : " + minSayi);




    }

    public static void maximumBul(int[] arr) {

        int maxSayi = arr [0];

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i] > maxSayi) {

                maxSayi = arr[i];
            }

        }
        System.out.println("Max sayi : " + maxSayi);




    }


}

