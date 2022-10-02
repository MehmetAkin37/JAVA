package day15_overloading_forLoop;

public class C06_StringTerseCevir {


    public static void main(String[] args) {

        // input olarak verilen Stringi terse cevirip yazdiran bir method olusturun

        String input = "Java gun gectikce guzellesiyor";

        terstenYazdira(input);


    }

    public static void terstenYazdira(String input) {

        //String tersInput = input.substring(input.length() - 1);

        String tersInput = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            tersInput += input.substring(i, i + 1);
        }

        System.out.println(tersInput);


    }

}
