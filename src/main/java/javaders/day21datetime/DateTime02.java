package javaders.day21datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        
        LocalDateTime ldt = LocalDateTime.now(); //Class daki kelimelerin ilk harfini kullanirlar genelde
        System.out.println("ldt = " + ldt);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy - hh:mm a");
        //Tarih ve zamani yukaridaki formata gore ayarla dedik
        //Tek "M" yazarsan ayi 03 degil 3 yazar mesela
        String formattedLdt = dtf1.format(ldt);
        System.out.println("formattedLdt = " + formattedLdt);











    }//main
}//class
