package introduction.day02datatypesmethodcreation;

public class MethodCreation01 {
    /*
    Java'da method nasil olusturulur?

    1)main method'un disinda olusturulur
    2)Access Modifier + Return Type + Method ismi + () + {}

    Olusturulan method'lar nasil kullanilir
    1)main method'un icinden kullanilir
    2)method'un ismi + () yazin
    3) Islem yapacaginiz parametreleri parantez icine koyun

    */
    public static void main(String[] args) {

        int sonuc = toplamaYap(3,5); //burada method'dan geleni atadik int icerisine
        System.out.println(sonuc);
        //DIKKAT!!!!    // Burada ilk basta hata vermisti cunku toplamaYap methodunu static yapmamistik
        //DIKKAT!!!!        //Main method'u icerisine girecek her method static olmak zorunda


        //intellij a ve b'yi buraya otomatik yaziyor biz yazmiyoruz
        //Bu sekilde method' cagirdik

        long sonuc2 = multiply(3,6); //a ve b'yi Intellij yaziyor biz degil
        //3 ve 6' yi method'a gonderdi orada carpma yapildi ve geri geldi. Geri gelen veriyi long icerisine atadik ve yazdirdik

        System.out.println(sonuc2);

        int sonuc3 = firstTwoMultiplyThirdAdd(2,3,4);
        System.out.println(sonuc3);
        //Yukaridaki kullanim daha iyi ve daha yaygin code'larin okunulabilirligi acisindan
        System.out.println(getCube(3.4));// küp alma method'una 3' u gonderdik

        print("Helloworld"); // DIKKAT!!!! Bu method'u incele cok onemli
    }

    //Ornek1: Toplama islemi yapan bir method olusturunuz

    public static int toplamaYap (int a, int b) { //Buraya static ekledik cunku static olmazsa main methoduna giremez

        return a+b;  //a ve b'yi toplayip int olarak gonderiyor.

    }

    //Ornek2: Iki sayiyi carpma islemi yapan bir method olusturunuz

    protected static long multiply (int a, int b){
        //Burada Access Modifier olarak protected kullandik.
        //Access Modifier : public, protected, default, private
        return a*b;

    }

    //Example3: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan methodu olusturunuz

    private static int firstTwoMultiplyThirdAdd (int a, int b, int c){

    ;
    return a*b+c;

    }
    //Example : Verilen bir ondalik sayinin kupunu hesaplayan methodu olusturup kullaniniz
    static double getCube(double a){ // Burada bir sey yazmamak default oldugu anlamina geliyor
        // Yani default static....
        return a*a*a;

        /*
         default static double getCube(double a){
        return a*a*a;
    }
    kodu boyle yazdik ve hata aldik. Normalde boyle yaziyorduk. Ama bu default Access modifier

    DIKKAT Access Modifier'i default yapmak icin access modifier yazmayiniz
    Yani buradan default' silerek yazmamiz lazim.
    Program'da hicbir sey yazmazsan her zaman default(Varsayilan) olarak kabul eder.
         */

    }
    //Example5: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz
    public static void print (String str){ //Buraya void yazdik

        //COK ONEMLI ASAGIDAKILER!!!

        //DIKKAT!!!
        //Cunku burada bir islem yapiyor veri uretmiyor. Veri uretmedigi icin void yazmak zorundayiz
        //DIKKAT Burada veri uretmedigimiz icin return yazmadik
       System.out.println(str);
       //Method'un return type'i void ise method body icinde return keyword yazilmaz
    }
}
