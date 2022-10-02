package day03__scanner;

public class C03_Swap2 {

    public static void main(String[] args) {

        // bir onceki swap sorusunu bos kova kullanmadan yapin


        int a= 12 ;
        int b= 18 ;

        a = a+b ;    // 30 = 12+18
        b = a-b ;   // b= 30-18   b=12
        a = a-b ;   // a= 30-12   a=18

        System.out.println("Swaptan sonra a : " + a);
        System.out.println("Swaptan sonra b : " + b);


    }

}
