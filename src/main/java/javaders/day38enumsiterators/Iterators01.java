package javaders.day38enumsiterators;

import java.util.*;

public class Iterators01 {

    /*
        1)Iterator'lar loop'larin yaptigi ayni isi yapar.
        2)Iterator'larda sonsuz loop olusma ihtimali yoktur.
        3)Iterator'lar ile loop'lar arasinda performans farki yoktur.
        4)Iterator'lar bir collection'dan eleman silme ve bir collection'daki elemani degistirme konusunda daha basarilidir.
        5)Iki tip iterator var; i)Iterator: Bu sadece eleman silmede kullanilir,
                                            eleman eklemek veya elemani degistirmek mumkun degildir.
                                            Note:"Iterator" sadece soldan saga(ilk elemandan son elemana) calisir.
                                ii)ListIterator: Bu eleman silebilir, ekleyebilir ve degistirebilir.
                                            "ListIterator" ise iki yonlu calisabilir.
     */

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);// [ Tom,   Jim,   Clara,   Angie,   Mark ]

        //"Iterator" kullanalim
        Iterator<String> myItr = myList.iterator();    // [ Tom,   Jim,   Clara,   Angie,   Mark ]
        //myList.iterator(); List'i iterator'a donusturduk sonra, Iterator<String>  conteyner'inin icine attik

        //Iterator'larla ve ListIteraotr'larla birlikte genelde while loop kullanilir

        while(myItr.hasNext()){//hasNext() pointer'a "Senden sonra eleman var mi?" diye sorar.
            //Eleman varsa "true" yoksa "false" return eder.
            myItr.next();//next() pointer'i bir sonraki elemanin onune tasir ve ustunden atladigi elemani return eder.
            myItr.remove();//next() methodunun return ettigi elemani siler. Iterator'dan sildigi anda list'Den de siliyor
                                //asList gibi. Reference verdigi icin
        }
        System.out.println(myList);// [ ]

        //ListIterator kullanalim
        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        System.out.println(yourList);// [ Tom,   Jim,   Clara ]

        ListIterator<String> yourListItr = yourList.listIterator();

        while (yourListItr.hasNext()){
            String el = yourListItr.next();
            yourListItr.set(el + "!");//set() methodu list'i update etmeye yarar.
        }
        System.out.println(yourList);// [ Tom!,   Jim!,   Clara! ]

        //hasPrevious() ve previous() nasil kullanilir?
        while(yourListItr.hasPrevious()){

            String el = yourListItr.previous();
            System.out.println(el);
            yourListItr.set("?" + el);

        }
        System.out.println(yourList);// [ ?Tom!,   ?Jim!,   ?Clara! ]

        //En sondan en basa nasil iterate edebiliriz?
        LinkedList<String> ourList = new LinkedList<>();
        ourList.add("Tom");
        ourList.add("Jim");
        ourList.add("Clara");
        ourList.add("Angie");
        ourList.add("Mark");
        System.out.println(ourList);

        Iterator<String> ourListItr = ourList.descendingIterator();// descendingIterator() ancak LinkedList ile kulanilabilir.

        while(ourListItr.hasNext()){
            String el = ourListItr.next();
            System.out.println(el);
        }

    }
}
