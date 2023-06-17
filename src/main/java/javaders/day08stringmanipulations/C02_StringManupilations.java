package javaders.day08stringmanipulations;

public class C02_StringManupilations {
    public static void main(String[] args) {
       

        

        //Ex: str String'indeki ilk gorunen "a" harfini "e" harfi ile degistiriniz

        //1)
        String str = "Hayirli Olsunda ";

        System.out.println("str = " + str.replaceFirst("a","e")); //str = Heyirli Olsunda

        /*
        2)
        String str1 = str.replaceFirst("a","e");
         System.out.println("str1 = " + str1);

        2. Yontem daha hizli calisir.
        Java'da mumkun oldugunca sout icerisini bos birakmak lazim
        --
         */

        //***************************       trim()      ****************

        /*
        trim() bir  String'deki basinda ve sonunda space karakterlerini siler (kirpar, tirpanlar)
        Aradaki spacelere dokunmaz.Saclar icin uclarindaki kiriklarin aldirilmasi gibi
    Cumledeki spacelerin silinmesi
         */

        //Ex: str String'indeki bas ve sonda space karakterlerini siliniz

        String str2 = "     Ali Can    ";
        String str3 = str2.trim();
        System.out.print("str3 = " + str3); //Burada sout'dan ln silersen sondakini silip silmedigini anlarsin
        System.out.println("***");

        //Ex: Asagida Fiyatlari verilen urunlerin toplam fiyatini bulunuz:
        String tv = "599.99$";
        String tv2 = tv.replace("$","");
        double tv3 = Double.valueOf(tv2);

        String laptop = "299.99$";
        String laptop2 = laptop.replace("$","");
        double laptop3 = Double.valueOf(laptop2);

        System.out.println("laptop3 = " + laptop3);
        System.out.println("tv3 = " + tv3);

        System.out.println("Toplam: "+(tv3+laptop3));

        /*
        valueOf() methodu String olan datayi bize sayi haline getirir
         */

        //Ex: Verilen ismin ilk isminin ilk harfini ve soyisminin ilk harfini ekrana yazdiriniz

        String tamIsim = "  mehmet fatih yildirim   ";  // ==> MFY



        char first = tamIsim.trim().toUpperCase().charAt(0);
        char second = tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);
        char third = tamIsim.trim().toUpperCase().split(" ")[2].charAt(0);
        System.out.println(" Ilk harf son harf: "+first+second+third);    //String data eklemeseydik char'lari ascii  olacakti
        /*
        DIKKAT!!!!!!    Bu kullanim cok onemli.

        .split(" ")[1].charAt(0)        Bu sekilde'de kirpip harf cekebilirsin
        split ile parcaladik sonrasinda 2.index aldik sonrasinda char ile harfi aldik
         */







    }//main
}//class
