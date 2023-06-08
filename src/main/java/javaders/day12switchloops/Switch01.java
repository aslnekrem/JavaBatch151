package javaders.day12switchloops;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        //Example 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12. aya kadar tum aylarin isimlerini
        //kodu yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("Please write of month number: ");
        int numOfMonth = input.nextInt();

        switch (numOfMonth){    //nunOfMonth' a gore degistir demek bu kod
            case 1 :
                System.out.println("January");

            case 2 :
                System.out.println("February");

            case 3 :
                System.out.println("March");

            case 4 :
                System.out.println("April");

            case 5 :
                System.out.println("May");

            case 6 :
                System.out.println("June");

            case 7 :
                System.out.println("July");

            case 8 :
                System.out.println("August");

            case 9 :
                System.out.println("September");

            case 10 :
                System.out.println("October");

            case 11 :
                System.out.println("November");

            case 12 :
                System.out.println("Dezember");
                break;
            default:
                System.out.println("Invalid month number");
                //Zaten son satir oldugu icin zaten code disarisina cikacak, bu yuzden break yazmak gereksiz
        }

        //Condition'i saglarsa case icerisine girer ve sonraki code larin hepsini okur
        //DIKKAT!! Ilk case icerisine girdikten sonra break gorene kadar calismaya devam ediyor..
        //Son case'den sonra break yazmazsak default'u da yazdirir
        //Note: "switch" condition parantezi icerisinde: 1)String, 2)byte, 3)int, 4)short, 5)char kullanilabilir
        //Note: "switch" condiition icerisinde 1)long, 2)boolean, 3)float, 4)double kullanilmaz. Case icindeki islemler
        // icin kullanabilirsin sadece switch icindeki parantez icin kullanamazsin


    }
}
