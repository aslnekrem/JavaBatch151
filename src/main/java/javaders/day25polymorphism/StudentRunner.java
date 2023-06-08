package javaders.day25polymorphism;

public class StudentRunner {
    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println(s1.getStdId());
        System.out.println(s1.getGpa());
        System.out.println(s1.isSuccessful());
        s1.setGpa(3.99);
        System.out.println(s1.getGpa());
        s1.setSuccessful(true);
        System.out.println(s1.isSuccessful());


    }//main
}//class
