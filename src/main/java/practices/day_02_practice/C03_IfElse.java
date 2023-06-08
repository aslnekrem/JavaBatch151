package practices.day_02_practice;

import java.util.Scanner;

public class C03_IfElse {
    public static void main(String[] args) {
/*
Kullanıcıdan 3 karakterden daha uzun bir kelime sisteme girmesini isteyin
Eger kelimenin karakter sayısı 3 ve 3'den daha kucuk ise konsola " 3 Karakterden Daha Uzun Bir Kelime Girmelisiniz " yazdırınız
Degilse kelimenin basına ve sonuna, kelimenin son uc harfini ekleyerek yazdırınız
*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Uc karakterden daha uzun bir keilme giriniz");
        String kelime = scan.next();

        if (kelime.length()<=3){
            System.out.println("Lütfen 3 karakterden daha uzun bir kelime giriniz");
        }else {
            String sonUcHarf = kelime.substring(kelime.length()-3);
            //substring: Parantez icerisinde belirtilen index den kelimenin sonuna kadar olan kismi bize dondurur
            String yeni = sonUcHarf+kelime+sonUcHarf;
            System.out.println(yeni);
        }


    }//main
}//class
