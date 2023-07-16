package javaders.day32maps;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {
        

        HashMap<String, Integer> stdAges = new HashMap<>();
        //1. data type(String) key'ler, 2. data type(Integer) value'ler icin

        stdAges.put("Ajda", 77);
        stdAges.put("Ezel", 38);
        stdAges.put("Tom", 76);
        stdAges.put("Brad", 58);
        stdAges.put("Angelina", 58);
        //"key"i tekrarli kullandigimizda hata vermez, en son verilen entry'nin degerini(value) kabul eder.
        //Bu yontem value guncellemede kullanilabilir. Buna "overwrite" denir.
        stdAges.put("Tom", 83);

        //HashMap'ler entry'leri rastgele siralar, bu yuzden cok hizli calisir.
        //Map'ler entry'leri siralarken "key"lere bakarak siralama yapar.
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=38}

        //replace() methodu "value"lari "key"leri kullanarak update etmeye yarar.
        stdAges.replace("Ezel", 39);
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39}

        //replace("Angelina", 57, 61); methodu Map icin de '"Angelina", 57' varsa 57 i 61 e donusturur, yoksa donusturmez.
        stdAges.replace("Angelina", 57, 61);
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39}

        //putIfAbsent("Ali", 60); methodu Map'de "Ali" key olarak yoksa Map'e "Ali=60"i ekler, varsa eklemez.
        stdAges.putIfAbsent("Ali", 60); //Yani overwrite yapmaz. Key'e bakar
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39, Ali=60}

        //getOrDefault("Ayse", 0); methodu Map'de varolan "key"ler icin "get() methodu" ile ayni ciktiyi verir.
        //getOrDefault("Ayse", 0); methodu Map'de olmayan "key"ler icin ikinci parametreye koydugunuz degeri
        //"get() methodu" ise null verir.
        System.out.println(stdAges.get("Tom"));// 83
        System.out.println(stdAges.getOrDefault("Tom", 0));// 83

        System.out.println(stdAges.get("Ayse"));// null
        System.out.println(stdAges.getOrDefault("Ayse", 0));// 0

        //containsValue(77); methodu value'larin icerisinde 77 nin olup olmadigini kontrol eder.
        System.out.println(stdAges.containsValue(77));//true
        System.out.println(stdAges.containsValue(99));//false

        //containsKey("Ali"); methodu key'larin icerisinde Ali'nin olup olmadigini kontrol eder.
        System.out.println(stdAges.containsKey("Ali"));//true

        //remove("Ali"); methodu "key" kullanarak "entry"i silmeye yarar
        stdAges.remove("Ali");
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39}

        //remove("Tom", 81); methodu Map'de key'si "Tom", value'su 81 olan bir entry varsa onu siler, yoksa silmez.
        stdAges.remove("Tom", 81);
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39}

        HashMap<String, Integer> kidsAge = new HashMap<>();
        kidsAge.put("John", 12);
        kidsAge.put("Jim", 22);
        kidsAge.put("Jack", 32);

        //stdAges.putAll(kidsAge); methodu stdAges Map'ine kidsAge Map'ini ekler. Dolayisiyla stdAges Map'i degismis olur.
        //Ama kidsAge Map'i degismez.
        stdAges.putAll(kidsAge);
        System.out.println(stdAges);//{Tom=83, Angelina=58, John=12, Ajda=77, Brad=58, Jack=32, Ezel=39, Jim=22}
        System.out.println(kidsAge);// {John=12, Jack=32, Jim=22}

    /*
        Maplerde keyler tekrarsiz olmali, ama valueler tekrarli olabilir. Maplerde key ve valuler {} icine konulur.
     Eger key tekrarli kullanilirsa kod hata vermez, ancak tekrarli olarak yazilan key'in en son ekleneni alir,
     onu yazdirir. Key'in yeni degerini(value) alir. Ornek "Tom" 76 idi, ikinci eklemede "Tom" 83 oldu ve sonucta
      "Tom" 83 olarak yazildi. Bu yontem VALUE GUNCELLEME'de tavsiye edilmese de kullanilabilir.


         //Entry'lerin belirli bir sirada kullanilmasi gerekmiyorsa "HashMap" kullanmak en iyi yoldur*/





    }
}
