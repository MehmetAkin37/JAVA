package day36_inheritanceDataTypeKullanimi;

public class CMemur extends BMuhasebe{

    protected int saatUcreti = 12 ;
    protected int gunlukMesai = 9;


    protected void maas(){
        System.out.println("Memurlar : " + (30*saatUcreti*gunlukMesai) + " maas alir");
    }


    protected void ozelSigorta(){
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {

        CMemur mmr1 = new CMemur();
        System.out.println(mmr1.gunlukMesai);  // 9
        System.out.println(mmr1.saatUcreti);   // 12

        mmr1.maas();           // Memurlar : 3240 maas alir
        mmr1.ozelSigorta();    // Memurlar %60 indirimli ozel sigorta yaptirabilir
        mmr1.sigorta();      // Personel den aldi.  Tum personelimiz sigorta yapilir

        System.out.println(mmr1.isim);           // Personel
        System.out.println(mmr1.soyIsim);         // Personel
        System.out.println(mmr1.departmant);     // Personel

        BMuhasebe mhsb1 = new BMuhasebe();

        /*
        Her ne kadar Memur class'inin icinde olsak da
        olusturdugumuz obje Muhasebe class'indan
        cunku data turu ve constructor BMuhasebe
        String str="Murat";
        ArrayList<Integer> list=new ArrayList<>();
        Integer sayi=20;
        BMuhasebe class'i da obje olusturulabilen bir class'dir yanidata turudur
    */

        System.out.println(mhsb1.gunlukMesai);  // 8   Muhasebeden alir
        System.out.println(mhsb1.saatUcreti);   // 10 Muhasebe alir

        mhsb1.maas();           // Muhasebe alir
        mhsb1.ozelSigorta();    // Muhasebe alir
        mhsb1.sigorta();      // Personel den aldi

        System.out.println(mhsb1.isim);           // Personel
        System.out.println(mhsb1.soyIsim);         // Personel
        System.out.println(mhsb1.departmant);     // Personel









    }

}
