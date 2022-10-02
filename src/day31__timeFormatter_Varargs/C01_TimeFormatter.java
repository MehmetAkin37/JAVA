package day31__timeFormatter_Varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {

    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println("ilk olusturulan tarih : " + tarihSaat);  // 2022-07-25T20:41:09.225333300

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/M/yy hh:mm a") ;
        System.out.println(dtf.format(tarihSaat));  // 25/7/22 08:45

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("d/MMM/yyyy HH:mm a") ;
        System.out.println(dtf2.format(tarihSaat));  // 25/Juli/2022 20:46










    }
}
