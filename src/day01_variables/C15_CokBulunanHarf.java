package day01_variables;

public class C15_CokBulunanHarf {

    public static void main(String[] args) {

        /*

        Write a Java program to get a String from user as input
        and find the maximum occurring character in that string. (Ignore case sensitivity)

        input :

         Learning java is easy

         output:

         maximum occurring character is : a
         */

        String kelime = "Learning java is easy";
        kelime = kelime.toLowerCase();

        int sayac = 0;
        int harfsayisi = 0;
        int index = 0;


        for (int i = 0; i < kelime.length(); i++) {
            sayac = 0;

            for (int j = 0; j < kelime.length(); j++) {

                if (kelime.charAt(i) == kelime.charAt(j)) {
                    sayac++;

                }

            }
            if (sayac > harfsayisi) {
                harfsayisi = sayac;
                index = i;
            }
        }

        System.out.println("maximum occurring character is : " + harfsayisi +" tane " + kelime.charAt(index) + " vardir");


    }
}

/*
static void harfBul(String cumle,char harf) {
        int sayac = 0;
        for(int i = 0; i < cumle.length(); i++)
        {
            if(cumle.charAt(i) == harf) {
                sayac++;
            }
        }
        System.out.println("Girdiginiz cumle veya kelımede " + sayac + " tane '" + harf + "' vardır");
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir cumle veya kelime giriniz: ");
        String cumle = scan.nextLine();
        System.out.print("Bir harf giriniz: ");
        char harf = scan.next().charAt(0);

        harfBul(cumle,harf);
    }
 */