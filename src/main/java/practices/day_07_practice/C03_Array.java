package practices.day_07_practice;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Array {
    // Kullanıcıdan 4 tane rakam sisteme girmesini isteyiniz
    // ve bu rakamları bir array'e esayn ediniz. Olusturdugunuz array'i yazdırınız

    // Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız

    // Ortalamadan daha buyuk olan array elemanlarını yazdırınız
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] arr = new int[4];
        int toplam = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print((i+1) + ". rakamı giriniz: ");
            arr[i] = scan.nextInt();
            toplam += arr[i];
        }

        System.out.print(Arrays.toString(arr));


        double ortalama = toplam / arr.length;

        System.out.println("\nOrtalama: " + ortalama);

        System.out.print("Ortalama değerinden büyük rakamlar: ");
        for (int each : arr) {
            if (each > ortalama) {
                System.out.print(each + " ");
            }
        }



    }//main
}//class
