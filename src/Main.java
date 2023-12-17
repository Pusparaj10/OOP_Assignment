// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import Models.Student;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        System.out.println(student1);

        Student student2 = new Student();
        System.out.println(student2);

        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getMarks());

        System.out.println(student2.getNames());
        System.out.println(student2.getAges());
        System.out.println(student2.getMark());

    }
}