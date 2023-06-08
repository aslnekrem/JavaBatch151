package javaders.day24inheritancepolymorphism;

public class Honda extends Car{

    public String model = "Civic";
    public int price = 20000;

    public void eco(){
        System.out.println("Honda engines are so economic");
    }//eco

    public Honda(){
        System.out.println(this.model);
        System.out.println(super.model);
    }




}//class
