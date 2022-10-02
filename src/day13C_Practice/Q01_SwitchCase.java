package day13C_Practice;

public class Q01_SwitchCase {

    public static void main(String[] args) {

        /*
    gunleri gösterebilen bir program yazın

    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/

        String gun = "Sali";

        switch (gun) {

            case "Pazartesi":    // gunleri araya virgul koyarak da yazabiliriz
            case "Sali":
                System.out.println("Java dersi");
                break;

            case "Carsamba":
            case "Cumartesi":
                System.out.println("Sql dersi");
                break;

            case "Persembe":
            case "Cuma":
                System.out.println("Selenyum dersi");
                break;

            default:
                System.out.println("Izin gunu");
                break;


        }


    }
}
