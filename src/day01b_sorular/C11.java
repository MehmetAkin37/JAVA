package day01b_sorular;

import java.util.ArrayList;
import java.util.List;

public class C11 {
    public static void main(String[] args) {

        String[] arr = {"Tomato", "Potato", "Pair", "Elma", "Erik"};

        kelimeDon3(arr);


    }

    private static void kelimeDon3(String[] arr) {

        List<String> dortHarfli = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {

            if (arr[i].length() == 4) {
                dortHarfli.add(arr[i]);

            }

        }

        System.out.println(dortHarfli);
    }
}
