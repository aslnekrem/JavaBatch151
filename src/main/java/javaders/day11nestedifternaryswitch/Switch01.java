package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Switch01 {
     /*
        Kullanicidan gun isimlerini aliniz, o gunun kacinci gun oldugunu ekrana yazdiriniz
        Sunday==>1    Monday==>2 ... Saturday==>7
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day name...");
        String dayName = input.next();
        //1.Way:
        if(dayName.equalsIgnoreCase("Sunday")){
            System.out.println("Sunday is the first day");
        }else if(dayName.equalsIgnoreCase("Monday")){
            System.out.println("Monday is the second day");
        }else if(dayName.equalsIgnoreCase("Tuesday")){
            System.out.println("Tuesday is the third day");
        }else if(dayName.equalsIgnoreCase("Wednesday")){
            System.out.println("Wednesday is the fourth day");
        }else if(dayName.equalsIgnoreCase("Thursday")){
            System.out.println("Thursday is the fifth day");
        }else if(dayName.equalsIgnoreCase("Friday")){
            System.out.println("Friday is the sixth day");
        }else if(dayName.equalsIgnoreCase("Saturday")){
            System.out.println("Saturday is the seventh day");
        }else{
            System.out.println("Invalid day name");
        }

        /*
            -Eger 3'den fazla case varsa genelde If yerine switch kullanilir. Mesela yukaridaki code da cok afzla else
             If var bu yuzden clean and dynamic code icin swtich case is better.
            -Mesela If'de Method kullandik yukarida cok defa ama swtich de asagida sadece 1 keren kullandik
         */


        //2.Way:
        switch(dayName.toLowerCase()){ //Butun harfleri kuculttuk bu sayede buyuk kucuk harf sorunu kalkiyor
            case "sunday":
                System.out.println("Sunday is the first day");
                break;
            case "monday":
                System.out.println("Monday is the second day");
                break;
            case "tuesday":
                System.out.println("Tuesday is the third day");
                break;
            case "wednesday":
                System.out.println("Wednesday is the fourth day");
                break;
            case "thursday":
                System.out.println("Thursday is the fifth day");
                break;
            case "friday":
                System.out.println("Friday is the sixth day");
                break;
            case "saturday":
                System.out.println("Saturday is the seventh day");
                break;
            default:
                System.out.println("Invalid day name");
                //Buraya break; yazsan da olur yazmasan da ama yazmamak best practise
        }
        //Switch: degis demek. Eger break yazmazsak case'leri calistirmaya devam eder.
        //readable okunabilir demek. Code'larin bu sekilde yazilmasi onemli
        //Condition'i saglarsa case icerisine girer ve sonraki code larin hepsini okur
        //DIKKAT!! Ilk case icerisine girdikten sonra break gorene kadar calismaya devam ediyor..
        //Son case'den sonra break yazmazsak default'u da yazdirir
    }
}
