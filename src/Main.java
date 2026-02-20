import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Id");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student Name");
        String name = sc.nextLine();
        System.out.println("Enter Student Marks");
        double marks = sc.nextDouble();
        Student student = new Student(id,name,marks);

        ArrayList<Student>students = new ArrayList<>();
        students.add(student);

       for (Student s : students){
          s.display();
       }




    }
}