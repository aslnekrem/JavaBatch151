package javaders.day29collections;

import java.util.LinkedList;

public class LinkedList01 {
    
    public static void main(String[] args) {
        
        
        
    /*
        ArrayList'ler eleman silme ve ekleme'de tekrar index'leme yapmak zorunda olduklarindan, eleman ekleme ve silmede
            basarisizdirlar
        LinkedList'ler index kullanmazlar, bu yuzden node ekleme ve silme islemlerinde tekrar indexleme yapilmaz.
        LinkedList lerde node ekleme ve silme islemleri yaparken sadece pointer lari degistirir.
        1)LinkedList'ler node silme ve ekleme'de cok basrili oldugu icin, silme ve ekleme islemlerini coklukla yapacaginiz
            zaman Linkedlist kullaniriz
        2)ArrayList'ler index'leri adres gibi kullanir bu yuzden ArrayList'ler search islemlerinde cok basarilidirlar.
        Note: ihtiyaciniz olan Collections cogunlukla silme ve ekleme islemleri yapacaksa(muze ziyaretcileri gibi)
            LinkedList, search islemleri yapacaksa(Amerika eyaletleri gibi) ArrayList kullaniniz


     */

        LinkedList<String> s = new LinkedList<>();
        s.add("Esra");
        s.add("Steve");
        s.add("Ajda");
        s.add("Muge");
        s.add("Cuneyt");
        s.add("Esra");
        s.add(2,"Esen");
        s.addFirst("Kemal");
        s.addLast("Ajdar");
        System.out.println(s);//[Kemal, Steve, Ajda, Esen, Muge, Cuneyt, Esra, Ajdar]

        //s.remove(2);//Ajda
        System.out.println(s);//[Kemal, Steve, Esen, Muge, Cuneyt, Esra, Ajdar]

        // s.remove("Ajdar");
        System.out.println(s);//[Kemal, Steve, Esen, Muge, Cuneyt, Esra]

        //s.remove();
        System.out.println(s);//[Steve, Esen, Muge, Cuneyt, Esra]

        //s.removeFirstOccurrence("Esra");
        System.out.println(s);//[Esen, Ajda, Muge, Cuneyt, Esra]

        //s.removeLastOccurrence("Esra");
        System.out.println(s);//Kemal, Esra, Steve, Esen, Ajda, Muge, Cuneyt, Ajdar]

        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns: the head of this list, or null if this list is empty
        */

        String r1 = s.peek();//Ilk node silmeden size verir. (copy+paste)
        System.out.println("r1 = " + r1);//Kemal
        System.out.println(s);//[Kemal, Esra, Steve, Esen, Ajda, Muge, Cuneyt, Esra, Ajdar]

        /*
        Retrieves and removes the head (first element) of this list.
        Returns: the head of this list, or null if this list is empty
         */

        String r2 = s.poll();//Ilk node size verir ve List'den siler (Cut+paste)
        System.out.println("r2 = " + r2);//r2 = Kemal
        System.out.println(s);//[Esra, Steve, Esen, Ajda, Muge, Cuneyt, Esra, Ajdar]

        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns: the head of this list
        Throws: NoSuchElementException – if this list is empty
        Note: peek(); ile element(); ikisi de ilk elemani silmeden size verir
              Ama peek(); list bos oldugunda size null verir, element() ise Exception verir.
         */

        String r3 = s.element();//Ilk elemani silmeden size verir(copy+paste)
        System.out.println("r3 = " + r3);//Esra
        System.out.println(s);//Esra


        /*
        Removes and returns the first element of this list.
        Throws: NoSuchElementException – if this list is empty
        Note: poll(); ile pop(); ikisi de ilk elemani siler ve size verir
              Ama poll(); list bos oldugunda size null verir, pop() ise Exception verir.
         */

        s.pop();





    }
}
