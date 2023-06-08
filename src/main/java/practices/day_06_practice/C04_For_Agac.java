package practices.day_06_practice;

import java.util.Scanner;

public class C04_For_Agac {
     /*

         Agac sekli olusturmak icin, kullanicidan yaprak satir sayisini ve gövde satir sayisini ayrı ayrı
         sisteme girmesini isteyiniz.

         Asagıdaki agac seklini konsala yazdırınız


        ^
        ^^
        ^^^
        ^^^^
        ^^^^^
        |||
        |||
        |||
        |||
        |||


         */
     public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);
         System.out.println("Lütfen yaprak satir sayisini giriniz: ");
         int yaprakSatirSayisi = scan.nextInt();

         System.out.println("Lütfen govde satir sayisini giriniz: ");
         int govdeSatirSayisi = scan.nextInt();

         String yaprak = "";

         for (int i = 0; i <yaprakSatirSayisi ; i++) {
             yaprak =yaprak + "^";
             System.out.println(yaprak);
         }
         for (int i = 0; i <govdeSatirSayisi ; i++) {
             System.out.println("|||");
         }




     }//main
}//class
