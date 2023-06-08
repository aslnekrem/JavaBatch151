package javaders.day24inheritancepolymorphism;


public class Car {
    /*
    1) Inheritance'da object olustururken constructor'lar yukaridan(Parent)
       asagiya(Child) dogru calisir.
    2)Parent ve Super es anlamlidir, Child ve Sub es anlamlidir.
    3)super() her constructor'in ilk satirinda gorunmez olarak bulunur.
      Isterseniz gorunur sekilde de yazabilirsiniz
    4)super() sizi Parent Class'daki constructor'a tasir
    //Ayni Class icinde seyahat etmek istersen this() kullanabilirsin, super ust class icin
    5)this() sizi ayni class icindeki constructor'lar arasinda gezdirir
    6)this icinde bulundugunuz class'daki variable'lari cagirmaya yarar.
      "super" parent class'daki variable'lari cagirmaya yarar.
    7)Eger Data Type'lar arasinda "IS-A ve "HAS-A" iliskisi varsa bu data type'larina "COVARIANT" denir
            //Animal-Mammal-Cat-Van Cat
            //Animal has a cat, mammal a van cat, cat has a van cat
            //Child dan parent a IS-A ilişkisi vardır.
            Cat is a animal, van cat is a mammal, mammal is a animal,
 */
    /*
    1)Polymorphism ==> Coklu sekil
      Yani bir Method'un farkli sekillerde karsimiza cikmasi demektir
      Polymorphism = Overloading(+) + Overriding(-)
    2)Overriding Parent Class'daki method'u Child Class'in ihtiyaclarina gore ozellestirerek kullanmak demektir.
    3)Overriding de method'un body'si degistirilir.
    4)Overriding'de method signature'a dokunulmaz. Dokunursaniz Java kizar.


     */

    /*
     * OOP'nin dort prensibi var.
     * 1) Inheritence.
     * 2) Polymorphismi
     *    i) OverLoading
     *    ii) Overriding
     */

    public String model = "Car";
    public int price = 0;

    public void move(){
    System.out.println("Cars move...");
    }//move

    public void getBreak(){
        System.out.println("Cars break...");
    }//break

    public void engine(){
        System.out.println("Cars have engine...");
    }//engine

    public Car() {
        System.out.println("Car constructor 1");
    }

    public Car(int i) {
        this();
        System.out.println("Car constructor 2");
    }

}//class
