package advanced_practice.lambda_recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {

    public static void main(String[] args) {

        List<String> meyve = new ArrayList<>(Arrays.asList("elma","portakal","uzum","cilek","greyfurt","nar",
                "mandalina","armut","elma","keciboynuzu","elma"));



    }//main

    // SORU1 : List elemanlarının ilk harfi 'e' veya 'c' olanlari yazdıralım

    public static void ilkHarfECYazdir(List<String> meyve){

        meyve.stream().filter(t->t.startsWith("e") || t.startsWith("c")).forEach(UtilsForPractice::yazdir);

    }

    // SORU2 : List elemanlarının hepsinin basina ve sonuna yildiz ekleyerek yazdiralim

    public static void elemanBasinaVeSonunaYildiz(List<String>myList){
        myList.stream().map(t->"*"+t+"*").forEach(UtilsForPractice::yazdir);
    }

    // SORU3 : List elemanlarını karakter sayısına gore buyukten kucuge sıralayınız,
    // karakter sayısı en buyuk ilk 3 elemanı List halinde return ederek yazdırınız

    public static List karakterSayGoreBuyKucSirKarSayEnBuyIlk3(List<String>myList){
         List<String> sonuc =
                myList.
                        stream().
                        sorted(Comparator.comparing(t->t.toString().length()).reversed()).
                        //length ilk basta kizardi ama biz t.toString() koyarak oraya karakter sayisinin bos
                        // olmayacaginin teminatini vermis olduk
                        limit(3).
                        collect(Collectors.toList());

         /*
         return meyve.
         stream().
         sorted(Comparator.comparing(String::length).reversed()).
         limit(3).
         collect(Collectors.toList());
          */
        return sonuc;
    }



















}//class
