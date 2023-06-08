package introduction.day01variables;
//package isimleri kücük harflerle olusturulur
public class Variables01 { //Buradaki public kismi access modifier yani erisim düzenleyici. Keyword.

    public static void main(String[] args) { //psvm ve main bu methodun kisaltilmisi
        /*Bu method sabittir ve degismez
        -public Access modifier'dir. 4 cesiti vardir.
        -static o class'a ait demektir. Class'a montelidir.
        -void return type'dir. Void yazdik cünkü data üretmiyor
        -main methodun ismidir.
        -Main methodu olmazsa olmazdir.
         */

        //Class;lar objelerın kalıbıdır

        //Variable olusturma:
        //data type + variable name + atama operatoru (assignment operator) + data (reserved area) + noktali virgul
        int             age         =       13      ;
        // Variable Declaration  -------Assignment
        //Java cümlelerine statement denir.
        //default varsayilan deger demek
        // Default degerler sayilar icin 0'dir.
        //Eger variable Declaration yapar, assignment yapmazsaniz Java kendi degerlerini (default(varsayilan)) koyar.
        // Java cümlelerine statement denir.
        //Java'da esittir == ile kullanilir'

        /*
        Java'da iki type data vardir:
        1) Primitive data type :
        char, boolean, byte, short, int, long, float, double

        2) non-primitive data type :
            String... cok fazla var
         */
        //Example 1: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz
        String studentName = "Ali Can";
        //String'lere verilen data'lar her zaman cift tirnak olmali.
        //Eger String'de Assignment yapmasaydim null olacakti. Sayilarda ise 0 olur.
        //Java'da null: icinde variable veya method bulunmayan default object demektir. Null bosluk demektir.

        //syntax söz dizimi demek mesela yukaridaki string örnegi bir syntax dir.

        /*char data type:
        -Tek karakterler icin kullanilir.
        -Örnegin: A, x, ?, 5
         */

        char soyIsminilkharfi= 'A';

        //boolean data type:
        //boolean'lar sadece iki farkli deger alabilir ; True and False
        //Ornek boolean data type'nda emekli misin icin bir variable olusturunve Flase degerini atayin

        boolean emekliMisin = false;

        //byte data type: tam sayilar icindir ve hafizada 1 byte yer kaplar.
        // byte : -128<=byte<=+127 araliginda deger verilebilir.
        //Example : byte data type'inda ögrenci yasi icin bir variable olusturunuz ve istediginiz degeri atayiniz
        byte studentAge = 17;

        //short data type : tam sayilar icindir. 2byte yer kaplar. -32768<=short<=+32767
        //Example : Site nüfusu icin bir variable olusturun ve deger atayiniz


        short siteNufusu = 1500;

        //int data type: Tam sayilar icindir. Hafizada 4 byte yer kaplar
        //  -2,147,483,648<=int <= +2,147,483,647 arasindaki sayilar icindir.
        //Example : Ulke nufusu icin bir variable olusturun ve deger atamasi yapin

        int countryPopulation = 81650783;

        // long data type: Hafizada 8 byte yer kapliyor
        // -9,223,372,036,854,775,808 <= long <= -9,223,372,036,854,775,808
        //insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz

        //DIKKAT : Long'da hata alirsan yani rakam buyukse sonuna l koy.Asagidaki ornek gibi
        //DIKKAT : Long'u java int olarak kabul ediyor. Cunku cok yer kapliyor, 8 byte.
        //DIKKAT :Long'u int olarak aliyor Java bu yuzden sonuna l koymayi unutma
        //Buyuk L ve kucuk l ikisi de uygun ama Buyuk L best practise

        long numberOfCells= 800400500600700200L;
        long numberOfCells2 = 454582548; //Mesela burada int olarak aliyor. Cunku int araliginda ve daha az yer kaplamis oluyor.
        //eger int araligindaysa sonuna l koymamiza gerek yok.

        //float data type: virgullu sayilar, yani ondalikli sayilar icin kullanilir. (Decimal numbers = Ondalikli sayilar)
        //Ornegin fiyatlandirma icin tercih edilebilir : ( 12.99)
        //Example : Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturup toplam fiyati yazdiriniz
        //Float hafizada 4 byte yer kaplar
        /*

        DIKKAT ayni long ornegi gibi, Float olustururken sonuna F (big or small doesnt matter ) koy cunku double olarak kabul ediyor

         */

        float shirtPrice = 12.99F ; //ingilizce de virgul yerine nokta kullanilir ondalillar icin
        float shoesPrice = 15.99F ;
        //double daha cok tercıh edılıyor genelde kımse sırketlerde float kullanmaz
        System.out.println(shirtPrice+shoesPrice);
        //kisaltmasi sout

        int a = 12;
        int b = 13;
        System.out.print(a);
        System.out.println(b);
        //System.out.print(); pointer'i yanina koyar.
        // System.out.println(); ise alt satira koyar pointer'i

        //double data type : virgullu sayilar, yani ondalikli sayilar icin kullanilir. (Decimal numbers = Ondalikli sayilar)
        // double memory de daha fazla yer kaplar. Virgulden sonra daha fazla sayi alir
        //Example : Hucre agirligi ve amipin agirligi icin iki tane variable olusturunuz ve agirliklari farkini konsolo yazdirin
        //Double 8 byte'dir
        double weightCell = 0.00000000000021;
        double weightAmip = 0.00000000000025;
        System.out.println(weightAmip-weightCell);

    }

















}
