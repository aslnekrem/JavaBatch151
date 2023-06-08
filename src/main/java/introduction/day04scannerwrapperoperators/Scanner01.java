package introduction.day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        /*Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki rakamlarin toplamini
        yazdiran kodu yaziniz*/
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz: ");
        int number = input.nextInt();
        //Bir sayinin son rakamini alabilmek icin bir sayiyi 10'a bolup kalanini almaliyiz.
        // % modulus operator solunda bulunan sayinin saginda bulunan sayiya bolumunden kalanini verir
        //dolayisiyla %10 her zaman bize birler basamaginda bulunan sayiyi verir.
        //bir tamsayiyi bir tamsayiya bolerseniz java sonucu kesinlikle tamsayi yapar.
        //java bu durumda yuvarlama yapmaz. Ondalikli kismi iptal eder.
        //dolayisiyla bir tam sayiyi 10'a bolersek birler basamagini silmis oluruz

        // son rakami al
        int lastDigit = number % 10;
        //sayi kucult
        number = number / 10;
        //sondan ikinci rakami al
        int lastSecondDigitnumber = number % 10;
        //sayi kucukt
        number = number / 10;
        //sondan ucuncu rakami aö
        int lastThirdDigit = number % 10;
        //sayi kucult
        number = number / 10;
        //sondan dorduncu rakami al
        int lastFourthDigit = number%10;
        //sayi kucult
        number=number/10;
        //sondan besinci rakami al
        int lastFifthDigit = number%10;
        number=number/10;
        System.out.println(lastDigit+lastSecondDigitnumber+lastFourthDigit+lastFifthDigit);
        /*Example 38671/10 = 1 kalir yani birler basamaginda 1 olur ama bunun ciktisi 3867.1 olmasi gerekirken
            matematikte, java ciktiyi tam sayi gosterecegi icin .1'i siler direkt 38671 olarak kabul eder. Yuvarlama
            yapmaz. */
        //10'a boldugumuz zaman otomatik olarak birler basamagi silinir.


    }

}
