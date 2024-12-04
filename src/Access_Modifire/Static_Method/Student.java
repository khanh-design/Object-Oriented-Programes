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


}
