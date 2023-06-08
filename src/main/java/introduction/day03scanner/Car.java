package introduction.day03scanner;

public class Car {

    //Variable'lar olusturalim
    public  String model = "Corolla";
    public int fiyat = 20000;
    //Normalde String yazarsak default olarak kabul eder. o zaman sadece belirli kisiler kullanir
    //Bu sekilde herkes kullanabilir.
    //Bence : main method içerisinde tanımlamadığımız için ayrıca access modifier koymak zorundayız başına.

    //Method'lar olusturalim
    //Return type yoksa yani veri döndürmüyorsa void yaz.
    //Return type void oldugunda method icinde "return" keyword'u kullanilmaz

    public void hareket(){
        System.out.println("Corolla hizli hareket eder");

    }
    public void dur (){
        System.out.println("Coorolla guvenli bir sekilde durur");
    }
    /*
    Bu Java methodu "dur" adında ve parantez içinde hiçbir şey bulunmuyor. Bu, methodun hiçbir girdi almayacağı
    anlamına gelir ve sadece içindeki gövdesinde belirtilen işlemi yapar, yani "Coorolla guvenli bir sekilde durur"
    metnini konsola yazdırır.
     */


}
