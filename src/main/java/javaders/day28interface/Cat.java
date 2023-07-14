package javaders.day28interface;

public class Cat implements Mammal{
    @Override
    public void eat() {


    }

    @Override
    public void drink() {

    }

    public static void main(String[] args) {
        System.out.println(Animal.age);//4
        System.out.println(Mammal.feedBaby);//Milk
        System.out.println(Mammal.age);//6
        System.out.println(age);//6 //Ilk once en yakin olana bakar ilk buldugunu yazar.
        //Ama readable icin kesinlikle interface ismini yazip cagir variable'lari. Interface adini belirtmeden
        // kesinlikle cagirma

    }//main
}
