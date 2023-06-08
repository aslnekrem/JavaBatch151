package practices;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

         /*

        Kullanıcıdan adını, soyadını, yaşını, boyunu ve kilosunu ayrı ayrı sisteme girmesini isteyin
        ve bunları şu şekilde konsola yazdırın:

        Adı: ...
        Soyadı: ...
        Yas: ...
        Boy: ...
        Kilo: ...

	    */

        Scanner  scan = new Scanner(System.in);

        System.out.println("Adinizi Giriniz");
        String ad = scan.nextLine();

        System.out.println("Soyadinizi Giriniz");
        String soyad = scan.nextLine();

        System.out.println("Yasinizi Giriniz");
        int yas = scan.nextInt();

        System.out.println("Boyunuzu Giriniz");
        int boy = scan.nextInt();

        System.out.println("Kilonuzu Giriniz");
        int kilo = scan.nextInt();

        System.out.println("Adı: " + ad + "\n" + "Soyad: " + soyad + "\n" + "Yas: " + yas + "\n" + "Boy: " + boy + "\n" + "Kilo: " + kilo);










    }
}
