package practices.day_04_practice;

import java.util.Scanner;

public class C01_Switch {
    public static void main(String[] args) {

    /*
         Kullanıcıdan 0-4 arasi sınav puanını sisteme girmesini isteyiniz.

         Eger puanı 0,0-1,0 arasında ise KALDI seviyesi veriniz
              puanı 1,0-2,0 arasında ise GECTI seviyesi veriniz
              puanı 2,0-2,5 arasında ise IYI seviyesi veriniz
              puanı 2,5-3,5 arasında ise UST seviyesi veriniz
              puanı 3,5-4,0 arasında ise HARİKA seviyesi veriniz

        switch case kullanarak KALDI seviyesine F harf notu veriniz
                               GECTİ seviyesine D harf notu veriniz
                               IYI seviyesine C harf notu veriniz
                               UST seviyesine B harf notu veriniz
                               HARİKA seviyesine A harf notu veriniz
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("0-4 Arasi Puanınızı Giriniz");
        double puan = scan.nextDouble();

        String seviye ="";

        if(puan>=0 && puan<1){
            seviye="KALDI";
        }else if(puan>=1 && puan<2){
            seviye="GECTI";
        }else if(puan>=2 && puan<2.5){
            seviye="IYI";
        }else if(puan>=2.5 && puan<3.5){
            seviye="UST";
        }else if(puan>=3.5 && puan<=4){
            seviye ="HARIKA";
        }


        switch (seviye){

            case "KALDI":
                System.out.println("F");
                break;

            case "GECTI":
                System.out.println("D");
                break;

            case "IYI":
                System.out.println("C");
                break;

            case "UST":
                System.out.println("B");
                break;

            case "HARIKA":
                System.out.println("A");
                break;

            default:
                System.out.println("Sinav Puaninizi Dogru Giriniz");







        }


    }//main
}//class
