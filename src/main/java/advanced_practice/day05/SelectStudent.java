package advanced_practice.day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectStudent {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ogrenci sayisini giriniz");
        int numStd = input.nextInt();

        List<Student> students = new ArrayList<>();

        for (int i = 0; i <numStd ; i++) {
            System.out.println("isim: ");//enes
            String name=input.next();
            System.out.println("cinsiyet: ");//e
            String gender =input.next().toUpperCase().trim().substring(0,1);

            System.out.println("boy: ");//1.80
            double height =input.nextDouble();
            System.out.println("kilo: ");//80
            double weight =input.nextDouble();

            Student student = new Student(name,gender,height,weight);
            students.add(student);
        }//for i

        List<Student> selectedStudents = new ArrayList<>();
        long time1 = System.nanoTime();
        for (Student student :students ) {
            if (student.getGender().equals("K") && student.getHeight() > 1.50 && student.getWeight() > 50 && student.getWeight() < 70) {
                selectedStudents.add(student);
            } else if (student.getGender().equals("E") && student.getHeight() > 1.60 && student.getWeight() > 70 && student.getWeight() < 90) {
                selectedStudents.add(student);
            }
        }//for each

        System.out.println(" =================== Kursa Secilen Ogrenciler =================");

        if(selectedStudents.size() == 0){
            System.out.println( "Malesef kurs gereksinimlerini karşılayan öğrenci bulunamadı.");
        }else{
            for (Student student :selectedStudents
            ) {
                System.out.println(student.toString());
            }
        }

        long time2 = System.nanoTime();
        long structuredProgramming = time2-time1;
        System.out.println("functionalProgramming"+ " = " + structuredProgramming /1000+ " nano saniye");//39532

    }//main
}//class
