package introduction.day02datatypesmethodcreation;

public class Variables01 {
    public static void main(String[] args) {
        /*
        -Java'da iki tip data vardir:
            1) primitive data type : char, boolean,byte, short, int, long, float, double
            2)non primitive : String .....

         NOT: Primitive data type'lar 8 tane ve kucuk harflerle yazilar
         NOT2: Primitive data type'larina gore memory'de farkli farkli yer kaplarlar
         Not3: primitive data'lar iclerinde sadece sizin atadiginiz degeri barindirirlar.
         */
        //Yeni bir data type' i biz üretemeyiz sadece Java üretir ve bizim kullanimimiza sunar

        /*
        Non-primitive Data types
        Ornek olarak String non-primitive bir data type'dir.
        DIKKAT! Uretilen her bir class ayni zamanda bir "non-primitive data type'dir"
        Bu yuzden her non-Primitive Buyuk harfle baslar ve her kelime buyuk harfle devam eder
        Bu yuzden non primitive data type' lar sinirsiz sayidadir denilebilir
        Non-primitive data type'larin tamami icin java memory'de ayni miktarda yer kaplar

         */


        //Ornek 1: Sehir ismi icin bir variable olusturun ve bir deger atayip omu ekrana yazdirin

        String cityName = "Nicomedia";
        System.out.println(cityName);
        int a = 13;

        /*
             Interview sorusu : primitive ve non-primitive data type'lar arasindaki fark nedir?
             1) -primitive'ler sadece atadigimiz degeri icerir.
                -non primitive bizim atadigimiz deger ve method'lar icerir.
             2) primitive ler kucuk harfle baslar, non primitive ler buyuk harfle baslar
             3)-primitive' leri java uretmistir ve 8 tanedir. Biz üretemeyiz
               -non primitive'leri java ve developer'lar uretebilir, sinirsiz sayidadir
             4)-primitive'ler memory'da data type'ina gore yer kaplar
                -non primitive'ler data type'larin tamami icin memory'de ayni miktarda yer ayirir
        */





    }
}
