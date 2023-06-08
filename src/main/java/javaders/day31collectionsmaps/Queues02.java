package javaders.day31collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02 {
    public static void main(String[] args) {

        Queue<String > line = new PriorityQueue<>();//PriorityQueue<>(); //Önceliğe göre sıralama.

        line.add("Milk");
        line.add("Meat");
        line.add("Egg");
        line.add("Orange");
        line.add("Tomatoes");
        System.out.println(line);

        Deque<String> d = new LinkedList<>();   //Deque iki uclu que. //Deque ==>  Double ended Queue ==> iki uclu

        d.add("Milk");
        d.add("Meat");
        d.add("Egg");
        d.add("Orange");
        d.add("Tomatoes");

        //Deque'daki add(), get(), peek(), poll() remove() methodlari first-last seklinde iki uclu olarak bulunur









    }//main
}//class
