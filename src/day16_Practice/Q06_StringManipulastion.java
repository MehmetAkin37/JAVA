package day16_Practice;

public class Q06_StringManipulastion {

    public static void main(String[] args) {

        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.


        String str = "Java ile mucadeleye devam" ;

        if (str.contains(" ")) {

            System.out.println("Bu Stringde bosluk bulunmaktadir");

        } else {
            System.out.println("Bu Stringde bosluk yoktur");

        }

         if (str == ""){
             System.out.println("Bu String bostur");

         } else {
             System.out.println("Bu String bos degildir");
         }


         // IKICI YOL :
/*
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int bosluk = str.indexOf(' ');
        if (bosluk == -1 && !(str.isEmpty())) {
            System.out.println("bosluk yoktur");
        } else {
            System.out.println("bosluk vardir");
        }


 */

    }
}
