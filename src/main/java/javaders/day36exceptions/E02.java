package javaders.day36exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {
    public static void main(String[] args) {

        //2.Way
        try {
            FileInputStream fis = new FileInputStream("src/main/java/javaders/day36exceptions/TextFile");

            int i = 0;

            while ((i=fis.read())!=1){//read() Cet vardi. Yani mesela okuyamayacagim cince bir karakter varsa ne yapayim
                                        //diyor
                //istersek read()'de'de 4 tane more action var. Secerek bakabilirsin zor degiller
                //Emin degilsen ve aksi soylenmiyorsa asagidaki gibi yap ve e.printStackTrace(); ekle

                System.out.print((char) i);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Path is wrong or the file does not exist");
        } catch (IOException e) {
            System.out.println("Some characters could not be read");
        }
    }
}
