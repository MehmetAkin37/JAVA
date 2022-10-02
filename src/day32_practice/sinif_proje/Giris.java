package day32_practice.sinif_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {

    public static void main(String[] args) {

        /*
    * ogretmen bilgilerini kullanicidan aliniz
    * aldiginiz bilgilerrden object ureterek yeni
     ogretmenler olusturun ve bilgilerini yazdirin
    */

        System.out.println("Hosgeldiniz okulumuza");

        System.out.println("Isminizi giriniz");
        Scanner scan = new Scanner(System.in);
        String isim = scan.nextLine();

        System.out.println("Soyisim giriniz");
        String soyIsim = scan.nextLine();

        System.out.println("Yasinizi giriniz");
        int yas = scan.nextInt();

        System.out.println("Bransinizi giriniz");
        String brans = scan.next();                // tel ile birlestirdigi icin Line i sildik

        System.out.println("Telefon no giriniz");
        String tel = scan.next();                  // Burada da ayni seyi yaptik

        //scan.nextLine(); // duumy hayalet komutu

        OgretmenBilgileri adayOgretmen = new OgretmenBilgileri(isim,soyIsim,yas,brans,tel);
        List<OgretmenBilgileri> ogretmenList = new ArrayList<>();
        ogretmenList.add(adayOgretmen);

        System.out.println("ogretmenList = " + ogretmenList);


    }

}
