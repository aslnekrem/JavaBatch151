package advanced_practice.day05;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SelectStudentLambda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ogrenci sayisini giriniz");
        int numStd = input.nextInt();

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < numStd; i++) {
            System.out.println("isim: ");//enes
            String name = input.next();
            System.out.println("cinsiyet: ");//e
            String gender = input.next().toUpperCase().trim().substring(0, 1);

            System.out.println("boy: ");//1.80
            double height = input.nextDouble();
            System.out.println("kilo: ");//80
            double weight = input.nextDouble();

            Student student = new Student(name, gender, height, weight);
            students.add(student);
        }//for i
        long time1 = System.nanoTime();
        List<Student> selectedStudent = Stream.concat(students. //burada concat method'u bize iki listeyi birlestirdi, tek bir list yapti.
                                stream().
                                filter(t -> t.getGender().equals("K") && t.getHeight() > 1.50 && t.getWeight() > 50 && t.getWeight() < 70),
                        students.
                                stream().
                                filter(t -> t.getGender().equals("E") && t.getHeight() > 1.60 && t.getWeight() > 70 && t.getWeight() < 90)).
                collect(Collectors.toList());

        if (selectedStudent.isEmpty()) {
            System.out.println("Malesef kurs gereksinimlerini karşılayan öğrenci bulunamadı.");
        } else {
            System.out.println(" =================== Kursa Secilen Ogrenciler =================");
            selectedStudent.forEach(t -> System.out.println("isim : " + t.getName() +
                    " cinsiyet : " + t.getGender() +
                    " boy: " + t.getHeight() +
                    " kilo :" + t.getWeight()));
        }
        long time2 = System.nanoTime();
        long functionalProgramming = time2 - time1;
        System.out.println("functionalProgramming" + " = " + functionalProgramming / 1000 + " nano saniye");// 35146

    }//main
}
