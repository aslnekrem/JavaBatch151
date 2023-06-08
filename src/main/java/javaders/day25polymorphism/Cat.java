package javaders.day25polymorphism;

public class Cat extends Animal {
    @Override
    public void move() {

        System.out.println("Cats move...");
    }//move

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public Animal create() {//is-a , iliskisi varsa Return type 'i degistirebilirsin

        return new Cat();
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return 2*a*b;
    }

    /*
    //is-a , iliskisi varsa Return type 'i degistirebilirsin
    public Cat create() {//is-a , iliskisi varsa Return type 'i degistirebilirsin

        return new Cat();
    }
     */





}//class
