package practices;

import java.util.Scanner;

public class C04_Dikdortgen {
    public static void main(String[] args) {
        // ve Dikdorgenin cevresini hesaplayarak ekrana yazdiriniz

        Scanner scan = new Scanner(System.in);

        System.out.println("Dikdortgenin a Kenarini Giriniz");

        System.out.println("Dikdortgenin a Kenarini Giriniz");
        int a = scan.nextInt();


        System.out.println("Dikdortgenin b Kenarini Giriniz");
        int b = scan.nextInt();

        System.out.println("Dikdortgenin Cevresi: " + ((2*a) + (2*b)));

    }
}
