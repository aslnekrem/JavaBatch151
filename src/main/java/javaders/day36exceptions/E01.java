package javaders.day36exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {

    /*
     "Runtime Exception"a ornektir.
     "Runtime Exception" lara "Unchecked Exception" da denir.

    2)Code yazarken kirmizi alt cizgi seklinde alinan Exception'lar da vardir, bunlara "Compile Time Exception" denir.
     FileNotFoundException, IOException "Compile Time Exception" a ornektir.
     "Compile Time Exception" lara "Checked Exception" da denir.

    3)FileNotFoundException: Java'ya bir dosyayi bul dedigimizde, Java "dosyanin adresi" ve "dosyanin varligi" konusunda
                             hata olusursa ne yapmasi gerektigini soylememizi ister

    4)IOException: "IO" Input Output demektir.
                    Note: IOException, FileNotFoundException'in parent'idir.

    5)Java da hatalar temelde 2 ye ayrilir.
        i) Exception' lar   ii) Error'lar:  a)StackOverflow Error(Stack Memory'nin dolmasi halinde olusur)   b)Out Of Memory Error(Heap Memory'nin dolmasi halinde olusur)
                                            c)Virtual Machine Error( JVM (Java Sanal Makinesi) nin arizalanmasi halinde olusur)
 */

    public static void main(String[] args) throws IOException {

        //1.Way: Exception'i method signature satirina ekledik
        FileInputStream fis = new FileInputStream("src/main/java/javaders/day36exceptions/TextFile");
        //Yukaridaki kod Java'yi dosyaya ulastiriyor. Yani su adresteki dosyayi bul dedik
        //Parantez icerisine adresi yazdik. Bu bir Class'dir. Bu Class
        //Dosyaya sag tik yaptik Java'da. Copy Path Reference. Sonra oradan sectigimizi parantez icerisine yazdik
        //adresi girdikten sonra da CTE aliyorduk. Bunun icin try-Catch yapmamiz lazim. Dosyayi bulamadiginda ne yapmasi
        // gerektigini soylememiz gerek.
        //Kirmizinin ustune gelip more action'i secip add method signature secersek. Throw'u ekliyor.

        int i = 0;
        //read method'u bize Character'lerin Ascii degerlerini verecek

        while ((i = fis.read()) !=-1){
            //Butun Character'ler bittiginde bize -1 dondurecek. Bu yuzden !=1 dedik
            //read() method'unda da CET vardi. More Action'u sectik ve method signature'i sectik. O da bize
            // Parent Exception atadi
            System.out.print((char) i);
            /*read methodu gelecek ilk character olan "L" yi alir. Aslinda characteri degil Ascii degerini alir.
            L nin Ascii degeri 76 , while ici 76 aldi. 76 esit degil -1 diyoruz
            Ifade dogru oldugu icin 76 yi char'a cevirecek ve buyuk L olarak yazdiracak.Bu sekilde devam eder.
            Read methodu butun satirlar bittiginde -1 dondur. Ve sonuc olarak -1 esit degildir -1 diyecegi icin
            Loop kirilir.

 */
        }












    }//main
}//class
