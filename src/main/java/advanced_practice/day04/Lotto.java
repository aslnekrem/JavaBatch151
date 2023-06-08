package advanced_practice.day04;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
    /*
Proje: Sayısal Loto Uygulaması

       1) Kullanici Bileti icin sistem tarafindan rastgele n tane sayı üretilsin.
       2) Loto sonucu icin de rastgele n tane sayı ile üretilsin.
       3) Sayısal lotoda tekrarlı sayılar olmasin.
       4) n(hane sayısı), sayılar için kullanicidan min ve max degerler alınsın.
       5) loto sonucu ile bilet ile karsılastırılsın,
       6) kac eslesme oldugu kullanıcıya bildirilsin.
       7)  Eger eslesme varsa;
           Max deger>50 ise ==>buyuk ikramiye
           Max deger>100 ise ==>super ikramiye
           Max deger>0 ise ==>amorti kazandiniz yazdirsin

*/


    public static void main(String[] args) {
        startLoto();
    }//main
    public static void startLoto() {
        Scanner input = new Scanner(System.in);
        System.out.println(" loto için lütfen hane sayısı giriniz");
        int slots = input.nextInt();//slots==>kaç haneli olacağını verir
        System.out.println("lütfen sayılar için min değer giriniz");
        int min = input.nextInt();
        System.out.println("lütfen sayılar için max değer giriniz");
        int max = input.nextInt();
        int ticketArr[] = new int[slots];//kullanıcınin biletinin sonuçları
        int lotoArr[] = new int[slots];//arayin büyüklüğü slot kadar.loto sonucu
        Random rnd = new Random();
        int rnd1 = 0;
        int rnd2 = 0;
        boolean isRepeat;//aynı sayıyı bir daha üretmesin diye kullandık
        for (int i = 0; i <slots ; i++) {//kaç tane hane varsa o kadar dönsün
            do{
                isRepeat=false;//tekrarlanmıyorsa while loop calışsın
                rnd1=rnd.nextInt(max+1-min)+min;
                for (int j = 0; j <i ; j++) {
                    if (lotoArr[j]==rnd1){
                        isRepeat=true;//tekrarlanıyorsa while loop dursunve arraye eklemeyi bırak
                        break;//dizide varsa arraye ekleme

                    }//if

                }//forj
            }while(isRepeat);//tekrarlanan bir sayı üretirse tekrar do whlie loopun başına dön
            lotoArr[i]=rnd1;
            //ticketArr[]
            do{
                isRepeat=false;//tekrarlanmıyorsa while loop calışsın
                rnd2=rnd.nextInt(max+1-min)+min;
                for (int j = 0; j <i ; j++) {
                    if (ticketArr[j]==rnd2){
                        isRepeat=true;//tekrarlanıyorsa while loop dursunve arraye eklemeyi bırak
                        break;//dizide varsa arraye ekleme
                    }//if
                }//forj
            }while(isRepeat);//tekrarlanan bir sayı üretirse tekrar do whlie loopun başına dön
            ticketArr[i]=rnd1;
        }//fori
        System.out.print("benim biletim:   ");
        for (int i = 0; i <slots ; i++) {
            System.out.print(ticketArr[i]+" ");
        }
        System.out.println();
        System.out.println("loto sonucu :    ");
        for (int i = 0; i <slots ; i++) {
            System.out.print(lotoArr[i]+" ");
        }
        System.out.println();
    }//startloto()




}//class
