package javaders.day40lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {

    
    /*
        Lambda collection ve listlerde kullanilabilir fakat map'lerde kullanilamaz
        Lambda functioanl programming'dir.

        Lambda Expression ==> forEach(t-> System.out.println(t+" "));
        Method Referance ==> forEach(System.out :: println);
        


     */
    public static void main(String[] args) {

        List<String > iller =
                new ArrayList<>(Arrays.asList("Van","MUS","Gumushane","Kutahya","Ankara","MUS","Ordu","Gaziantep","Hatay","Edirne"));

        bbykHrfLengthArtanDistinct(iller);//1) VAN MUS ORDU HATAY ANKARA EDİRNE KUTAHYA GUMUSHANE GAZİANTEP
        System.out.println();

        bbykHrfSonHrfArtanDistinct(iller);//2) KUTAHYA ANKARA GUMUSHANE EDİRNE VAN GAZİANTEP MUS ORDU HATAY
        System.out.println();

        bykHrfLegthArtanDistinctLengthAlfabetikSira(iller);
        System.out.println();

        System.out.println(karakterSayisiBestenFazlaOlan(iller));//4) [Van, MUS, MUS, Ordu, Hatay]
        System.out.println();

        System.out.println(hIleBaslayanOrRIleBitenElSil(iller));//5) [Van, MUS, MUS, Ordu]
        //4. Adimdaki method'da remove kullandigimiz icin bazi elemanlari sildik o yuzden kalan elemanlarla calistik 5. Method'da
        System.out.println();


    }//main

    //Asagidaki Lambda Expression'a ornek
    public static void bbykHrfLengthArtanDistinct(List<String> iller){

        System.out.print("1) ");
        iller.
                stream().
                distinct().
                map(t-> t.toUpperCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t+" "));
        //Van ve Mus ikisi de 3 harf, yazdirirken hangisini once eklediysek onu yazdiriyor

    }

    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore, artan sirada ,tekrarsiz olarak yazdiriniz

    public static void bbykHrfSonHrfArtanDistinct(List<String> iller){

        System.out.print("2) ");

        iller.
                stream().
                distinct().
                map(t->t.toUpperCase()).//bu sekilde t-> yazima Lambda Expression denir
                sorted(Comparator.comparing(t-> t.charAt(t.length()-1))).
                forEach(t-> System.out.print(t+" "));


    }

    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar
    //Method reference yontemi kullandik asagida ::
    public static void bykHrfLegthArtanDistinctLengthAlfabetikSira(List<String> iller){

        System.out.print("3) ");

        iller.
                stream().
                distinct().
                map(String :: toUpperCase).//String class'ina git toUpperCase method'unu kullan dedik
                //map(t->t.toUpperCase()).  Bu LambdaExpression ile yukaridaki yazim ayni.
                //Method reference yontemi ile yazmak diyoruz buna. Ve eger boyle yazmak mumkunse bunu bu kullanim Lambda
                    //Expression'a gore daha cok tercih edilir.
                sorted(Comparator.comparing(String :: length).thenComparing(Comparator.naturalOrder())).
                forEach(System.out :: println);
                //Method referance direkt olarak yazdirdigi icin bosluk birakamiyoruz. Yani sout icerisine ekleme yapamadik
        //      Bunun icin biz bir method yazacagiz ileride.
        //thenCompare kullanabilmek için öncesinde bir Compare kullanmış olmak lazim
    }


    // 4) Karakter sayisi 5 ten fazla olan elemanlari siliniz


    public static List<String> karakterSayisiBestenFazlaOlan(List<String> iller) {

        System.out.print("4) ");

        iller.
                removeIf(t->t.length()>5);

        //stream() method'u bazi method'lari ekliyor ama bazi method'lari kullanmamizi da engelliyor mesela removeIf
        //Bu yuzden burada removeIf kullanmak icin stream kullanmadik

        return iller;

    }

    // 5)"H" ile baslayan veya "r" ile biten elemanlari siliniz


    public static List<String> hIleBaslayanOrRIleBitenElSil(List<String> iller) {

        System.out.print("5) ");

        iller.
                removeIf(t -> t.startsWith("H") || t.endsWith("r"));


        return iller;
    }








    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz



    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore, artan sirada ,tekrarsiz olarak yazdiriniz



    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar


    // 4) Karakter sayisi 5 ten fazla olanelemanlari siliniz


    // 5)"H" ile baslayan veya "r" ile biten elemanlari siliniz



    // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin




    //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.


}
