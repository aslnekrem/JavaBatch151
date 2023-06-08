package javaders.day15loopsarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Array'leri kisayol'dan nasil olusturabiliriz
        /*
            1)Application larda "data" ile bu data lari isleyen kod lar(logic) birbirinden ayrilir.
                    Yani; logic data'ya bahimli olmamalidir.
                    Data ya bagimli olarak yazilan kod'lara "hard code" denir.
                    "hard code" hatali kod demektir
                    Asagidaki grades array'inde son elemani almak icin "4" veya "grades.length-1" kullanilabilir
                    "4" kullanirsaniz array'e bir eleman eklendiginde kodunuz yanlis cikti verir ama "grades.length-1"
                    kullanirsaniz hep dogru sonucu alirsiniz
         */

        int grades[]= {67,98,100,34,76};
        System.out.println(Arrays.toString(grades));//[67, 98, 100, 34, 76]

        //Example 1: grades array indeki en kucuk ve en buyuk grade in toplamini ekrana yazdiran kodu yaziniz
        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades));
        System.out.println(grades[0]+grades[grades.length-1]);

        //Example 2: Size verilen bir String array deki isimlerin 5 character'den az character icerenleri consol'a
        //yazdiriniz


        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Kemal";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";
        for (String w : stdNames){
            if (w.length()<5){
                System.out.println(w);
            }

        }

        //Example 3: Size verilen String array deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
        // kisilerden onceki isimleri ve "F" ile baslayanlari console a yazdiriniz

        String names[] = new String[5];
        names[0] = "Ajda";
        names[3] = "Cuneyt";
        names[2] = "Kemal";
        names[1] = "Ayhan";
        names[4] = "Filiz";
        Arrays.sort(names);//Alfabetik siraya koyduk boyle
        //sort() method'u numeric data'lari kucukten buyuge (ascending) dizer.
        //String leri ise alfabetik sirada(alphabetically) dizer
        //ascending + alphabetically ==> Natural order

        for (String w:names) {
            System.out.println(w);
            if(w.startsWith("F")){
                break;
            }

        }
        System.out.println("********************************");
        //Example 3: Size verilen String array deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
        //  isimler haric diger isimleri console a yazdiriniz

        String arr[] = new String[5];
        arr[0] = "Ajda";
        arr[3] = "Cuneyt";
        arr[2] = "Kemal";
        arr[1] = "Ayhan";
        arr[4] = "Filiz";
        Arrays.sort(arr);

        for (String w:arr) {

            if(w.startsWith("F")){
                continue;   //Bir seyi yapma yazdirma gibi durumlar varsa continue kullanmak best practise
            }else {
                System.out.println(w);
            }

        }
        //Asagidaki 'de farkli bir yol

        for (String w:arr) {

            if(!w.startsWith("F")){
                System.out.println(w);
            }

        }









        /*
        asagidaki ornek sort kullanmadan
        int enKucukSayi= Integer.MAX_VALUE;  // arr[0];
        int enBuyukSayi= Integer.MIN_VALUE; //arr[0];

        for (int i = 0; i <grades.length ; i++) {
            if (grades[i]<enKucukSayi){
                enKucukSayi=grades[i];
            }
            if (grades[i]>enBuyukSayi){
                enBuyukSayi=grades[i];
            }
        }
        System.out.println("Array'deki en kucuk sayi : " + enKucukSayi);
        System.out.println("Array'deki en buyuk sayi : " + enBuyukSayi);
        Arrays.sort(grades);
        System.out.println("Array'deki en kucuk sayi : " + grades[0]);
        System.out.println("Array'deki en buyuk sayi : " + grades[grades.length-1]);

        */

    }//main
}//class
