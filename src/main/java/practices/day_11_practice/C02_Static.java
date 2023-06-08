package practices.day_11_practice;

public class C02_Static {
    static String okulIsmi = "Yildiz Koleji";

    static int okulNo;  // 0

    static  boolean okulAcikMi;  // false

  /*

    okulIsmi, okulNo, okulAcikMi seklinde uc tane static variable olusturalım.
    Bu static variable'leri main icerisinde yazdıralım

*/


    public static void main(String[] args) {

        // static variable'lara, class icerisindeki tum methodlardan direk ulasabiliriz.

        System.out.println(okulIsmi); // Yildiz Koleji
        System.out.println(okulNo);  //  0
        System.out.println(okulAcikMi);  // false

        //////////////////////////////////////////////////////////////

        // static variable'lar gokteki ay gibidir
        // static variable'lar class' a baglıdır
        // static variable'ın degeri bir kisi tarafından degistirilirse, herkes icin degisiklige ugrar

        okulNo=102;

        System.out.println(okulNo);  // 102

        staticMethod();

        System.out.println(okulNo); // 200



    } // main

    private static void staticMethod() {

        okulNo=200;

        System.out.println(okulNo); // 200

    }
}//class
