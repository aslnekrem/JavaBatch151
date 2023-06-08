package javaders.day20arrallistsdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {

        //Icinde bulundugumuz zaman dilimindeki tarihi nasil aliriz?
        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate);//15-03-2023

        //Tarih'ten istedigimiz bileseni nasil aliriz?
        int monthValue = myCurrentDate.getMonthValue();
        System.out.println(monthValue);//3

        int yearValue = myCurrentDate.getYear();
        System.out.println(yearValue);//2023

        int dayOfMonthValue = myCurrentDate.getDayOfMonth();
        System.out.println(dayOfMonthValue);//15

        int dayOfYearValue = myCurrentDate.getDayOfYear();
        System.out.println(dayOfYearValue);//74

        //Istersek isim verenleri de kullanabiliriz
        //Asagidaki Month bir Enum'dir
        //Enum Java'da sabit degerleri(Ay isimleri, Gun isimleri, ulke sehir isimleri, Samanyolu Galaksisindeki gezegen
        // isimleri..) depolamak icin kullanilir
        //Enum'in icinde data olur method olmaz
        Month monthName = myCurrentDate.getMonth();
        System.out.println(monthName);
        //Java' da degismeyen Data'lar büyük harflerle yazilir

        DayOfWeek dayName = myCurrentDate.getDayOfWeek();
        System.out.println(dayName);

        //Ilerideki tarihe nasil gidilir
        System.out.println(myCurrentDate.plusDays(5).plusMonths(2).plusYears(4));

        //Gecmis tarihe nasil gidilir
        myCurrentDate.minusYears(30).minusMonths(2).minusDays(18);

        LocalDate gokhanDob = LocalDate.of(1986,6,10);
        LocalDate fatihDob = LocalDate.of(1985,2,25);


        //Bir tarihin bir tarihten sonra olup olmadigi nasil kontrol edilir
        boolean r1 = gokhanDob.isAfter(fatihDob);
        System.out.println(r1);//true
        //Bir tarihin bir tarihten once olup olmadigi nasil kontrol edilir
        boolean r2 = fatihDob.isBefore(gokhanDob);
        System.out.println(r2);//true
        //Bir tarihin bir tarihte esit olup olmadigi nasil kontrol edilir
        boolean r3 = gokhanDob.isEqual(fatihDob);
        System.out.println(r3);//false

        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "gecersiz tarih girdiniz" yazdirin
        //           Kullanicidan aldiginiz tarih gelecege ait ise "zamani girebilirsiniz" deyiniz

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year, month and day numbers in the given order: ");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate givenDate = LocalDate.of(year,month,day);

        if (givenDate.isBefore(LocalDate.now())){
            System.out.println("Invalid Date");
        }else {
            System.out.println("Enter time for the ticket");
        }

        int lengthOfMonth = myCurrentDate.lengthOfMonth();//ay uzunlugunu verir
        System.out.println(lengthOfMonth);

        //Example 2: Kullanicinin girdigi tarihin gun ismini bulan kodu yaziniz
        System.out.println("Please enter year, month and day numbers in the given order: ");
        int y = input.nextInt();
        int m = input.nextInt();
        int d = input.nextInt();

        LocalDate date = LocalDate.of(y,m,d);
        System.out.println(date.getDayOfWeek());




    }//main
}//class
