package javaders.day31collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {

        //Fifo, first in first out. Ilk giren ilk cikar. Askerlikteki ikmal gibi
        Queue<String> wareHouse = new LinkedList<>();//LinkedList bizim girdigimiz siraya gore diziyordu

        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Egg");
        wareHouse.add("Cheese");
        System.out.println(wareHouse);//[Milk, Meat, Bread, Egg, Cheese]

        wareHouse.remove();
        System.out.println(wareHouse);//[Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.peek());//Meat
        System.out.println(wareHouse);//[Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.element());//Meat
        System.out.println(wareHouse);//[Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.poll());//Meat
        System.out.println(wareHouse);//[Bread, Egg, Cheese]

        wareHouse.clear();

        System.out.println(wareHouse.poll());//null
        System.out.println(wareHouse.remove());//NoSuchElementException




    }
}
