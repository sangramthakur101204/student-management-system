public class Student {

    int id;
    String name;
    double marks;

    public Student(int id,String name,double marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    void display(){
        System.out.println("ID :" + id);
        System.out.println("NAME :" + name);
        System.out.println("MARKS :" + marks);
    }

}
