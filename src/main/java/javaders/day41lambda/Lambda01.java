package javaders.day41lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        //Lambda Expression. Expression(cumle)
        
        

        

        

        
    

        
        
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(8);
        nums.add(9);
        nums.add(7);
        nums.add(14);
        nums.add(-4);
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(15);

        System.out.println(getTheSumOfOdds1(nums));
        System.out.println();
        System.out.println(getTheSumOfOdds2(nums));
        System.out.println();

        System.out.println(getMultiplicationOfSquareOfEvens(nums));
        System.out.println();

        System.out.println(getTheSumOfEvenMaxAndOddMin(nums));
        System.out.println();

        System.out.println(getTheSumOfEvenLessThanSevenMaxAndOddMinGreaterThanEight(nums));
        System.out.println();

    }//main

    //Example 1: Verilen bir list'teki tek sayi olan elemanlarin kareleri toplamini hesaplayan method olusturunuz

    public static int getTheSumOfOdds1(List<Integer> nums){

        return nums.
                stream().
                filter(t->t%2!=0).
                map(t->t*t).
                reduce(0,(t,u)->t+u);
        //Note: reduce() methodundaki toplama isleminde "t" ilk parametrenin ilk degerini daha sonraki tum
            // degerleri toplamdan alir, "u" ise stream'den alir
        //identity (matematikteki etkisiz eleman)
        //Map'den sonra 4 deger kalmisti ama hepsini toplayip tek bir data'ya dondurdu bu yuzden method'un
            // ismi reduce(azaltmak). Mesela 40 tane sayi var ama biz en buyugunu veya en kucugunu bulmak istiyoruz,
            // bu sayi bir tane oldugu icin reduce kullanilabilir
    }//getTheSumOfOdds1

    public static int getTheSumOfOdds2(List<Integer> nums) {

        return nums.
                stream().
                filter(Utils::isOdd).
                map(Utils::getSquare).//ihtiyacimiz olan method'u olusturunuz ve method reference kullaniniz
                reduce(0,Math ::addExact);

    }//getTheSumOfOdds2

    public static int getTheSumOfOdds3(List<Integer> nums) {

        return nums.
                stream().
                filter(Utils::isOdd).
                map(Utils::getSquare).//ihtiyacimiz olan method'u olusturunuz ve method reference kullaniniz
                reduce(Math ::addExact).
                get();//get() method'u Optional<Integer>'i int'e cevirir

    }//getTheSumOfOdds2


    //Example 2 : Verilen bir list'teki çift sayi olan elemanlarin tekrarsız olarak
        //kareleri çarpımını  hesaplayan method olusturunuz.


    public static int getMultiplicationOfSquareOfEvens(List<Integer> nums) {

        return nums.
                stream().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                distinct(). //kareler tekrarsiz olmali ded isoruda. Mesela -2 ve 2'nin karesi 4 bu yuzden, burada kullandik
                reduce(1, (t, u) -> t * u);
        //Soruda, kareleri tekrarsız olmalı deniyor. Bu nedenle distinc methodu, kareleri hesapladiktan sonra
            // (map'ten sonra) yazildi.

    }

    //Example 3: Verilen bir list'teki cift sayi olan elemanlarin maximum degeri ile tek sayi olan elemanlarin
        // minimum degerinin toplamini hesaplayan method'u olusturunuz

    public static int getTheSumOfEvenMaxAndOddMin(List<Integer> nums){

        int maxEven =
                nums.
                stream().
                distinct().
                filter(t->t%2==0).
                reduce((t,u)->t>u ? t :u).// iki sayi al t buyukse t'yi degilse u'yu ver
                get();
                //burada farkli bir reduce kullandik. Geri donen data type Optional<Integer>
                //get() method'unu, Optional data dype normal data type'a cevirmesi icin kullandik. Burada get() bu ise yariyor

        int minOdd =
                nums.
                stream().
                distinct().
                filter(t->t%2!=0).
                reduce((t,u)->t<u ? t:u ).get();

        return  maxEven+minOdd;

    }

    //Example 4: Verilen bir list'teki cift sayi olan elemanlarin 7 den kucuk maximum degeri ile tek sayi olan
        // elemanlarin 8 den buyuk minimum degerinin toplamini hesaplayan method'u olusturunuz

    public static int getTheSumOfEvenLessThanSevenMaxAndOddMinGreaterThanEight(List<Integer> nums){

        int maxEven =
                nums.
                        stream().
                        distinct().
                        filter(t->t%2==0 && t<7).
                        reduce((t,u)->t>u ? t :u).
                        get();


        int minOdd =
                nums.
                        stream().
                        distinct().
                        filter(t->t%2!=0 && t>8).
                        reduce((t,u)->t<u ? t:u ).
                        get();

        return  maxEven+minOdd;

    }











}
