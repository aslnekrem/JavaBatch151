package introduction.day03scanner;

import java.util.Scanner;
//Java'nin util kutuphanesinden Scanner class import edildi demek bu kod.
//import: ithal etmek, iceri almak demek.


public class Scanner01 {
    public static void main(String[] args) {
        //1.adim : Scanner Class'tan bir obje olustur
        Scanner input = new Scanner(System.in);
        //Scanner sistemin disindan aldigi data'lari sistemin icerisine aliyor bu yuzden System.in yazdik
        //object name input yaptik cunku bu obje kullanicidan alinan data'yi benim kodlarimin icine koyacak

        //2.adim: Kullaniciya ne istediginize dair mesaj veriniz
        System.out.println("Lütfen yasinizi giriniz: ");

        //3.adim Uygun method'kullanarak kullanicinin verdigi data'yi memorty'e yerlestiriniz
        byte age = input.nextByte();
        System.out.println(age);



    }
}
