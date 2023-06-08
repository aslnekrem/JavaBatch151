package javaders.day22stringbuilder;

public class Student {


    //stdName public oldugu icin diger Class'lardan ulasilabilir.
    public String stdName = "Ali Can";

    //Access Modifier'i "default" olan ile "public" olan class member'lar ayni package icinde kullanildiklarinda ayni
    // ozellikleri gosterirler.
    //Fakat farkli package'a gectiginizde public olanlara ulasilabilir, default olanlara ulasilamaz

    int age = 23;

    //Access Modifier'i private olan Class Member'lar sadece olusturulduklari Class icinden gorulebilirler
    //Olusturulduklari Class'in disina ciktiginizda gorunmez ulasilmaz olurlar
    private String healthCondition = "Cancer";

    //Access Modifier'i "protected" olan Class Member'lar ayni package icindeyken public gibi davranirlar
    //Farkli package'ye gectiginizde protected olanlar sadece Child Class'lardan gorulebilir
    protected int salary = 3000;
    //NOTE :Class'a private yazamayiz Java hata verir. Cunku Class'lar kaliptir. Kalip private olursa ona kimse ulasamaz
    //Class'lar protected ve private olamaz









}//class
