package day01_variables;

public class Student2 {

    public String ad;                // 1
    public String soyad;
    public int yas;


    public Student2(String ad, String soyad, int yas) {  // 4
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }


    @Override
    public String toString() {      // 5
        return
                ad + " " + soyad + " " + yas;
    }


    public static String changeName(Student2 st) {   // 7
        st.ad = "Cihangir";
        st.soyad = "Caliskan";
        st.yas = 37;

        return st.ad + " " + st.soyad + " " + st.yas;
    }


    public static String changeSurname(Student2 st, String lastsurname) {  // 10

        st.soyad = lastsurname;
        return st.ad + " " + st.soyad + " " + st.yas;

    }

}





































