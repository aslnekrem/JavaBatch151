package introduction.day03scanner;

public class Runner {
    public static void main(String[] args) {

        
        Car                 mycar                =      new         Car();

       

        System.out.println(mycar.fiyat); // Mesela burada arabanin fiyatini göreceksin
        

        System.out.println("myCar.model = "+mycar.model); //Bu da yazdirma kodu
        mycar.dur(); // Method oldugu icin direkt bu sekilde cagiriyor
        mycar.hareket();

       

        Student tomHanks = new Student();
       
        System.out.println("tomHanks.name = " + tomHanks.name);
        System.out.println("tomHanks.grade = " + tomHanks.grade);
        System.out.println("tomHanks.adress = " + tomHanks.adress);
        tomHanks.feed();
        tomHanks.study();



    }
}
