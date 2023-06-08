package javaders.day05typecastingasciivaluestringmanupulations;

public class C01_MatematikselIslemler {
    public static void main(String[] args) {

        /*
        -Javada farkli data type'lari arasinda islem yapiliyorsa sonuc buyuk olan data type'inin turunde olur
        -Karsilastirma operatorlerinde sonuc hep boolean doner
        -Karsilastirma operatorleri: <, >, !=, ==, &&, ||, ......
         */

        System.out.println(4 * (5 + 2) / 3);  //Output: 9. int/int ==> int olur bu yuzden virgulden sonrasini atar
        System.out.println(6 * 16 / 8);//Output: 12
        double sonuc = 4 * (2 + 5) / 3; //Burada islem tek data tipinde yapiliyor yani int
        System.out.println(sonuc);
        /*
        Output: 9.0.  Cunku islem yapan sayilar integer sonuc integer cikar ama double icine yazdigimiz icin
        islem bittikten sonra virgulden sonrasi atilir ama sonucta ondalikli yazdirir
         */

        double sonuc2 = 4.0 * (2 + 5) / 3; //Burada islem iki data tipinde yapiliyor int ve double
        System.out.println("sonuc2 = " + sonuc2);//Output: 9.333333....
        /*
        Burada output 9.3333.... olacak cunku islem iki data tipinde yapilinca sonuc buyuk olan data tipinde cikar
        sonucu da yine double'a atadigimiz icin kusuratlari elde ederiz
         */

        System.out.println(4 * (1 + 5) / 3); //Output: 8

        int sayi1 = 5;
        int sayi2 = 2;
        double sayi3 = 2;
        System.out.println(sayi1 / sayi2); //Output: 2. Normalde 2.5 ama int/int ==> int olacagi icin virgulden sonrasi atilir

        System.out.println(sayi1 / sayi3);//Output: 2. " farkli data tipi oldugu icin buyuk olani seciyor

        System.out.println(sayi1 + sayi3 / sayi2);
        //Output: 6.0. Cunku once islem onceligi sonra islem yonu calisiyor ve double var islemde o yuzden output double.

        boolean first = 2 < 4;
        boolean second = 2 + 6 != 8;
        boolean third = 2 + 3 * 5 < 20;

        System.out.println("first = " + first);     //Output: true
        System.out.println("second = " + second);   //Output: false
        System.out.println("third = " + third);     //Output: true

        System.out.println(first && second); //Output: false
        System.out.println(first || second || third); //Output: true



    }//main

}//class
