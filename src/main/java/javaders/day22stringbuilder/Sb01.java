package javaders.day22stringbuilder;

public class Sb01 {

    
    /*
        1) "String builder" String ureten bir Class'dir.
        2) String Class kullanarak String uretiriz Java neden "StringBuilder" Class'i da olusturdu?
            "String" Class "immutable(degistirilemez)" String uretir. "StringBuilder" Class "mutable(degistirilebilir)" String uretir.
        3) "immutable" olmak demek orijinal degerin korunmasi degistirilemez olmasi demektir.
            "mutable" olmak demek, orijinal degerin degistirilebilir olmasi demektir.
        4)"capacity" Java'nin size verdigi data depolama yer sayisidir.
          "length" ise size verilen data depolama yerinin kullanilan kismidir
        5) Java baslangic olarak size capacity'i 16 olarak verir.
            Siz verilen capacity'i ararsaniz Java yeni capacity'i varolanin 2 katinin 2 fazlasi olacak sekilde degistirir


     */

    public static void main(String[] args) {

        String s = "Java";
        // s + "!"; //Baska konteynira koyarsak orijinali degismez
        // s = s + "!";  Ama boyle yaparsak orijinali de degistirebiliriz istersek.
        // Yani varolani da istersek degistirebiliyoruz

        String u = "Apex";
        String v = "Apex";
        String y = "C++";
        //Yukaridaki gibi ayni data'da farkli isimde String variable uretirsek, ikinci conteyner'i olusturmaz
        //Biz mesela tekrar "Apex" istersek v, u'nun yolunu kullanir ve o conteyner'a gider. Tekrar olusturmaz conteyner
        //Mesela yukaridaki ornekte "y" icin ayni data'da memory'de yok. Bu yuzden yeni conteyner olusturuyor
        //Ayni olanlar icin yeni conteyner acmaz
        //Mesela yukarida u'yu ileride degistirmek istersek onun icin yeni bir conteyner olusturur Java ve onun icin
            // degeri onun icine koyar

        //1.Way
        StringBuilder t = new StringBuilder("Python");
        System.out.println("t = " + t);//Python
        //StringBuilder'larda bu sekilde olusturulur. Yine Heap memory'de yer aciyor.
        //Degistirmek istersek bu String'i Java direkt varolani degistiriyor("mutable").
            // Tersi normal String olan ve "immutable"
            //Pozitif : Surekli Memory de yeni yer kullanmiyor
            //Negatif : Orjinali ilerde lazim olabilir ama bunda orijinali kaybediyoruz


        //StringBuilder'lara nasil ekleme yapilabilir?
        t.append("!").append("@@@"); //Atama yapmadan method ile orijinal degeri degistirdik.
        //Istersek method chain(zincir) de yapabiliriz, yukaridaki gibi.
        //Varolan update ediliyor. //append(eklemek)
        System.out.println("t = " + t);//Python!@@@

        //2.Way
        StringBuilder r = new StringBuilder();
        System.out.println("r = " + r);//

        r.append('c');
        System.out.println("r = " + r);//c

        //"capacity" ve length arasindaki fark nedir?
        //Yapabilecegimiz is capacity, yaptigimiz is lenghth
        StringBuilder sb1 = new StringBuilder("Money");

        int capacity = sb1.capacity();
        System.out.println("capacity = " + capacity);//21
        //Biz StringBuilder olusturdugumuzda Java bize otomatik olarak 16 tane bosluk olan conteyner veriyor.
        //Sonrasinda gelen her sey bu conteyner'i genisletiyor. Bu yuzden 5+16 = 21 oldu.

        int length = sb1.length();
        System.out.println("length = " + length);//"Money" ==> 5

        sb1.append("!").append("................");//Burada ekleme yaptik o yuzden length 6 oldu.
        //Ama append ile birlestirme yaparsak conteyner genislemez bos olan yerlere ekleme yapar bu yuzden capacity
            //degismez
        //Java Capacity'i arttirirken Java dolu olan capacity'i iki katina cikarir ve 2 tane de ekler
            //Ornek: Capacity = 21, length = 21 ve 5 eklemek istersek Capacity 44 olur
        int c = sb1.capacity();
        System.out.println("c = " + c);

        int ln = sb1.length();
        System.out.println("ln = " + ln);

        //Default capacity'i degistirebilir miyiz?
        StringBuilder sb2 = new StringBuilder(2);
        System.out.println("sb2 = " + sb2);
        sb2.append("...");
        System.out.println("sb2 capacity = " + sb2.capacity());//Varolan'in 2 kati +2 ekler hep



















    }//main
}//class
