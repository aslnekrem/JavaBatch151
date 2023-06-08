package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary04 {

    /*
        Kullanicidan aldiginiz sayi cift ise yarisini ekrana yazdiriniz, tek ise "Bu sayi ikiye bolunmez" yazdiriniz
    */

        /*
            1)Ternary'de true ve false durumlari icin size verilen data type'lari farkli ise olusturdugunuz
              container'in data type'ini "Object" yapin
            2)"Object" Java'da bir class'dir.
              "Object" Java'daki butun class'larin "Parent"i dir. Yani babasidir, Hz. Adem gibi.
              "Object" Class'in "Parent"i yoktur.
              Java'da parent'i olmayan tek Class "Object Class" dir.
         */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer...");
        int num = input.nextInt();

        Object result = num%2==0 ? num/2 : "Bu sayi ikiye bolunmez";
        System.out.println(result);

    }
}
