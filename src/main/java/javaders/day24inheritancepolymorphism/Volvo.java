package javaders.day24inheritancepolymorphism;

public class Volvo extends Car{

    public void secure(){
        System.out.println("Volvo is the most secure car in the world...");
    }//secure

    @Override //Bu bir "annotation" dir. @Override annotation'i Override kurallarini kontrol eder.
    public void move() {
        System.out.println("Volvo moves");
    }


}//class
