package introduction.day03scanner;

import java.util.Scanner;

public class Scanner03 {
    //Kullanicidan adresini aliniz ve ekrana yazdiriniz
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen adresinizi giriniz: ");
        //next() methodu kullanicidan tek kelime String'i almak icin kullanilir.
        //nextLine() method'u kullanicidan cok kelimeli String'i almak icin kullanilir.
        String address = input.nextLine();
        System.out.println(address);
    }
}
