package practices.day_07_practice;

import java.util.Scanner;

public class C02_DoWhile {
    public static void main(String[] args) {

        /*
        Bir top belirli yükseklikten atılmaktadır.(Scanner ile kullanıcıdan yüksekliği alınız)
        Atıldıktan sonra, atıldığı yüksekliğin 1/2 si kadar yerden yukarı doğru zıplamaktadır
        Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
        Bu ana kadar aldigi TOPLAM YOLU ve YERE VURMA SAYISINI bulan do while code blogu create ediniz.
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Birakilan Yüksekligi Giriniz");
        double yukseklik = scan.nextDouble();

        double toplamYol = 0;
        int vurmaSayisi = 0;


        do {
            toplamYol+=yukseklik;
            vurmaSayisi++;
            toplamYol+=yukseklik*0.5;

            yukseklik=yukseklik*0.5;


        }while (yukseklik>=1);


        toplamYol+=yukseklik;
        vurmaSayisi++;


        System.out.println("Yere Vurma Sayisi: " + vurmaSayisi);

        System.out.println("Toplam Alinan Yol: " + toplamYol);


}//main
}//class
