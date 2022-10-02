package day32_practice.sinif_proje;

public class OgretmenBilgileri {


    String isim ;
    String soyIsim ;
    int yas ;
    String brans ;



    String tel ;



    public OgretmenBilgileri(String isim, String soyIsim, int yas, String brans, String tel) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.yas = yas;
        this.brans = brans;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "OgretmenBilgileri{" +
                "\nisim='" + isim + '\'' +
                "\n soyIsim='" + soyIsim + '\'' +
                "\n yas=" + yas +
                "\n brans='" + brans + '\'' +
                "\ntel='" + tel + '\'' +
                '}';
    }


}
