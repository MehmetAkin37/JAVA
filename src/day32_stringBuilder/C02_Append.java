package day32_stringBuilder;

public class C02_Append {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java daha ne yapsin");

        sb.append("?");

        sb.append("Java" , 2,4);
        System.out.println(sb);    //   Java daha ne yapsin?va

        System.out.println(sb);   // Java daha ne yapsin?

        // append istedigimiz String'i en sona ekler

        sb.insert(4," herseyi dusunmus,");

        System.out.println(sb);    //  Java herseyi dusunmus, daha ne yapsin?

        sb.insert(22,"Valla valla",5,11);
        System.out.println(sb);    //  Java herseyi dusunmus, valla daha ne yapsin?

        // araya ekleme yapmak istedigimizde append degil insert kullanmaliyiz


    }
}
