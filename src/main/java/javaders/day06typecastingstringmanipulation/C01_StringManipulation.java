package javaders.day06typecastingstringmanipulation;

public class C01_StringManipulation {
    public static void main(String[] args) {

        String a = "Benim Tek Rakibim Dunku Ben*.";
        String aUpper = a.toUpperCase();    //.toUpperCase, tum harfleri buyutur
        System.out.println("aUpper = " + aUpper);

       
        String aLower = a.toLowerCase();
        System.out.println("aLower = " + aLower);
        //aLower = tek rakibim dunku ben

        //******************   charAt() ***********

        System.out.println("ilk karakter: "+a.charAt(0));//T
        System.out.println(a.charAt(10));//m

        //a String'deki bastan ikinci ve sondan ikinci karakteri aliniz ve yan yana yaazdiriniz

        char firstChar = a.charAt(1);
        char lastSecondChar = a.charAt(21);
        System.out.println("firstChar + lastSecondChar: "+firstChar+lastSecondChar);

        //**************************        length      *********************

        //a String'in de bulunan karakter uzunlugunu bulunuz

        int length = a.length();//23    //length String'in uzunlugunu soyler. Ve saymaya 1'den baslar
        System.out.println("Bu cumlenin length'i = " + length);

        //*******************           substring           **********************

        //sub zaten alt demek. String'in bir alti manasinda
        //Araligi alir. (0,4),Baslangic noktasi 0 bitis noktasi 4. 4 dahil degil

        //a String'indeki ilk 4 data'yi aliniz

        String sub1 = a.substring(0,4); //0 dahil 4 haric. Bu araligi aliyor
        //Burada baslangic ve bitis index'ini veren substring'i kullandik
        //substring 2. kullanimi ise sadece beginIndex i giriyoruz. mesela 4 girdigimizba, 4 ve sonrasindaki
        //leri yazdiriyor
        System.out.println("sub1 = " + sub1);

        //a String'indeki 4.index dahil 7.index haric yazdiriniz

        System.out.println(a.substring(4,7));

        //a String'indeki Rakip kelimesini aliniz

        //"Benim Tek Rakibim Dunku Ben*."

        System.out.println(a.substring(10,15)); //Rakip

        System.out.println(a.substring(10));//10.Index dahil baslayip cumlenin sonuna kadar gider
        //yukaridaki de ikinci kullanimi

        //***********************           contains            ***********************

        //a String'inde "bim" kelimesinin olup olmadigini kontrol ediniz

        boolean varMi = a.contains("bim");  //true  //boolean deger dondurur
        System.out.println("varMi = " + varMi);

        //***********************           startsWith()           ***********************

        //a String'inin "T" harfi ile baslayip baslamadigini kontrol ediniz

        System.out.println(a.startsWith("T")); //false //

        System.out.println(a.startsWith("Tek",6)); //true
        //Prefix: baslangic, offset at gitsin demek.
        //Ilk 3 karakteri at, sonra bak "Tek" ile basliyor mu baslamiyor mu
        //Bu kullaniminda once basliyor mu diye sordugumuz ifadeyi giriyoruz sonra baslamasini
        //istedigimiz noktayi seciyoruz. saymaya 1 ile basliyor

        //"Benim Tek Rakibim Dunku Ben*."

        // Universite numaralari yil+BolumKodu+GirisSirasi olarak duzenlenen bir okulda ogrenci Umran'in
        // Hukuk Fakultesinde okuyup okumadigini gosteren kodu yaziniz

        /*
        Sinif 22    Hukuk 33    bilgisayar 44   Eczacilik 55    Maliye 66   Kimya Muhendisligi 77
         */

        String str = "20105501";

        System.out.println(str.startsWith("33",4));//false
        //Ilk 4 karakteri at, 33 ile basliyor mu baslamiyor mu ona bak: Method bu mantikla calisti bu ornekte



    }//main
}//class
