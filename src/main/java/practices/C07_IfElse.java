package practices;

import java.util.Scanner;

public class C07_IfElse {
    public static void main(String[] args) {
        // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın



        // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın


        Scanner scan =new Scanner(System.in);

        System.out.println("ilk Sayiyi Giriniz");
        int ilkSayi = scan.nextInt();

        System.out.println("ikinci Sayiyi Giriniz");
        int ikinci =scan.nextInt();

        if(ilkSayi>ikinci){
            System.out.println("ilk sayi ikinci sayidan buyuktur");
        } else {

            System.out.println("ilk sayi ikinci sayidan buyuk degil");
        }




    }//main
}//class
