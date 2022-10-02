package day01_variables;

import java.util.ArrayList;
import java.util.List;

public class C18_listTers {
    public static void main(String[] args) {


        /*
        Input :

        It is very nice to write code.

       Output :

        .edoc etirw ot ecin yrev si tI

         */

        String input = "It is very nice to write code." ;

        List<String> output = new ArrayList<>() ;

        for (int i = input.length()-1; i >=0; i--) {
            output.add(input.substring(i,i+1)) ;

        }

        for (int i = 0; i < output.size(); i++) {
            System.out.print(output.get(i));

        }


    }
}
