package javaders.day05typecastingasciivaluestringmanupulations;

public class C02_AsciiValue {
    public static void main(String[] args) {

        

        //double ve float'in hassasiyeti yani virgulden sonrasi buyuk bu yuzden siralama o sekilde

        //Numeric data types: byte-short-int-long-float-double
        //Char ise hem sayisal bir degeri vardir hem de resim karakteri barindirabilme ozelligi vardir
        //boolean Numeric olmayan data Type'dir

        int asciiA = 'A'; //Output: 65. Bu sekilde Char ifadelerinin Ascii degerlerini bulabiliriz
        System.out.println("asciiA = " + asciiA);
        int asciia = 'a';
        System.out.println("asciia = " + asciia); //Output: 97

        int asciiUnlem = '!';
        System.out.println("asciiUnlem = " + asciiUnlem); //Output:33

        int asciiSpace = ' ';  //Boslugun da bir degeri vardir
        System.out.println("asciiSpace = " + asciiSpace); //Output: 32

        //int asciiHiclik = ''; Bu sekilde yazamazsin. Bu ornekte hicbir sey yazmadik. bosluk da olsa tek ifade lazim

        int asciiSembol = '*';
        System.out.println("asciiSembol = " + asciiSembol); //Output: 42

        char ch = 'Z';          //Resim
        char sembol = '*';      //Resim
        char isaret = '?';      //Resim
        char space = ' ';       //Resim
        char rakam = '9';       //Numeric
        char sayi = '0';        //Numeric

        int deger = 20;
        char smbl = '$';
        System.out.println(deger + smbl); //Output: 56. Ascii Table'daki $ sembolunun degerini alip islem yapti
        //$ Isareti Ascii table'daki degeri 36 + 20 = 56

        int deger2 = 0;
        char smbl2 = '+';
        System.out.println(deger2 + smbl2); //Output: 43

        System.out.println("deger2+smbl2 = " + deger2 + smbl2); //Output: deger2+smbl2 = 0+
        //Burada parantez kullanmadigimiz icin toplama degil birlestirme yapiyor

        System.out.println("deger2+smbl2 = " + (deger2 + smbl2)); //Output: 43
        //Burada parantez kullandigimiz icin birlestirme degil toplama yapti

        String name = "100";
        int number = 998;
        System.out.println(name + number); //Output: 100998.
        //Birlestirme islemine Concatination(uc uca ekleme, yan yana yazdirma) denir


        String str1 = "Java";
        char ch3 = 'G';
        int sayi1 = 5;

        System.out.println(str1 + ch3 + sayi1); //Output:JavaG5
        //Burada ise islem onceliginden dolayi String char'ii String'e donusturuyor

        System.out.println(str1 + (ch3 + sayi1));//Output: Java76

        System.out.println(ch3 + sayi1 + str1); //Output; 76Java
        //Burada islem onceliginden dolayi char data'sini ascii degeri olarak aliyor

        char rakam1 = '1';
        System.out.println("rakam1 = " + rakam1);
        char rakam2 = '2';
        System.out.println("rakam2 = " + rakam2);
        char rakam3 = '3';
        System.out.println("rakam3 = " + rakam3);
        char rakam4 = '4';
        System.out.println("rakam4 = " + rakam4);

        System.out.println("rakam1+rakam2+rakam3+rakam4 = " + rakam1 + rakam2 + rakam3 + rakam4); //Output: 1234
        System.out.println("rakam1+rakam2+rakam3+rakam4 = " + (rakam1 + rakam2 + rakam3 + rakam4));//Output: 202. Ascii toplamlari

        //Ascii degerleri  1==>49  2==>50   3==>51  4==>52

        System.out.println(rakam1 + rakam2 + rakam3 + rakam4); //Output: 202;
        //Sadece char degerlerini boyle yazarsak birlestirme yapmaz Ascii degerlerini isleme alir

        System.out.println(rakam1); //Output: 1.
        //Matematiksel islemler yaparken char'in solunda String gibi ifadeler yoksa char'in Ascii degerleri kullanilir
        //Ama yukaridaki gibi sade seklinde yazdirdiginda resim olarak kullanilir

        //**********        Ascii degerlerinden faydalinalarak neler yapilabilir?      ********************

        byte b = 5;
        char ch2 = 'h';
        int asciih = 'h';
        System.out.println("asciih = " + asciih);//104 //Bu sekilde Ascii degerleri gorebiliriz
        int ascii5 = '5';
        System.out.println("ascii5 = " + ascii5);//53

        System.out.println("b>ch2 = " + (b > ch2)); //Output: false   //5>104 false
        //Yukaridaki kiyaslamayi Java 5'i Ascii degerine cevirerek yapar
        /*
        Kiyaslamalarda her iki tarafta numeric'se direkt kiyaslar ama en az bir taraf numeric degilse o zaman iki
        degeri de Ascii table'daki degerlerine gore kiyaslar
         */


        long l = 542168784578L;
        System.out.println("ch2>l " + (ch2 > l)); //Output: false. ch2 Ascii degeri ile Long sayisi kiyaslandi

        float f = 2.45678f;
        double d = 2.19658;
        System.out.println("f>d " + (f > d)); //Output: true

        /*
        Kiyaslamalarda her iki tarafta numeric'se direkt kiyaslar ama bir taraf numeric degilse o yaman numeric olmayan
        kismin Ascii tablosundaki degeri alinir
         */

        byte sayi3 = 5;
        byte sayi4 = 6;
        System.out.println("sayi3<sayi4 " + (sayi3 < sayi4)); //true //Numeric oldugu icin direkt sayilari karsilastiriyor
        System.out.println("b<f " + (b < f));//false

        int sayiInt = 100;
        long sayiLong = 100L;
        System.out.println("sayiInt<sayiLong : " + (sayiInt < sayiLong));//false //Cunku iki sayi da esit
        System.out.println("sayiInt==sayiLong : " + (sayiInt == sayiLong)); //true

        int sayiInt2 = 200;
        System.out.println("sayiInt2==sayiLong : " + (sayiInt2 >= sayiLong));//true

        int sayiInt3 = 9;
        char sayiChar = '9';

        System.out.println("sayiInt3>=sayiChar "+(sayiInt3>=sayiChar)); //false
        //Cunku 9<'9' ' un Ascii degerinden


        /*
        String str = "9";
        System.out.println("sayiChar>str "+(sayiChar>str));
        Bu kiyasi yapmamiza zaten Java izin vermiyor

        Iki String'i de Java kiyaslamaz
         */


        //Asagidaki ornegi sor
        byte i = 8;
        char j = '6';
        System.out.println(i>j);



    }//main
}//class
