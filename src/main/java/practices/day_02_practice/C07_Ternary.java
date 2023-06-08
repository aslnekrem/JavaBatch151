package practices.day_02_practice;

import java.util.Scanner;

public class C07_Ternary {
    public static void main(String[] args) {
/*
        Kullanıcıdan bir karakter sisteme girmesini isteyin.
        Ternary kullanarak;
        bu karakterin bir harf olup olmadıgını kontrol edin.
        Harf ise büyük veya kucuk harf oldugunu konsola yazdırın
        Harf degilse konsola "Harf Degil" yazdırın
     */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir karakter girin: ");
        char karakter = scanner.next().charAt(0);

        String sonuc = (karakter >= 'a' && karakter <= 'z' || karakter >= 'A' && karakter <= 'Z')
                ? (karakter >= 'a' && karakter <= 'z' ? "Küçük harf" : "Büyük harf")
                : "Harf değil";

        System.out.println(sonuc);


    }//main
}//class
