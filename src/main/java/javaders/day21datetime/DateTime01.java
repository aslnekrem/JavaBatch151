package javaders.day21datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {
        

        //Anlik zamani nasil aliriz?
        LocalTime myCurrentTime = LocalTime.now();//24 saatlik dilimde gösterir: Saat, Dakika, Saniye, Nanosaniye gösterir
        System.out.println(myCurrentTime);

        //Anlik zamanda bilesenler nasil alinir?
        int hour = myCurrentTime.getHour();
        System.out.println("hour = " + hour);

        int minute = myCurrentTime.getMinute();
        System.out.println("minute = " + minute);

        int second = myCurrentTime.getSecond();
        System.out.println("second = " + second);

        int nano = myCurrentTime.getNano();
        System.out.println("nano = " + nano);

        //Gelecek ve gecmise nasil gidilir?
        LocalTime next = myCurrentTime.plusHours(2).plusMinutes(20).minusSeconds(11);
        System.out.println("next = " + next);

        //Zaman formati nasil degistirilir
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm"); // : olan yere ne istersen yazarsin onu gosterir
        //Bu bir class, tarih ve zamanin formatini degistiren class
        //Yukarida method icerisine buyuk H yazarsan 24 saatlik sistemini, kucuk h 12 saatlik sistemi kullanir.

        String formattedMyCurrentTime = dtf1.format(myCurrentTime);
        System.out.println("formattedMyCurrentTime = " + formattedMyCurrentTime);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm:ss a");
        //"hh:mm a" ifadesindeki  "a" 12'lik saat sisteminde "AM", "PM" yazilmasini saglar
        //saniyeyi de gormek istersen "ss" yazabilirsin
        //"mm" "minute" demektir. "MM" "month" demektir
        String formattedMyCurrentTime2 = dtf2.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime2);

        //Date formati nasil degistirilir?
        LocalDate myCurrentDate = LocalDate.of(2022,8,25);
        System.out.println("myCurrentDate = " + myCurrentDate);

        //Tarihi Ay/Gun/Yil sekline ceviriniz
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedMyCurrentDate = dtf3.format(myCurrentDate);//Format methodu hep String verir
        System.out.println("formattedMyCurrentDate = " + formattedMyCurrentDate);

        //Tarihi Gun/Ay isminin ilk 3 harfi/Yil sekline ceviriniz. 25/aug/2022
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMM/yy");
        //Uc tane "MMM" ayin ilk uc harfini verir, Dort tane "MMMM" de ay isminin tamamini veriyor
        String formattedMyCurrentDate2 = dtf4.format(myCurrentDate);
        System.out.println("formattedMyCurrentDate2 = " + formattedMyCurrentDate2);

        //ZONE
        //Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?

        //Tokyo'da ayin kaci?
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("dateInTokyo = " + dateInTokyo);

        //Tashkent de hangi gun?
        LocalDate dateInTashkent = LocalDate.now(ZoneId.of("Asia/Tashkent"));
        System.out.println("dateInTashkent = " + dateInTashkent);

        //Tokyo'da saat kac?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("timeInTokyo = " + timeInTokyo);

        //Istanbul saat kac?
        LocalTime timeInIstanbul = LocalTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println("timeInIstanbul = " + timeInIstanbul);










    }//main
}//class
