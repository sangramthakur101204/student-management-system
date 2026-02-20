public class Student {

    private int id;
    private String name;
    private double marks;

    public void setId(int id){
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public Student(int id, String name, double marks){
        setId(id);
        this.name=name;
        this.marks=marks;
    }

    void display(){
        System.out.println("ID :" + id);
        System.out.println("NAME :" + name);
        System.out.println("MARKS :" + marks);
    }

}
