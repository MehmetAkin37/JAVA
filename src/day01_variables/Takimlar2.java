package day01_variables;

public class Takimlar2 {


    String takim = "Takim belirtilmedi"; // 1
    String renk;


    Takimlar2 (){   // 3

    }


    public Takimlar2(String takim, String renk) {  // 5
        this.takim = takim;
        this.renk = renk;
    }


    @Override
    public String toString() {   // 6
        return
                "takim : " + takim +
                        "\nrenk : " + renk ;
    }

}


















