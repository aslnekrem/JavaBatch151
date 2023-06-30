package javaders.day07stringmanipulations;

import java.util.Scanner;

public class C02_StringManupulaions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
          

                 
                
               
                

         */
        System.out.println("Lutfen passwordunuzu " +
                "                 i) En az 8 karakterden olussun\n" +
                "                ii) Password space icermesin\n" +
                "               iii) En az bir tane buyuk harf olsun\n" +
                "                iv) En az bir tane kucuk harf olsun\n" +
                "                 v) En az bir tane sembol olsun\n" +
                "                vi) En az bir tanede rakam olsun");

        String pwd = input.nextLine();

        // i) En az 8 karakterden olussun
        boolean krktrSys = pwd.length() > 7;  //Bu alttakine gore best practise'dir cunku esittir'i kontrol etmiyor.
        boolean krktrSys2 = pwd.length() >= 8; //Bu olabilir ama best practise degi l. Yukaridaki best practise'dir

        //ii) Password space icermesin
        boolean spaceOlmamali = !pwd.contains(" ");
        //" " ==space karakteri icermeli contains  //  !pwd.contains(" ");  basindaki unlem isareti icermesin anlaminda
        //DIKKAT: Yukaridaki unlem onemli

        //iii) En az 1 tane buyuk harf olsun
        boolean bykHarfOlmali = pwd.replaceAll("[^A-Z]", "").length() > 0;   //Burada uclu method kullandik.
        //DIKKAT!!! Methodlari ayni satirda yan yana yazabiliriz.Buna method chain(method zinciri) denir.

        //iv) En az bir tane kucuk harf olsun
        boolean kckHarfOlmali = pwd.replaceAll("[^a-z]", "").length() > 0;

        //v) En az bir tane sembol olsun
        boolean sembolOlmali = pwd.replaceAll("[^a-zA-Z0-9]", "").length() > 0;

        //vi) En az bir tanede rakam olsun
        boolean rakamOlmali = pwd.replaceAll("[^0-9]", "").length() > 0;
        System.out.println("Password Gecerli mi: " + (krktrSys && spaceOlmamali && bykHarfOlmali && kckHarfOlmali
                && sembolOlmali && rakamOlmali));
    }
}
