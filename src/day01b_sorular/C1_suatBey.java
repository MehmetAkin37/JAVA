package day01b_sorular;

public class C1_suatBey {

    public static void main(String[] args) {

         /*
    String array dizisindeli 4 harfli kelimeleri return eden methodu yazınız.

    Test Data:
    isFourLetters(["Tomato", "Potato", "Pair"])

     ["Pair"]

     */
        String[] arr = {"Tomato", "Potato", "Pair"};

        kelimeDon(arr);

    }


    private static void kelimeDon(String[] arr) {


        String dortHarfli = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i].length() == 4) {
                dortHarfli = arr[i];

            }

        }

        System.out.println(dortHarfli);
    }

}
