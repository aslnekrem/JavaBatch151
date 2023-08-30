package javaders.day10stringmanipulations;

import java.util.Scanner;

public class C01_IfStatement {
    
    
    public static void main(String[] args) {
        
        // If it rains; I will cancel the picnic.
        // Eger yagmur yagarsa ; picnigi iptal edecegim

        // Ex: Verilen bir karakterin buyuk harf ise ekrana
        // "Buyuk Harf " yazdiran kodu yaziniz"

        char ch = 'K';

        if (ch >= 'A' && ch <= 'Z') {
            //Ascii Table'a gore degerledirir eger >, <, ==, +, -, / .... Gibi ifadeler varsa
            //Burada da Ascii table a gore 65-90 arasi Buyuk harf, yani buna gore kosul aldik
            System.out.println("Buyuk Harf");
        }

        // Ex: Verilen sayi cift sayi ise ekrana "Cift Sayi " yazdiran kodu yaziniz

        byte sayi = -8;
        /*
        Karsilastirma Operatorleri : ==
        Esitmi?    !=   EsitDegilMi  >= Buyuk Esit   <= Kucuk Esit
         */


        //kodun dinamik yazilmasi icin variable'in ismi yazilir.
        // Direk deger yazilirsa hurd coding yani tek datalik kod olur
        if (sayi % 2 == 0) {
            System.out.println("Cift Sayi");
        }

        // Ex Verilen bir sayi 300'den kucuk veya 1200 'den buyuk
        // ise "Harika Sayi" yazdiran kodu yaziniz

        int number = -147;

        if (number < 300 || number > 1200) {
            System.out.println("Harika Sayi");
        }

        // Ex : Kullanicidan alinan Datanin Tekmi; CiftMi? oldugunu yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num = input.nextInt();

        // 1. Yol Bagimsiz if Statement
        if (num % 2 == 0) {
            System.out.println("Cift Sayi");
        }//if body Cift

        if (num % 2 != 0) {
            System.out.println("Tek Sayi");
        }

        // 2.Yol If Else
        if (num % 2 == 0) {  //Eger num icerisindeki datanin 2 ye bolumunden kalan 0 'a esitse "Cift Sayi" yazdirir
            System.out.println("Cift Sayi");
        } else {  // else = degilse demek Geriye kalan tum ihtimaller icin burasi calisir
            System.out.println("Tek Sayidir");
        }


        // Ex : Verilen bir sayinin negatif mi ,
        // pozitif mi , notr mu oldugunu soyleyen kodu yaziniz

        int numara =80;

        if(numara<0){
            System.out.println("3 lu kontrol Negatif Sayi");
        }else if(numara == 0){
            System.out.println(" 3 lu kontrol Notr Sayi");
        }else{
            System.out.println("3 lu kontrol Pozitif Sayi");
        }

        //If'lerde curly braces kullanmasak bile calisir ama kodun okunulabilirligi acisindan best practise degildir

    }
}
