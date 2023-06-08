package advanced_practice.lambda_recap;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda01 {
    //Lamba Map haric tum Collection uyelerinde kullanabiliriz.Map'lerde key value iliskisi oldugu icin kullanamayiz
    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));

        ciftVePozitifLamExYazdir(sayi);
        System.out.println(" \n  *******");
        ciftVePozitifMetRef(sayi);
        System.out.println(" \n  *******");
        kareYazdir(sayi);
        System.out.println(" \n  *******");
        kareTekrarsiz(sayi);
        System.out.println(" \n  *******");
        buyKucSirala(sayi);
        System.out.println(" \n  *******");
        pozitifKupBirlerBas5(sayi);
        System.out.println(" \n  *******");
        toplamMetRef(sayi);
        System.out.println("\n**********");
        toplamdaEx(sayi);
        System.out.println("\n********");
        System.out.println(ciftElKareKucBuySirListReturn(sayi));

    }

    //SORU1: List elemanlarının çift ve pozitif olanlarını, Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void ciftVePozitifLamExYazdir(List<Integer> sayi){

        sayi.stream().filter(t->t%2==0 && t>0).forEach(t-> System.out.print(t + " "));

    }


    //SORU2: List elemanlarının çift ve pozitif olanlarını, Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void ciftVePozitifMetRef(List<Integer> sayi){

        sayi.stream().filter(t->t%2==0 && t>0).forEach(UtilsForPractice::yazdir);
    }



    //SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın
    public static void kareYazdir(List<Integer> sayi){
        // sayi.stream().map(t->t*t).forEach(Utils::yazdir);

        sayi.stream().map(UtilsForPractice::kareBul).forEach(UtilsForPractice::yazdir);

    }


    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın
    public static void kareTekrarsiz(List<Integer> sayi){
        sayi.stream().map(UtilsForPractice::kareBul).distinct().forEach(UtilsForPractice::yazdir);
    }



    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın
    public static void buyKucSirala(List<Integer> sayi){
        sayi.stream().sorted(Comparator.reverseOrder()).forEach(UtilsForPractice::yazdir);
    }



    // SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız
    public static void pozitifKupBirlerBas5(List<Integer> sayi){
        sayi.stream().filter(t->t>0).map(t->t*t*t).filter(t->t%10==5).forEach(UtilsForPractice::yazdir);
    }



    // SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın
    public static void toplamMetRef(List<Integer> sayi){
        Optional<Integer> sonuc = sayi.stream().reduce(Integer::sum);

        System.out.println(sonuc);
    }

    // SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın

    public static void toplamdaEx(List<Integer> sayi){
        int sonuc = sayi.stream().reduce(0,(a,b)-> a+b);
        //toplama isleminde 0 etkisiz eleman oldugundan identity kismini baslangic olarak 0 aldik. a her zaman degerini
        // identity'den b ise degerini akistan alir.
        //Bir onceki soruda Method Reference kullandigimiz icin list elemanlarinin toplamini bir int'e assign
        // ettigimizde kizarmis ve Optional'a cevirmisti ama burda hata vermedi cunku hicbir deger olmasa bile
        // elimizde baslangic olarak 0 mevcut.
        System.out.println(sonuc);
    }

    //SORU9 : Listin cift elemanlarının, karelerini, kucukten buyuge sıralayıp list halinde return ederek yazdırınız

    public static List ciftElKareKucBuySirListReturn(List<Integer> sayi){
        List<Integer> sonuc = sayi.
                stream().
                filter(t->t%2==0).
                map(UtilsForPractice::kareBul).
                sorted().
                collect(Collectors.toList());
        return sonuc;
    }













    //Optional yapma sebebi :listin icerisinde hicbir eleman yoksa null olacagi icin ve bunu bir int'e assign edersek
    // NullPointerException verecegi icin Optional yaptik

/*
Ancak reduce metodu terminal metod oldugu icin bu metod sonrasinda forEach metodu gelmez. Ne yapmaliyiz?
Su ana kadar elimizde list elemanlarin toplam degeri var ve biz bunu bir integer'a assign edelim. Integer'a assign
edersek java kizariklik yaparak bizi uyaracak, bunu integer'a degil Optional'a assign etmemizi isteyecek. Ya akista
hicbir eleman yoksa bunu toplayamayacak. Akista hicbir eleman yoksa null olur. Java bunun tedirginligini yasiyor.
null'i integer'a assign edersek java bu durumda nulPointerException verebilirim diyor ve bu yuzden bunu Optional'a
donustur diye israr ediyor. Biz bunu kabul edip Optional<Integer> olarak yazinca kizariklik sona erer. Bundan
 */
    /*
    /*
sayi.stream().reduce(Integer::sum); list elemanlarinin toplamini elde ettik. list elemanlarinin toplami
int dir diye düsündük. int e assign ettk
        int sonuc = sayi.stream().reduce(Integer::sum);
java optional  yapmamizi istedi, cunku list bos olursa hicbir eleman yoksa "null" verir ve
bize exception firlatir. null degeri int kabul etmez.
bu sebeple altini cizer.
optional yaptigimizda sorun ortadan kalkar.

 */






}
