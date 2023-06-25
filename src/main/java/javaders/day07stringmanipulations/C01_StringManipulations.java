package javaders.day07stringmanipulations;

public class C01_StringManipulations {
    public static void main(String[] args) {
        String s = "Learn Java earn money";


        

        boolean isEnd = s.endsWith("money");
        System.out.println("isEnd = " + isEnd);//true

        //********************* replace () **************************\\

            /*
            
               String bir data dondurur
               tekli karakterler ile de coklu karakterler ile de calisir
               Ancak her iki taraftada " "  ya da  her iki taraftada ' ' kullanilmalidir.
            */



        // Ex : s String'indeki "money" kelimesini "dolar" kelimesi ile yer degistiriniz
        /*replace()
        Metnin icerisindeki belirli bir datanin yerine verilen diger datayi yerlestirir.
        Bize String bir data döndürür.
                Tekli (Char) karakterler ile de coklu (String) karakter ile de calisir.
                Ancak her iki tarafta da cift tirnak "" ya da her iki tarafta da tek tirnak '' kullanilmalidir.
                Bir karaker yerine birden cok karakter koyulabilir.
        Char data type'inin icerisne mutlaka bir karakter yerlestrilmeli.
        Space bir karakterdir. Ancak hiclik javada char icin kullanilmaz.
                Bu nedenle silme islemi yaparken mutlaka String kullanilmali.

         */

        String s1 = s.replace("money", "dolar");
        System.out.println("s1 = " + s1);

        //Ex : s String'indeki "earn" kelimesini "win" kelimesine ceviriniz
        //Learn Java win money
        //Lwin Java win money
        System.out.println(s.replace("earn", "win"));//Lwin Java win money

        // Ex : s String'indeki "a" harflerini "*" degistiriniz

        String s2 = s.replace("a", "*"); //Burada replace method'unu String ile kullandik
        System.out.println("s2 = " + s2);

        String s3 = s.replace('a', '*');//Burada replace method'unu Char ile kullandik
        System.out.println("s3 = " + s3); //Le*rn J*v* e*rn money

        //Ex: s String'indeki "n" harflerini "***" degistiriniz
        // replace method'u bir tarafi char bir tarafi String olarak kullanamazsin

        String s4 = s.replace("n", "***");
        System.out.println("s4 = " + s4); //s4 = Lear*** Java ear*** mo***ey

        //Ex: s String'indeki tum e harflerini siliniz

        //String s = "Learn Java earn money";

        String s5 = s.replace("e", ""); //Bosluk silmek demek degil. Cunku bosluk da bir data Java icin
        /*
        String ile hicbir sey yazmazsak olur ama bunu Char ile yapamiyoruz Cunku Char konteynirlarda hiclik yoktur.
        Char konteynirinin icerisine mutlaka bir karakter yerlestirilmelidir. Space bir karakterdir, char icine yerlestirilebilir
        ancak hiclik java'da char icin kullanilamaz. Bu nedenle silme islemi yaparken mutlaka String kullanmaliyiz

         */
        System.out.println("s5 = " + s5);

        String t = "Yucel 25 ya$indadir sandik ama 30'mis";
        //Ex: t String'indeki tum rakamlari "*" a ceviriniz
        String t1 = t.replaceAll("[0-9]","*");
        System.out.println("t1 = " + t1);

        /*3) replaceAll()Bir grup datayi degistirmek icin kullanilir.
                       Bir grup datayi ifade edebilmek icin Regular
                       Expression (Regex) kullanilir
                       */


        /*
        En cok kullanilan Regex'ler
        1) Tum Rakamlar ==> [0-9]
        2) Tum Kucuk Harfler ==> [a-z]
        3) Tum Buyuk Harfler ==> [A-Z]
        4) Tum Harfler ==> [a-zA-Z]
        5) Tum Harfler ve Rakamlar ==> [a-zA-z0-9]
        6) Tum Noktalama Isaretleri ==> \\p{Punct}
        7) Tum Sesli Harfler ==> [aeiouAEIOU]

        ^ ==> den farkli, haricinde

        1) Tum Rakamlar Haric ==> [^0-9]
        2) Tum Kucuk Harfler Haric ==> [^a-z]
        3) Tum Buyuk Harfler Haric ==> [^A-Z]
        4) Tum Harfler Haric ==> [^a-zA-Z]
        5) Tum Harfler ve Rakamlar Haric ==> [^a-zA-z0-9]
        6) Tum Noktalama Isaretleri Haric ==> [\\P{P}] //Semboller de @&% gibi noktalama olarak kabul ediliyor
        7) Tum Sesli Harfler Haric ==> [^aeiouAEIOU]

         */

        //Ex: t String'indeki tum harfleri ve tum rakamlari ! e ceviriniz

        String t2 = t.replaceAll("[a-zA-Z0-9]","!");
        // Kesme isareti ve dolar harf olmadigi icin onu bu kod ile degistirmiyor
        System.out.println("t2 = " + t2); //!!!!! !! !!$!!!!!!! !!!!!! !!! !!'!!!

        //Ex: t String'indeki tum space'ler disindaki karakterleri +'ya donusturunuz
        String t3 =t.replaceAll("[^ ]","+");
        System.out.println("t3 = " + t3); //t3 = +++++ ++ ++++++++++ ++++++ +++ ++++++

        //Ex : t String'indeki tum kucuk harfler disindaki karakterleri ? 'ne donusturunuz
        String t4=t.replaceAll("[^a-z]","?");
        System.out.println(t4); //?ucel????ya?indadir?sandik?ama????mis

        //Ex: t String'deki tum sesli harfler disindaki karakterleri &' ye donusturunuz

        String t5 = t.replaceAll("[^aeiouAEIOU]","&");
        System.out.println("t5 = " + t5); //t5 = &u&e&&&&&&a&i&&a&i&&&a&&i&&a&a&&&&&i&


    }//main
}//class
