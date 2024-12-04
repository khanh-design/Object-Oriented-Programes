package Access_Modifire.Static_Method;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDT";

    public Student(int r, String n) {
        rollno = r;
        name = n;
    }

    public static void change() {
        college = "CodeGym";
    }

    public void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");

        s1.display();
        s2.display();
        s3.display();
    }
}
