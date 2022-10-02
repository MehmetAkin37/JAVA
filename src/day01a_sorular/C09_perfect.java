package day01a_sorular;

public class C09_perfect {

    public static void main(String[] args) {

        /* FOR WHILE 7. SORU
        Numaranın Mükemmel sayı olup olmadığını kontrol ederek
        java kodu yazın. Herhangi bir sayı, sayının kendisi hariç
        pozitif bölenlerinin toplamı bu sayıya eşitse, Java Mükemmel
        Numarası olabilir.

        Giriş:6 Çıkış:6 Mükemmel Sayı         6 nin bolenleri : 1 , 2, 3 ,           6
        Giriş:7 Çıkış:7 Mükemmel Sayı Değil   7 nin bolenleri : 1 ,                  7
         */

        int sayi = 28;  //  1 2 4 7 14
        int toplam = 0;

        for (int i = 1; i < sayi; i++) {

            if (sayi % i == 0) {
                toplam += i;
            }

        }

        if (sayi == toplam) {
            System.out.println(sayi + " is Perfect Number");

        } else {
            System.out.println(sayi + " is not Perfect Number");
        }



    }
}
