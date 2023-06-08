package practices.day_02_practice;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {
/*
            Kullanıcıdan bir tam sayı sisteme girmesini isteyin
            Ternary kullanarak;
            Girilen sayı çift ise konsola "Cift Sayi" yazdirin
            Girilen Sayi tek ise girilen sayıyı 3 artırarak konsola yazdırınız.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tam sayı girin: ");
        int sayi = scanner.nextInt();

        String sonuc = sayi % 2 == 0 ? "Cift Sayi" : "Tek Sayi: " + (sayi + 3);
        System.out.println(sonuc);


    }//main
}//class
