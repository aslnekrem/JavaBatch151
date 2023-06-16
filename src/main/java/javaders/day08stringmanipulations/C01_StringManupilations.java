package javaders.day08stringmanipulations;

import java.util.Scanner;

public class C01_StringManupilations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          /*
        
        Asagidaki kurallara gore kullanicinin
        girdigi email adresini kontrol ediniz.
               i)mail adresi "@gmail" icermeli
               ii)Space characteri mail'de olmamali
               iii)mail adresinde buyuk harf olmamali
               iv)En az bir tane noktalama isareti bulunmali
         */

        System.out.println("Lütfen mail adresinizi\n" +
                "\" i)mail adresi \\\"@gmail\\\" icermeli\\n\" +\n" +
                "                \" ii)Space characteri mail'de olmamali\\n\" +\n" +
                "                \"iii)mail adresinde buyuk harf olmamali\\n\" +\n" +
                "                \" iv)En az bir tane noktalama isareti bulunmali  su sartlara gore olusturunuz");

        String mail = input.nextLine();


        //  i)mail adresi "@gmail" icermeli
        boolean first = mail.contains("@gmail");
        System.out.println("first = " + first);

        //ii) Space characteri mail'de olmamali
        boolean second = !mail.contains(" ");
        System.out.println("second = " + second);

        //iii) Mail adresinde buyuk harf olmamali
        //Regex karakterlerle contains method'u calismaz
        //boolean third = !mail.contains("[^A-Z]");  Bu method calismaz mesela

        //DIKKAT!! :Birden fazla method'u ard arda kullanmaya:  methhod chain diyoruz

        //boolean upperCaseNot = mail.replaceAll("[^A-Z]","").length()==0;
        //Yukaridaki gibi de yapilabiliyor. Yukaridaki kod da 3. kosul icin uygun

        boolean third = mail.replaceAll("[a-z0-9]","").
                        replaceAll("[\\p{Punct}]","").
                        replace(" ","").length()==0;

        System.out.println("third = " + third);

        //iv) En az bir tane noktalama isareti olsun
        boolean fourth = mail.replaceAll("^\\P{P}","").length()>0;
        System.out.println("fourth = " + fourth);

        System.out.println(first&&second&&third&&fourth);
        //banu@gmail.com ==>true
        //banu@gma5il.com ==> Java @gmail'i tam gormek istiyor arada baska birsey olunca kabul etmiyor
        //@ isareti noktalama isareti olarak kabul ediyor ama zamanla bu kurallar degisebilir.
        // Dev'lar method'lari degistirebiliyor zamanla.


        String str = "burada bir gariplik var @.?-!";
        System.out.println("str = " + str.replaceAll("[\\P{P}]",""));
        System.out.println("str = " + str.replaceAll("[^\\p{Punct}]",""));

        String asd="@Bu kod dogru mu?!...";
        String dsa = asd.replaceAll("[^\\p{IsPunctuation}]", "");
        System.out.println("dsa = " + dsa);
    }//main

}//class
