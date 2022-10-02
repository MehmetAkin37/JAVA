package day01_variables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_replitArray {

    public static void main(String[] args) {

       /* Write a code that returns the duplicate chars in a String array.(interview Question)

        Input :

        String str=“”

        Output: [a, s]*/


        String str = "Javaisalsoeasy";

        String[] str2 = str.split("");

        Arrays.sort(str2);

        List<String> tekrarEdenler = new ArrayList<>();


        for (int i = 0; i < str2.length - 1; i++) {

            if (str2[i].equals(str2[i + 1]) && !tekrarEdenler.contains(str2[i])) {

                tekrarEdenler.add(str2[i]);

            }
        }
        System.out.println(tekrarEdenler);
        // yorumlar onemli


    }

}






