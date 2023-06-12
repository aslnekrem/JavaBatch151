package javaders.day03methodcreationscanner;


import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

       
        Scanner input = new Scanner(System.in);//Tolgahan

        System.out.println("Lutfen maasinizi giriniz");

        
        long maas = input.nextLong();

        System.out.println("maas = " + maas);


       

        System.out.println("Lutfen cinsiyetinizi Kadin ise K Erkek ise E olarak giriniz");
        char cinsiyet = input.next().charAt(0);//erkek


        System.out.println("Lutfen adinizi giriniz");
        String name = input.next();//Tolgahan Metehan

        System.out.println("Lutfen memleketinizi giriniz");
        String memleket = input.next();

        System.out.println("Lutfen yasinizi giriniz");
        byte yas = input.nextByte();

        System.out.println("Lutfen boyunuzu giriniz");
        double boy = input.nextDouble();

        System.out.println("Lutfen yasadiginiz ulkeyi sevip sevmediginizi True/ False seklinde giriniz");
        boolean seviyorMu = input.nextBoolean();

        System.out.println("*************** Tolgahan *****************");
        System.out.println("cinsiyet : " + cinsiyet + "\nname : " + name + "\nmemleket : "
                + memleket + "\nyas : " + yas + "\nboy : " + boy + "\nseviyorMu : " + seviyorMu);

    }
}
