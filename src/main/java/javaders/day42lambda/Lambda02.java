package javaders.day42lambda;

import javaders.day41lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda02 {
    public static void main(String[] args) {
        

        System.out.println(getSumInTheGivenRange(7, 10));
        System.out.println(getMultiplicationInTheGivenRange(7, 10));
        System.out.println(getSumOfDigitsInTheGivenRange(45, 47));

    }//main

    //Swap icin bir tane private method olustur
    private static List<Integer> swap(int starting, int ending){
        List<Integer> list = new ArrayList<>();
        if(starting>ending){
            starting = starting + ending;
            ending = starting - ending;
            starting = starting - ending;
        }
        list.add(starting);
        list.add(ending);
        return list;
    }

    //Example 1: 7'den 10'a kadar tam sayilarin toplamini hesaplayan method'u olusturunuz.

    public static int getSumInTheGivenRange(int starting, int ending){

        List<Integer> list = swap(starting, ending);

        return IntStream.
                rangeClosed(list.get(0), list.get(1)).
                sum();
        //IntStream, int'i bize stream'in icinde verir. Bu akisin baslangic ve bitis sinirlarini belirlemek icin
        // rangeClosed methodunu kullandik. rangedClosed method'u baslangic ve biris dahil. sadece ranged method'u
        // baslangic dahil bitis dahil degil
        //rangeClosed() methodu ilk sayi buyuk oldugunda calismaz
    }

    //Example 2: 7'den 10'a kadar tamsayilarin carpimini hesaplayan method'u olusturunuz.

    public static int getMultiplicationInTheGivenRange(int starting, int ending){

        List<Integer> list = swap(starting,ending);

        return IntStream.rangeClosed(list.get(0), list.get(1)).reduce(Math::multiplyExact).getAsInt();

        //rangeClosed() methodu ilk sayi buyuk oldugunda calismaz

    }

    //Example 3: 45'den 47'e kadar tamsayilarin rakamlari toplamini hesaplayan method'u olusturunuz.

    public static int getSumOfDigitsInTheGivenRange(int starting, int ending){

        List<Integer> list = swap(starting,ending);

        return IntStream.rangeClosed(list.get(0), list.get(1)).map(Utils::getSumOfDigits).sum();

        //Utils::getSumOfDigits, Utils Class'ini biz olusturmustuk icine getSumOfDigits bu kodu yazdik ve onu kullandik
    }


}
