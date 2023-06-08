package advanced_practice.day07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);
        elemanlariYazdir1(nums);
        System.out.println();
        elemanlariYazdir2(nums);
        System.out.println();
        ciftElYazdir(nums);
        System.out.println();
        ciftElYazdir2(nums);
        System.out.println();
        tekElKareYazdir(nums);
        System.out.println();
        tekSayilarinKupleriniTekrarsizYazdir(nums);
        System.out.println();
        System.out.println(benzersizCiftSayilarinKareleriTop(nums));
        System.out.println();
        benzersizCiftElKareCarpimiYazdır(nums);
        System.out.println();
        listedenMaxYazdir1(nums);
        System.out.println();
        listedenMaxYazdir2(nums);
        System.out.println();
        listedenMaxYazdir3(nums);
        System.out.println();
        listMinEleman(nums);

    }//main

    //1)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void elemanlariYazdir1(List<Integer> nums) {//12 9 131 14 9 10 4 12 15
        for (Integer w : nums) {
            System.out.print(w + " ");
        }

    }


    //2)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void elemanlariYazdir2(List<Integer> nums) {//[12, 9, 131, 14, 9, 10, 4 12, 15]
        nums.stream().forEach(t -> System.out.print(t + " "));


    }
    //3)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)

    public static void ciftElYazdir(List<Integer> nums) {//[12, 9, 131, 14, 9, 10, 4 12, 15]
        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.print(w + " ");//12 14 10 4 12
            }
        }
    }

    //4)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void ciftElYazdir2(List<Integer> nums) {//[12, 9, 131, 14, 9, 10, 4 12, 15]
        nums.
                stream().
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " "));
    }

    //5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void tekElKareYazdir(List<Integer> nums) {//[12, 9, 131, 14, 9, 10, 4 12, 15]
        nums.
                stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                forEach(t -> System.out.print(t + " "));//81 17161 81 225
    }

    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void tekSayilarinKupleriniTekrarsizYazdir(List<Integer> nums) {
        nums.
                stream().
                distinct().
                filter(t -> t % 2 != 0).
                map(t -> t * t * t).
                forEach(t -> System.out.print(t + " "));//729 2248091 3375
    }

    //7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz
    public static int benzersizCiftSayilarinKareleriTop(List<Integer> nums) {

        return nums.
                stream().
                distinct().//benzersiz elemanlar alindi
                        filter(t -> t % 2 == 0).//cift olanlari secildi
                        map(t -> t * t).
                reduce(Math::addExact).
                get();//456

    }

    //8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz
    public static void benzersizCiftElKareCarpimiYazdır(List<Integer> nums) {
        Integer benzersizCiftKareToplam = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(Math::multiplyExact).
                get();//45158400

        System.out.println(benzersizCiftKareToplam);
    }

    //9)Liste ogelerinden max degeri veren bir method olusturunuz
    public static void listedenMaxYazdir1(List<Integer> nums) {
        //1.Yol
        Integer max = nums.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println("max = " + max);
    }

    public static void listedenMaxYazdir2(List<Integer> nums) {
        Integer max2 = nums.stream().distinct().reduce(nums.get(0), (t, u) -> t > u ? t : u);
        System.out.println("max2 = " + max2);


    }

    // 3.Yol
    public static void listedenMaxYazdir3(List<Integer> nums) {
        Integer max3 = nums.stream().distinct().sorted().reduce((t, u) -> u).get();
        System.out.println("max3 = " + max3);


    }


    //10)Liste ogelerinden minumum degeri veren method olusturunuz

    public static void listMinEleman(List<Integer> nums) {
        Integer min = nums.stream().distinct().reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
        System.out.println("min = " + min);
    }


}
