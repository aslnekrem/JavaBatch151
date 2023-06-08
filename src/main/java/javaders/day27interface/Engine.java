package javaders.day27interface;

/*
    1)"interface" icine "concrete method" konulamaz.
    2)"interface" icindeki method'larin abstract oldugunu Java bilir bu yuzden "interface" icindeki abstract methodlarda
        abstract keyword kullanmaya gerek yoktur.
    3)"interface" icindeki abstract method'larin tamami public'dir. Bu yuzden "interface" icinde abstract olustururken
        Access Modifier yazmaya gerek yoktur.
    4)Bir "interface"i bir class'in parent'i yapmak istedigimizde extend keyword yerine "implement" keyword kullaniniz
    5)"Concrete Child Class" lar "parent interface"deki abstract method'lari override etmek zorundadirlar.
    6)"interface" ler "to do list" lerdir. "interface" ler bir application'da "Concrete Child Class" larin yapmak
        zorunda olduklari fonksiyonlari barindirirlar. Bu yuzden "interface" lere "to-do list" de denir.
    7)Birden fazla "parent interface" icinde ayni isimli abstract methodlar olusturabilirsiniz. Abstract method'larin
        body'si olmadigi icin child class'lar ayni isimli method'lardan herhangi birini override ederek kullanabilirler
    8)Birden fazla "parent interface" icinde ayni ismli abstract methodlar olusturdugunuzda bu
        method'larin "return type"lari ayni olmak zorundadir.
    9)Normalde "interface" icine "concrete method" konulamaz ama bazi ozel durumlarda "concrete method" koymamiz
        gerekirse
            i) "default" keyword'unu asagidaki gibi kullanarak "interface" icine "concrete method" koyabiliriz.
                default void eco (){ System.out.println("Uses gas less..."); }
            ii)"static" keyword'unu asagidaki gibi kullanarak "interface" icine "concrete method" koyabiliriz.
                 static void stop (){ System.out.println("Stops securely..."); }
    10)"default" veya "static" keyword'unu kullanarak olusturdugunuz Concrete method'larin Concrete Child Class'lar
        tarafindan kullanilma zorunlulugu yoktur
    11)"default" keyword'unu kullanarak olusturgunuz "concrete method"lara "object" olusturarak
        ulasilabilir.
        "static" keyword'unu kullanarak olusturgunuz "concrete method"lara ulasmak icin "object"
        olusturmaya gerke yoktur, "interface" ismi yeterlidir.
    12)Interface'lerden object olusturulamaz. Cunku icindeki method'lar yarim method dur body'si olmadigi icin.
        Interface'lerin Constructor'i yoktur.
 */

public interface Engine {

    public void start();//public yazmaya gerek yok bu yuzden silik gosteriyor public yazisini

    void payment();

    default void eco (){
        System.out.println("Uses gas less...");
    }
    static void stop (){
        System.out.println("Stops securely...");
    }

    /*
    ?
        Interface'de method'un return type'ini mesela int yaptigimizda geriye deger dondurmesi lazim degil mi? Ya da return keyword'unu yazmamiz gerekli degil mi? Normal method larda kullaniyoruz
        ?
     */

}//interface
