package practices;

public class C03_Ascii {

    public static void main(String[] args) {
        /* ASCİİ

          B ==> 66           C ==> 67
          D ==> 68           E ==> 69
          L ==> 76           M ==> 77

            Hepsini bir arttirirsak ismin icindeki harfleri buluruz
        */

        char firsCh = 'B'+1; //C
        char secondCh = 'D'+1; //E
        char thirdCh = 'L'+1; //M

        System.out.println(""+firsCh+secondCh+thirdCh);

        //Asagidaki sekilde de yazdirabilirsin

        char f = 67;
        char s = 69;
        char t = 77;
        System.out.println(""+f+s+t);





    }
}
