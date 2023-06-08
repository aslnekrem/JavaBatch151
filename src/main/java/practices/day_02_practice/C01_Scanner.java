package practices.day_02_practice;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
// Kullanıcından adını, ikinci adını ve soyadını arasında bosluk olacak sekilde tek bir String olarak sisteme
// girmesini isteyiniz.
// adının ilk karakterini, ikinci adının ilk karakterini ve soyadının ilk karakterini BUYUK harfle yazdırınız.
        Scanner input = new Scanner(System.in);
        System.out.println("Adinizi, ikinci adinizi ve soyadinizi arasinda bosluk olacak sekilde giriniz");
        String str = input.nextLine().toUpperCase().trim();

        char adIlkKrktr = str.charAt(0);

        char ikinciAdIlkKrktr = str.charAt(str.indexOf(" ")+1);

        char soyadIlkKrktr = str.charAt(str.lastIndexOf(" ")+1);

        System.out.println(" " + adIlkKrktr+ikinciAdIlkKrktr+soyadIlkKrktr);



    }//main
}//class
