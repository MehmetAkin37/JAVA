package day30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {

    public static void main(String[] args) throws InterruptedException {


        LocalTime time1 = LocalTime.now() ;
        System.out.println(time1);   // 18:12:25.315902200

        /*
         Bizim olusturdugumuz date ve time
         canli saat veya tarih degildir
         LocalTime.now(); kullandigimiz satirda
         o anki tarih veya saati alip
         bizim variable'imiza store eder.
         time1 variable'inin degeri SABITTIR
         */

        Thread.sleep(3000);

        time1 = LocalTime.now() ;

        System.out.println(time1);   // 18:31:30.338001100

        System.out.println(time1.getSecond());  // 30

        System.out.println(time1.plusSeconds(10000));  // 21:18:10.338001100

        System.out.println(time1.minusMinutes(200));  // 15:13:49.776054300

        System.out.println(time1.withHour(3));  // 03:35:54.519238600  sadece saat kismini 3 yapti






    }
}
