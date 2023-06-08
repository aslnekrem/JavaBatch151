package javaders.day25polymorphism;

public class Animal {
    /*
        1)Parent'taki method ile Child'da Override edilen method'un access modifier'lari ayni olabilir
        2)Child'da Override edilen method'un access modifier'i Parent'daki method'un access modifier'indan dar olamaz
        3)Parent'daki method'un access modifier'i Child'da Ovirride edilen method'un access modifier'indan dar olabilir
            //Override'da Access Modifier degistirme: Baba, cocuk: Cocuk babaya dunyayi gezemezsin diyemez
              Ama tam tersi olabilir
        4)Method'un return type'i primitive ise Overriding yapildiginda return type degistirilmemelidir.
        5)Method'un return type'i void ise Overriding yapildiginda return type degistirilemez

        6)Child'da Override edilen method'un "return type"i ile Parent'taki method'un "return type"i arasinda IS-A iliskisi
          varsa "return type"degisitirilebilir, aksi takdirda degistirilemez.
          Mesela Integer Wrapper Class ile Long Wrapper Class arasinda is-a iliskisi yoktur o yuzden return type Integer
          oldugunda Long'a degistirilemez. Degistirirsen hata verir.
        7)Return Type Wrapper Class oldugunda, Overriding yaparken "return type" degistirilemez.
        8)"final method"lar Override edilemez. (Final(son), benim verecegim final price is ... gibi)
          "final method"larin body'si degistirilemez ama Override ederken method body'i degistiririz bu bir celiskidir.
          Bu yuzden Java "final method"larin Override edilmesine musaade etmez.
        9)"static method"lar Override edilemezler. Cunku "static method"lar tum child'lar icin ortak method'lardir
          Bir child'in ortak method'u degistirdiginde diger Child'lar bundan etkilenir. Bu etkilenme ummadik sonuclar ortaya cikarabilir.
          Bu yuzden Java "static method"larin Override edilmesine musaade etmez.


     */
    public void move(){
        System.out.println("Animals move...");
    }

    public  int add (int a, int b){
        return a+b;
    }

    public Animal create(){
        //DIKKAT!!!
        //Buradaki Animal Access Modifier oldu, method icerisinde'de Animal olusturmaliyiz ki onu return edemilsin.
        //Asagidaki gibi de Animal obje olusturduk. Yeni bir Animal objesi return ediyor
        return new Animal();
    }

    public Integer multiply(Integer a, Integer b){
        return a*b;
    }

    public final double circleArea(double r){
        return 3.14*r*r;
    }

}//class
