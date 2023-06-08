package javaders.day24inheritancepolymorphism;

public class CarRunner {
    public static void main(String[] args) {

        Toyota t1 = new Toyota();
        //Yukarida obje olusturduktan sonra Toyota constructor calisti. Car'in child class'i oldugu icin
        // Car constructor da calisti
        //t1.model="Prius";
        //System.out.println(t1.model);
        Honda h1 = new Honda();

        Volvo v1 = new Volvo();
        v1.move(); //Volvo'nun icindeki method'u kullanir. Override method varsa onu kullanir.







    }//main
}//class
