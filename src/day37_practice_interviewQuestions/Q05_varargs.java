package day37_practice_interviewQuestions;

public class Q05_varargs {

    public static void main(String[] args) {

        int[] arr = {17, 23, 33, 9, 20, 55};

        arrTopla(arr);           // foreach ile toplayalim
        varargsToplaList(25, 55, 63, 21, 20);   // for loop ile
        varargsToplaArr(arr);    // varargs ile

        System.out.println( "arrTopla(arr) = " + arrTopla(arr));
        System.out.println("varargsToplaArr(arr) = " + varargsToplaArr(arr));
        //vararrgs array gibi davrandigi icin hehnagi bir array i pm olarak verebiliriz


    }

    private static int varargsToplaArr(int... i) {

        int toplam = 0 ;

        for (int w:i) {
            toplam += w ;
        }
        return toplam ;




    }

    private static void varargsToplaList(int i, int i1, int i2, int i3, int i4) {



    }


    private static int arrTopla(int[] arr) {

        int toplam = 0 ;
        for (int w:arr) {
            toplam += w ;
        }
        return toplam ;
    }


}
