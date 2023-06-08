package javaders.day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz
        String names[] = {"K", "C", "R", "A", "S"};

        String el = "R";

        //1.Way:
        int counter = 0;

        for(String w : names){
            if(w.equals(el)){
                counter++;
                break;
            }
        }
        if(counter>0){
            System.out.println("Array has " + el);
        }else{
            System.out.println("Array does not have " + el);
        }

        //2.Way: binarySearch() method hizli arama yapar
        Arrays.sort(names);

        //1)binarySearch() methodunu sort() kullanmadan kullanmayiniz cunku binarySearch() mantigi sirali elemanlar icin gecerlidir
        //2)binarySearch() methodu var olan elemanlar icin size o elemanin index'ini verir.
        //3)binarySearch() methodundan aldiginiz index 0 veya 0'dan buyukse bu o eleman array'de var demektir.
        //4)binarySearch() methodu olmayan elemanlar icin negatif tamsayi degeri verir.
        //  "-" isaretinin anlami o eleman yok demektir.
        //  "sayi" ise oeleman olsaydi kacinci eleman olurdu demektir.
        int result = Arrays.binarySearch(names, el);
        System.out.println(result);

        if(result<0){
            System.out.println("Array does not have " + el);
        }else{
            System.out.println("Array has " + el);
        }
        /*
        Binarysearch() calisma mantigi su: Oncesinde sort yaziyoruz ve belli bir siraya sokuyor. Mesela 10.000 tane
        sayi var ve bizim sayimiz 1100. Binary array'e ortadan bakiyor ikiye boluyor ve siralamaya gore saga veya sola
        boluyor. Mesela benim ornegimde once 5.000'e bakiyor sonra sayi 5.000'den kucuk oldugu icin sonrasini eliyor
        5.000'in altina bakiyor. Sonra 2500'e geliyor 2500'de olmadigi icin 2500 üstünü eliyor. Sonra 1250 ye gelip yine
        ikiye boluyor vs.. Yani hepsini tek tek kontrol etmiyor. Zaten sirali oldugu icin sürekli ortadan ikiye bolerek
        sirasina gore diger tarafi ikiye bolmeye gidiyor ve boylelikle Java'yi daha az yormus oluyor
         */
    }
}
