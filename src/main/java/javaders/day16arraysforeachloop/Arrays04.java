package javaders.day16arraysforeachloop;

import java.util.Arrays;

public class Arrays04 {

    public static void main(String[] args) {

        String s = "Java is easy. Learn Java earn money.";
        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words));// [Java, is, easy., Learn, Java, earn, money.]
        System.out.println(words.length);

        //Size verilen bir cumlede kac harf oldugunu gosteren kodu yaziniz.
        String letters[] = s.replaceAll("[^a-zA-Z]", "").split("");
        //Split'i boyle kullaninca hepsini tek tek ayiriyor. Yani hiclikten bol diyoruz
        System.out.println(Arrays.toString(letters));//[J, a, v, a, i, s, e, a, s, y, L, e, a, r, n, J, a, v, a, e, a, r, n, m, o, n, e, y]
        System.out.println(letters.length);

    }
}
