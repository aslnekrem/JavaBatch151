package practices;

public class Q01_Variables {
    public static void main(String[] args) { //Run butonu main method'u yazdigimizda cikar
        //Main methodu yazmazsak Run butonu cikmaz

        //Bir variable baslat
        int age = 15;
        System.out.println("age " + age);
        int number = 43;
        System.out.println("number = " + number);
        String isim = "Ali";
        System.out.println("isim = " + isim);


        //DIKKAT!!!! ONEMLI KISAYOL
        // Mesela burada number'i direkt yazdirmak icin  number.soutv yazdigimizda direkt yukaridaki gibi yazdiriyor
        //soutv ise kullanilmamis olani direkt yazdirir


        int myAge = age;
        System.out.println("myAge = " + myAge);

        String onunIsmi = isim;

        System.out.println("onunIsmi = " + onunIsmi);

        //Ekrana yazdirma mevzusu developer'larin kodlarini test etmeleri icin gerekli sadece

        //Ayni satirda coklu variable deklere et.

        int year = 2022, month = 15, day = 15, hour = 13; //Bu yöntem genelde cok kullanilan bir sey degil
        //Ama bu sekilde de kullanilabilir.
        System.out.println("year = " + year); //year.soutv
        System.out.println("month = " + month);

        //Bir variable degerini guncelle
        year = 2023;


        // Ctrl + Alt + L = Code lari duzenler.
        isim = "Veli";
        System.out.println("isim = " + isim);
        System.out.println("onunIsmi = " + onunIsmi); //DIKKATTTTT
        /*DIKKATTT : Burada onunIsmi'ni hala Ali olarak aliyor cunku islem sirasindan dolayi code basa donmedi
        Bu yuzden isim Veli, onunIsmi Ali olarak devam ediyor

        Ancak asagidaki gibi yaparsan atamayi onunIsmi Veli olarak devam eder

         onunIsmi = isim ;

        System.out.println("onunIsmi = " + onunIsmi);

         */

        //Soru : Bir variable deklere et : x
        // Bir variable baslat :y
        // Baska bir variable baslat : z
        // x degiskenini y degiskeni ile baslat
        //Variable i guncelle

        double x;
        double y = 55.6;
        double z = 10;
        x = y;
        x = 15.3;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


    }

    //Ayni body icerisine ayni isimde variable tanimlayamazsin ama body disina yapabilirsin mesela asagidaki ornek
    int age = 15;

}
