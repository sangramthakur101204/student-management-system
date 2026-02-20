import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student>students = new ArrayList<>();
        int choice;

        while (true){
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.println("Enter Your choice..");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter Student Id");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.println("Enter Student Name");
                    String name = sc.nextLine();
                    System.out.println("Enter Student Marks");
                    double marks = sc.nextDouble();
                    Student student = new Student(id,name,marks);
                    students.add(student);
                    break;
                case 2:
                    for (Student s : students){
                        s.display();
                    }
                    break;

                case 3:
                    System.out.println("Exiting for the program...");
                    return;

                default:
                    System.out.println("Invalid choice...");
            }


        }














    }
}