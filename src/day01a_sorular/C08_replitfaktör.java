package day01a_sorular;

public class C08_replitfaktör {

    public static void main(String[] args) {

        /* FOR WHILE 4. SORU
        *Write a return method that accepts an integer as input and calculates factorial and prints like output.
        Input : 6
        Output: 6!=6*5*4*3*2*1=720
        */

        int input = 10;
        String str = "";
        int input2 = 1;

        faktor1(input);
        faktor2(input, str);

        System.out.println(input + "!=" + faktor2(input, str) + input2 + "=" + faktor1(input));

    }

    private static int faktor1(int input) {

        int faktoryel = 1;
        for (int i = 1; i <= input; i++) {
            faktoryel *= i;
        }

        return faktoryel;

    }

    private static String faktor2(int input, String str) {

        for (int i = input; i > 1; i--) {
            str += i + "*";
        }

        return str;
    }


}


/*      METHOD OLUSTURMADAN IKINCI YOL :

        int input =6;
        String str = "";
        int input2 = 1;

        int faktoryel = 1;


        for (int i = 1; i <= input; i++) {
            faktoryel *= i;
        }

        for (int i = input; i > 1; i--) {
            str += i + "*";


        }
        System.out.println(input + "!=" + str + input2 + "=" + faktoryel);
*/



