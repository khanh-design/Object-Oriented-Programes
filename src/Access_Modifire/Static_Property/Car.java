package Access_Modifire.Static_Property;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda 6", "skyactiv 6");
        System.out.println(Car.numberOfCars);
    }
}
