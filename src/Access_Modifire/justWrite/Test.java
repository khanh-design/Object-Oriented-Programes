package Access_Modifire.justWrite;

public class Test {
    private String name = "John";
    private String classes = "C02";

    public Test() {}

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }
    public String getClasses() {
        return classes;
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.setName("Khanh");
        t.setClasses("C03");
        System.out.println("Ten la " + t.getName() + " and lop = " + t.getClasses());
    }
}
