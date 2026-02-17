import java.util.Scanner;
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

        student.display();


//        Student[] students = new Student[3];
//        students[0] = new Student(2,"om",88);
//        students[1] = new Student(3,"chhavi",90);
//        students[2] = new Student(4,"gargi",69);
//
//        for (int i =0;i<students.length;i++){
//           students[i].display(); }

    }
}