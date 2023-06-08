package javaders.day31collectionsmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    public static void main(String[] args) {
        //Map deyince aklimiza sozluk gelsin. sol tarafta kelime sag tarafta manasi oluyor.
        // Mesela Cat = Evcil hayvan, Dog = Evcil Hayvan, Crocodile = Timsah, Tiger = Kaplan...
        //Ornekteki: Sol taraftakiler tekrarsiz, Sag taraftakiler tekrarli olabilir.
        //Map'de tekrarsiz kisma: KEY, tekrarli kisma: Value denir.
        //Map'ler "Key", "Value" structor'ini kullanir.

        /*
        NOTES:

        MY NOTES:
        Map'lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir.
        "key" kismi tekrarsiz, "value" kismi tekrarli olabilir.
        Mapler "key" ve "value" structure'ini kullanir. //Bu onemli
        Map'lerdeki elemanlara "entry" denir.
        Elemanlarin tamanina ise "Entryset" denilir.
        "Entry"ler tekrarsiz oldugu icin "EntrySet" denilir.
        "Key" ve "Value"lar ayri ayri data type'larinda olabilirler.

        "HashMap"ler Entry'leri rastgele siralar, bu yuzden en hizli "Map"dir
        Map'ler {} uclu parantez kullanirlar.

         */

        HashMap <String, Integer>   countryPopulation = new HashMap<>();
        countryPopulation.put("Germany",83000000);
        countryPopulation.put("Albania",3000000);
        countryPopulation.put("USA",400000000);
        countryPopulation.put("Turkiye",83000000);
        countryPopulation.put("Netherland",18000000);

        System.out.println(countryPopulation);
        //{Turkiye=83000000, Netherland=18000000, USA=400000000, Germany=83000000, Albania=3000000}
        //"HashMap"ler Entry'leri rastgele siralar, bu yuzden en hizli "Map"dir

        int usaPopulation = countryPopulation.get("USA"); //get method'u "key" ile calisir ve bize Value'yi verir
        System.out.println("usaPopulation = " + usaPopulation);//usaPopulation = 400000000

        //Butun key'leri nasil alabiliriz?
        Set<String> keys = countryPopulation.keySet(); //Bize Set dondurdugu icin bir Set conteyner'inin icerisine assign ettik
        //Method'un return type'i olursturacagimiz conteyner'in Data type'i ile ayni olmalidir.
        //Ezberlemeye gerek yok Method'un icerisine girerer bakabilirsin.
        System.out.println(keys);//[Turkiye, Netherland, USA, Germany, Albania]

        Collection<Integer> values = countryPopulation.values();
        System.out.println(values);//[83000000, 18000000, 400000000, 83000000, 3000000]

        //Example 1: countryPopulation map'indeki ulkelerin nufuslarinin ortalamasi nedir?
        Collection<Integer> value = countryPopulation.values();
        int sum = 0;

        for (Integer w : value){
            sum+=w;
        }
        System.out.println(sum/ value.size());//117400000

        Set<Map.Entry<String,Integer>> entries = countryPopulation.entrySet();
        System.out.println(entries);
        //[Turkiye=83000000, Netherland=18000000, USA=400000000, Germany=83000000, Albania=3000000]
        //Loop'lar Map'lerde calismaz. Mesela Map elemanlarini For icinde kullanamyiz bu nedenle bazen kullanmak icin
        // Entry'leri Set icerisine koyup islem yapabiliyoruz.
        //Loop'lar map'ler ile kullanilamaz. Sadece entry'ler arasinda gezmek istedigimizde loop kullaniriz

        //Example 2: countryPopulation Map'indeki ulkelerin isimlerinin character sayisi ile nufuslarinin toplamini
        // bulunuz

        int toplam = 0;

        for (Map.Entry<String,Integer> w : entries){

            toplam += w.getKey().length()+w.getValue();

        }

        System.out.println("toplam = " + toplam);//toplam = 587000034









    }//main
}//class
