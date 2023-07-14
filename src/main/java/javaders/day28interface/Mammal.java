package javaders.day28interface;

/*
    1)Class --> Class : extends
      interface --> interface : extend
      Class --> interface : implement
      interface --> Class : Olamaz!
      Ayni ise extend farkli ise implement kullan. Interface'i Class'in Child'i yapma

      abstract method'lar Concrete Class'lar tarafindan Override edilmek zorunda
      Interface-interface veya abstract class, override etmek zorunda degil

    abstract class ile interface arasindaki farklar nelerdir?
    *1)Abstract Class'lar hem "abstract" hem de "concrete" method'lar icerebilir fakat interface'ler sadece "abstract"
        method icerir. Ama interface'lerde istersek default ve static keyword'lerini kullanarak "concrete method"
        uretebiliriz
    *2)Abstract Class'lar multiple inheritance'i desteklemez ama interface'ler destekler
    *3)Abstract Class'lar icinde her turlu variable olusturulabilir, interface'ler icindeki variable'lara public, static
        ve final olmak zorundadir.
    4)"interface" Class'in Child'i olamaz ama "abstract class" class'in child'i olabilir.
    5)abstract class'larda constructor vardir ama object uretemez, interface'lerde constructor yoktur bu yuzdenobject
        uretilemez

 */

public  interface Mammal extends Animal {
    String feedBaby = "Milk";
    int age = 6;

}

