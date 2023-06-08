package practices.day_07_practice;

import java.util.Scanner;

public class C01_While {
    public static void main(String[] args) {


        // Kullanıcıdan sisteme bir rakam girmesini isteyiniz
        // kullanıcının girdigi rakamın while loop kullanarak faktoriyelini bulunuz


        Scanner scan = new Scanner(System.in);


        System.out.println("Bir Rakam Giriniz");
        int rakam = scan.nextInt();

        int num = 1;

        int faktoriyel = 1;

        while (num<=rakam){

            faktoriyel=faktoriyel*num;

            num++;

        }
        System.out.println(rakam + "!= " + faktoriyel);










    }//main
}//class
