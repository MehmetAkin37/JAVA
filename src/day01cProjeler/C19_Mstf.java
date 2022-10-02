package day01cProjeler;

import java.util.Scanner;

public class C19_Mstf {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Bir kullanici adi ve sifre olusturun.
        // Elinizde bir bakiye olsun.
        //kullanici adi ve sifre dogru ise islem seciniz
        //1-) Bakiye sorgulama
        //2-) Para cekme
        //3-)Para yükleme
        //4-)Cikis




        String kullaniciAdi = "mustafa";
        String sifre = "elmas";
        System.out.print("Kullanici Adi: ");
        String kull = scan.nextLine();
        System.out.print("Sifre: ");
        String sif = scan.nextLine();
        if (kullaniciAdi.equals(kull) && sifre.equals(sif)) {
            int bakiye = 1000;
            System.out.println("Hosgeldiniz | Islem Seciniz...");
            System.out.println("1.Bakiye Sorugulama");
            System.out.println("2.Para Çekme");
            System.out.println("3.Para Yükleme");
            System.out.println("4.Çıkış");
            int islem = scan.nextInt();
            switch (islem){
                case 1:
                    System.out.println("Bakiyeniz = " +bakiye +" Euro'dur");
                    break;
                case 2:
                    System.out.println("Mevcut Bakiyiniz : " + bakiye+" Euro'dur" );
                    int cekilecekPara = scan.nextInt();
                    if (cekilecekPara <= bakiye) {
                        System.out.println("Yeni Bakiyeniz : " + (bakiye - cekilecekPara)+" Euro'dur" );
                    }
                    else {
                        System.out.println("Yetersiz Bakiye");
                    }
                    break;
                case 3:
                    System.out.println("Mevcut Bakiyeniz : " + bakiye + " Euro'dur");
                    int miktar = scan.nextInt();
                    System.out.println("Yeni Bakiyeniz : " + (bakiye + miktar) + " Euro'dur");
                    break;
                case 4:
                    System.out.println("Cikis Yapildi. | Tekrar Bekleriz");
                    break;
                default:
                    System.out.println("Gecersiz islem tekrar deneyiniz...");
            }
        }
        else {
            System.out.println("Kullanici Adi veya Sifreniz Yanlistir...");
        }
    }
}
