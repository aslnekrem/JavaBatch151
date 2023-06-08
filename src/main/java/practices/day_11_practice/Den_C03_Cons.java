package practices.day_11_practice;

public class Den_C03_Cons {
    public static void main(String[] args) {


        C03_Constructor obj1 = new C03_Constructor();

        obj1.marka = "mercedes";
        obj1.model = "C180";
        obj1.yil = 2023;
        obj1.yakit = "Benzin";

        System.out.println(obj1.marka);
        System.out.println(obj1.model);
        System.out.println(obj1.yakit);
        System.out.println(obj1.yil);


    }
}