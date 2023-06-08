package practices.day_05_looparrays;

public class MaymunAlive {
       /* INTERWIEW SORUSU


    Adada yalnız bir maymun var
    Her gün 4 muz yemesi gerekiyor
    o adada sadece 165 muz var
    Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.

    */

    public static void main(String[] args) {

        int numberOfBananas = 165;
        int survivalDays = 1;
        boolean monkeyAlive = true;

        do {
            numberOfBananas-=4; //toplam muz sayisindan 4 eksiltir
            System.out.println("Kalan muz sayisi: "+numberOfBananas);
            survivalDays++;
            if(numberOfBananas<4){
                monkeyAlive=false;
                System.out.println("Bugun "+survivalDays+"."+" gun yeterli muz kalmadi maymun rahmetli.");
            }else {
                System.out.println("Bugun "+survivalDays+". gun maymun hala yasiyor");
            }
        }while (monkeyAlive);




        /*
         Benim yazdigim kod asagida


        int muzSayisi = 165;
        int gun = 0;

        for (int i = 0; i <muzSayisi; i++) {
            if (i%4==0){
                gun++;
            }
        }
        System.out.println("Maymun "+gun+" gun hayatta kalir");

         */
    }//main
}//class
