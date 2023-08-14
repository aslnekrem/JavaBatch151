package javaders.day42lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambda01 {
    
    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");
        names.add("Brad");

        System.out.println(sortWithLastCharDistinctUpperInList(names));
        System.out.println(sortWithLengthReversedSameLengthInNaturelOrderLowerInList(names));
        System.out.println(isLengthMoreThanTwo(names));
        System.out.println(noLengthLessThanThree(names));
        System.out.println(atLeastOneisLengthLessThanFour(names));


        //Example 1: List elemanlarini son harflerine gore natural order'da tekrarsiz olarak buyuk harfle bir
        // list'in icinde return ediniz.
        // [Tom, Alex, Jim, Michael, Mary, Alexander, Alex] ==> [MICHAEL, JIM, TOM, ALEXANDER, ALEX, MARY]

    }//main

    public static List<String> sortWithLastCharDistinctUpperInList(List<String> names){

        return  names.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                collect(Collectors.toList());
                //Normalde distinct elemanlari depolamak icin "Set" kullanilir. Ama Lambda'daki
                // collect(Collectors.toSet()); method'u elemanlari rastgele siralar halbuki bu soruda rastgele siralama
                // kabul edilmiyor. Bu yuzden mecburen collect(Collectors.toList());


    }

    //Example 2:List elemanlarini character sayilarina gore ters sirada kucuk harfle bir list'in icinde return ediniz.
    //Ayni character sayisina sahip elemanlar kendi icinde alfabetik sirada olsun
    //[Tom, Alex, Jim, Michael, Mary, Alexander, Alex] ==> Alexander,Michael,Alex,Alex, Mary,Jim,Tom]

    public static List<String> sortWithLengthReversedSameLengthInNaturelOrderLowerInList(List<String> names) {

        return  names.
                stream().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length).reversed().thenComparing(t->t.charAt(0))).
                //Burada yazdigimiz reversed method'u tam tersini yap diyor. Yani orada sort method'u kucukten buyuge
                // siralama yapacakken biz ona reversed yazarak buyukten kucuge sirala dedik
                collect(Collectors.toList());


    }

    //Example 3: List elemanlarinin tamaminin character sayisinin 2den buyuk olup olmadigini kontrol
    // eden methodu olusturunuz

    public static boolean isLengthMoreThanTwo(List<String> names){

        return names.
                stream().
                allMatch(t->t.length()>2);//Ortusmek eslesmek demek. Yani parantezin icine yazacagimiz kuralla hepsi
                                            // eslesiyorsa true eslesmiyorsa false dondurecek bize
                                            //Bu allMatch method'unu Tester'lar cok kullanir
        //Bir List'deki spesifik elemanlarin farkli bir ozellige sahip olup olmadigini anlamak icin
        // allMatch method'unu kullaniriz

    }

    //Example 4: List elemanlarinin hicbirinin character sayisinin 3 den kucuk olmadigini
    // kontrol eden method'u olusturunuz.

    public static boolean noLengthLessThanThree(List<String> names){

        return names.
                stream().
                noneMatch(t->t.length()<3);

    }

    //Example 5: List elemanlarinin en az birinin character sayisinin 4 den kucuk olup olmadigini
    // kontrol eden method'u olusturunuz.

    public static boolean atLeastOneisLengthLessThanFour(List<String> names){

        return names.
                stream().
                anyMatch(t->t.length()<4);
                //anyMatch() method'u en az bir tanesi bu kosulu sagliyorsa digerlerine bakmaz. En az biri sagliyorsa
                // true dondurur

    }

     /*
        Match
        allMatch() ==> tum elemanlar sarti saglarsa true dondurur
        anyMatch() ==>bir yada birden daha fazla eleman sarti saglarsa true dondurur
        noneMatch() ==>hic bir eleman sarti saglamazsa true dondurur
        */












}//class
