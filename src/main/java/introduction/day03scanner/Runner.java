package introduction.day03scanner;

public class Runner {
    public static void main(String[] args) {

        //Object nasil olusturulur
        //Class name + Obcejt name + Atama Operatoru + "new" + Constructor
        Car                 mycar                =      new         Car();

        //new keyword'u sifirdan yeni bir obje olusturmak icin kullanilir.

        //Constructor Java'da nesneleri olusturmak icin kullanilan ozel bir methoddur

        System.out.println(mycar.fiyat); // Mesela burada arabanin fiyatini göreceksin
        /*DIKKAT!!! En Yukarida Obje kalibini yazdik. Simdi bu obje ismini yazip . koyunca
        mesela myCar. yazdigimizda o class icerisindeki method ve variable lari cagirir:
         */

        System.out.println("myCar.model = "+mycar.model); //Bu da yazdirma kodu
        mycar.dur(); // Method oldugu icin direkt bu sekilde cagiriyor
        mycar.hareket();

        //STudent ornegi

        Student tomHanks = new Student();
        // tomHanks.name.soutv      asagidaki kodu bu sekilde kisaca yazabilirsin
        System.out.println("tomHanks.name = " + tomHanks.name);
        System.out.println("tomHanks.grade = " + tomHanks.grade);
        System.out.println("tomHanks.adress = " + tomHanks.adress);
        tomHanks.feed();
        tomHanks.study();



    }
}
