package javaders.day18constructorsstatickeyword;

import java.time.LocalDate;

public class StaticNonStaticBlocks01 {
    
    /*
        1)"static block"lar "static variable"lara "ilk degerlerini atamak" (initialize) icin kullanilir
        2)"static bir variable'a deger atamak icin kod yazmaniz gerekirse "static block" kullaniniz
        3)"static bir variable'a deger atamak icin kod yazmaniz gerekirse
        4)Bir class'da bir'den fazla static block varsa ustteki once calistirilir.
     */

    //static variable'lar "static block" kullanilmadan da initialize edilebilirler
    public static double pi = 3.14;

    //static variable'lar "static block" kullanilarak da "initialize" edinebilirler
    //Asagidaki gibi "static" bir variable'a deger atamak icin kod yazmaniz gerekirse "static block" kullaniniz
    public static void main(String[] args) {
        System.out.println("Hey I am a main method");
    }
    public static double price;

    static{
        System.out.println("Hey I am a static block 2");
    }

    static {
        System.out.println("Hey I am a static block 1");
        LocalDate d = LocalDate.now(); //Gunumuz tarihini verir. Henuz biz ogrenmedik
        if(d.getMonthValue()==3){
            price=1000;
        }else {
            price = 1200;
        }
    }

}
