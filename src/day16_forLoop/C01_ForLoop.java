package day16_forLoop;

public class C01_ForLoop {

    public static void main(String[] args) {

        // verilen bir pozitif tam sayinin
        // tam bolenlerini yazdiralim

        int input = 20 ;

        for (int i = 1; i <= 20 ; i++) {

            if (input%i == 0){
                System.out.print(i + " ");
            }

        }

    }
}
