package practices;

public class C01_BasamaklaraAyirma {
    public static void main(String[] args) {

        // 12345 sayısının rakamları toplamını bulunuz


        int x = 12345;

        int birler = x%10;     

        int onlar = (x/10)%10;   // 4

        int yuzler = (x/100)%10;   // 3

        int binler = (x/1000)%10;   // 2

        int onbinler = x/10000;     // 1


        System.out.println(birler + onlar + yuzler + binler + onbinler);

        //Kalani degil bolumu aliyor


    }

}
