package javaders.day39lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        
    

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angelina");

        printElements(myList);
        System.out.println();
        printEl(myList);
        System.out.println();
        printElExceptStartsWithT(myList);
        System.out.println();
        printElLengthLessThanFour(myList);
        System.out.println();
        printElLengthMoreThanFourWithUpper(myList);
        System.out.println();
        printElLengthMoreThanFourUniqueLowerCase(myList);
        System.out.println();
        printElUniqueToUpperCaseSorted(myList);
        System.out.println();
        printElUniqueToLowerCaseSortWtihLength(myList);


    }//main

    //Example 1: Bir list'deki elemanlari console'a yazdiran method'u olusturunuz.
    //1. Way
    public static void printElements(List<String> myList) {

        //Asagidaki kod gibi yapisal kodlara Structured Programming deniliyor
        //Cunku asagida bir yapi olusturduk
        for (String w : myList) {

            System.out.print(w + " ");

        }

    }//printElements



    //2.Way
    public static void printEl(List<String> myList) {

        //Asagidaki gibi kullanima ise
        //Cunku asagida bir yapi olusturmadik sadece method'larla anlattik ne yapacagimizi
        //sadece methodlarin kullanildini yapinin ve mimarinin onemsiz oldugu kodlara "functional programming" denir
        myList.stream().//stream method'u data'lari akisa sunar
                forEach(t-> System.out.print(t + " "));//buradaki "t" yukaridaki foreach'deki "w" ile ayni
        //stream() List'in yapisini yukaridan asagiya olacak sekilde degistirir.
    }//printEl


    /*
    Main method disinda bir listteki elemanlari console'a yazdiran kodumuzu olusturalim.

public static printElements(List<String> myList) olarak methodumuzu olusturduk. Listimizi import ettik.
for each loop kullandik. sadece listimizi for each icinde String w'ya assign ettik. Sout icinde w+ " " yazdik.
Bu methoda bir List vermeliyiz.  Main method icine myList isimli String List olusturduk. Listimize add methodu ile
 elemanlar ekledik. methodu parantezi icine myList ekleyerek cagirdik.
Calistirinca ekrana elemanlar yazildi. Bu birinci yoldu.

Ikinci Yolumuz:  Burada Lambda'dan faydalanacagiz. Ayni methodu alip, List'in yapisini stream yapmasini isteyecegiz.
Boylelikle bircok methodu kullanabiliriz. Ornek: myList.stream().forEach();
Buarada myList'i stream'e cevirdik ve for each methodunu kullanmasini istedik. for each methodu icine
t-> System.out.print(t); yazdik. Kodu bu sekilde calistirinca birinci yoldaki ile ayni sonucu ekrana yazdi.

myList'imizde Tom, Jim, Clara var. stream ile listin [Tom, Jim, Clara] yapisi yukaridan asagiya olacak sekilde
degisti. Tom
         Jim
         Clara

  stream'a donusunce for each ilk elemani alip t icine koyuyor. Biz java'ya print t deyince buaraya Tom yaziyor.
  Sonra for each gelip ikinci elamani aliyor. javaya print deyince Jim yazdiriyor ve devaminda Clara'yi bu sekilde
  yazdiriyor. Her yazdirmada bir bosluk birakiyor.
     */

    //Example 2: Bir List'teki T ile baslayanlar haric tum elemanlari console'a yazdiran method'u olusturunuz.

    public static void printElExceptStartsWithT ( List<String> myList){
        myList.stream().filter(t->!t.startsWith("T")).forEach(t-> System.out.print(t+ " "));
        //filter: oktan sonraki kurali dogru yapan elemanlari sececek
    }

    //Example 3: Bir List'te character sayisi 4'den az olan tum elemanlari console'a yazdiriniz

    public static void printElLengthLessThanFour(List<String> myList){
        myList.stream().
                filter(t->t.length()<4).
                forEach(t-> System.out.print(t+ " "));
    }


    //Example 4: Bir List'te character sayisi 4'den fazla tum elemanlari buyuk harflerle console'a yazdiran
    // method'u olusturunuz.
    public static void printElLengthMoreThanFourWithUpper(List<String> myList){
        myList.stream()
                .filter(t-> t.length()>4).map(t->t.toUpperCase()).forEach(t-> System.out.print(t+" "));
        //Var olan elemani degistirmek icin "map" method'unu kullandik
    }

    //Example 5: Bir List'teki character sayisi 4 den cok olan tum elemanlari tekrarsiz olarak kucuk harflerle
    // console'a yazdiran method'u olusturunuz.

    public static void printElLengthMoreThanFourUniqueLowerCase(List<String> myList){
        myList.
                stream(). //6eleman ile calisiyor
                filter(t-> t.length()>4.). //3 elemanla calisiyor
                distinct().//distinct method'u tekrarli elemanlari sadece bir kere kullanir //2 elemanla calisiyor
                map(t-> t.toLowerCase()).
                forEach(t-> System.out.print(t + " "));
        //functional programming'de her noktadan sonra asagiya inilir readable olmasi icin

        //Onemli Note: siralamayi az eleman kullandiran kosullari one cekerek yapmak daha hizli hale getirir code'u
        //Mesela burada "map"i one cekmeye gerek yok cunku gereksiz yere digerlerini de kucultecek

        //Lambda'da elemanlari azaltanlar buyuk cogunlukla once kullanilir, lazim olan elemanlar elimize geldikten
        // sonra biz onu istedigimiz formata sokariz

        /*
        myList.stream(). 6 elemanla calisiyor
                distinct(). // 4 elemanla calisiyor
                filter(t-> t.length()>4.). // 2 elemanla calisiyor
                map(t-> t.toLowerCase()).
                forEach(t-> System.out.print(t + " "));
         */

    }

    //Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran
    // method'u olusturunuz.

    public static void printElUniqueToUpperCaseSorted(List<String> myList){
        myList.
                stream().
                distinct().//tekrarsiz
                map(t-> t.toUpperCase()).//map:yapisini degistirir
                sorted().//sorted().//Alfabetik siraya gore dizer
                forEach(t-> System.out.print(t + " "));
    }
    //Lambda: File Array Stream Collection List gibi bir cok yerde kullanilir.

    //Example 7: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore kucukten buyuge siralayarak
    // console'a yazdiran method'u olusturunuz.
    public static void printElUniqueToLowerCaseSortWtihLength(List<String> myList){

        myList.
                stream().
                distinct().
                map(t->t.toLowerCase()).
                sorted(Comparator.comparing(t->t.length())).//Comparator karsilastirici demek
                //siralamanin kuralini biz belirleyeceksek sorted'da ikinciyi kullaniyoruz seceneklerden yani buradaki gibi
                forEach(t-> System.out.println(t + " "));

    }

}//Class
