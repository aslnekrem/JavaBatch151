package javaders.day30collections;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {

    /*
        Kendinizden kisaca bahseder misiniz?
        HashSet: "Elemanlari eklemek, aramak ve depolamak da asiri hizliyimdir. Tutmayin beni!"
        LinkedSet: "Bana verilen elemanlari verildigi gibi dizerim. Kafama estigi gibi siralamam. Siradaki?"
        TreeSet: "Verilen elemanlari buyukten kucuge, a'dan z'ye dizerim. Kusura bakma z kardes, son koltuk sana tahsisli"

        ****************************************************************************************

        1)Set'ler tekrarsiz eleman(unique) depolamak icin kullanilir.
        2)3 tane Set Class vardir;
            i)HashSet Class:
                "Hash" Benzersiz id olusturma teknigidir. Bu teknige "Hashing Technique" denir.
                "HashSet" elemanlari rastgele siralar
                "HashSet" elemanlari siralamadigindan cok hizli calisir
                "HashSet"ler "null"i eleman olarak kabul eder.
            ii)LinkedHashSet Class:
                "LinkedHashSet"ler elemanlari sizin verdiginiz siraya gore dizdiklerinden(insertion order)
                 "HashSet"elere gore yavastirlar
            iii)TreeSet Class:
                "TressSet"ler  elemanlari Natural Order'a gore dizerler.
                "TressSet"ler  elemanlari Natural Order'a gore dizdiklerinden cooooookkk yavastirlar. Bu yuzden ender
                kullanilirlar
                En yavas Set TreeSet'tir.
        3)TreeSet cok yavas oldugundan mumkun oldugu kadar TreeSet kullanmamaya calisiriz.



     */



    public static void main(String[] args) {


        HashSet <String> hs = new HashSet<>();

        hs.add("Ajda");
        hs.add("Cuneyt");
        hs.add("Esra");
        hs.add("Zeki");
        hs.add("Ezel");
        hs.add("Cuneyt");//Tekrarli eleman eklediginizde hata vermez ama tekrarli elemani sadece bir kere ekler
        hs.add(null);//null'i hep en basa koyar
        System.out.println(hs);

        System.out.println(hs.hashCode());//Java'nin urettigi Id'yi bize gosteriyor bu HashSet icin



        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(234);
        lhs.add(87);
        lhs.add(-32);
        lhs.add(124);
        lhs.add(null);

        System.out.println(lhs);//[234, 87, -32, 124]

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();

        ls.add(451);
        ls.add(87);
        ls.add(231);
        ls.add(124);

        System.out.println(ls);//[451, 87, 231, 124]

        lhs.retainAll(ls);
        System.out.println(lhs);//[87, 124]==> Ilk LinkHashSet'teki farkli elemanlar silindi
        System.out.println(ls);//[451, 87, 231, 124]


        TreeSet <Character> ts = new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        ts.add('R'); //Tekrar ettigi icin eklemedi
        //ts.add(null);TreeSet'lere null eklenemez
        System.out.println(ts);

        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.lower('R'));//Verilen eleman olan R'den bir onceki elemani cerir
        System.out.println(ts.lower('D'));//A //Lower hem sette olanlar icin hem de olmayanlar icin bize eleman
            // dondurur. Mesela D yok ama olsaydi siralamada A ile G arasinda olurdu. yani onceki eleman A olurdu.
            //Bu nedenle bize A dondurdu
        System.out.println(ts.lower('A'));
        System.out.println(ts.higher('K'));//Lower method'u, onceki idi. Higher sonraki

        System.out.println(ts.headSet('R'));//[A, G]
        //R'den oncekileri set olarak bana ver.
        System.out.println(ts.headSet('R',true));//[A, G, R]
        //Istersek bu sekilde dahil et de diyebiliriz

        System.out.println(ts.tailSet('R'));//[R, U, Z]
        //R dahil, R ve sonrakileri bize getirir.
        System.out.println(ts.tailSet('R',false));//[U, Z]
        //Istersek bu sekilde dahil etme de diyebiliriz

        System.out.println(ts.ceiling('R'));//R ==> Eleman Set'in icinde varsa elemanin kendisi return eder. Eleman
        System.out.println(ts.ceiling('K'));//R ==> Set'in icinde yoksa sonraki eleman return eder.

        System.out.println(ts.floor('G'));//G ==> Eleman set'in icinde varsa eleman'in kendisi return eder.
        System.out.println('J');//G ==> Eleman set'in icinde yoksa onceki eleman'i  return eder.

        System.out.println(ts.subSet('G','U'));//[G, R]
        //Substring gibi ilk eleman dahil ikinci eleman dahil degil
        System.out.println(ts.subSet('G',false,'Z',true));//[R, U, Z]
        //Boylelikle G dahil degil Z dahil yapabiliyoruz




    }
}//class
