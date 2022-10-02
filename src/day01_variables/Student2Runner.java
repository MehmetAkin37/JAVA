package day01_variables;

import java.util.Scanner;

import static day01_variables.Student2.changeName;
import static day01_variables.Student2.changeSurname;

public class Student2Runner {


    public static void main(String[] args) {                          // 2

        Student2 student = new Student2("Ahmet", "Akgul", 25);  // 3
        System.out.println(student);                                   // 6

        System.out.println(changeName(student));                       // 8

        Scanner scan = new Scanner(System.in);                         // 9
        System.out.print("Yeni soyad giriniz ? ");
        String yeniSoyad = scan.nextLine();

        System.out.println(changeSurname(student, yeniSoyad));          // 11


    }


}
