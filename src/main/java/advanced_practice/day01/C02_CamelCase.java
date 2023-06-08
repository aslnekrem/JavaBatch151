package advanced_practice.day01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_CamelCase {
    //IWQ
    // INTERWIEW QUESTIONS QA AUTOMATION Nisan 2023
/*
    String str = "cats AND*Dogs-are Awesome"
    verilen String Datanin her bir kelimenin ilk harfini
    buyuk harf diger harfleri kucuk harf olacak
    "CatsAndDogsAreAwesome" sekilde veren kodu yaziniz
    input==> "cats AND*Dogs-are Awesome"
    output ==>"CatsAndDogsAreAwesome
 */
    public static void main(String[] args) {
        //tum harfler haricindeki yerlerden parcala

        String str = "cats AND*Dogs-are Awesome";

        String words[] = str.split("[^a-zA-Z]");
        System.out.println(Arrays.toString(words));//[cats, AND, Dogs, are, Awesome]

        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            if (w.length() > 0) {
                sb.append(w.substring(0, 1).toUpperCase());
                if (w.length() > 1){
                    sb.append(w.substring(1).toLowerCase());
                }
            }
        }
        System.out.println(sb);




    }
}
