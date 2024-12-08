package Inheritance.camparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableCricle[] cricle = new ComparableCricle[3];
        cricle[0] = new ComparableCricle(3.6);
        cricle[1] = new ComparableCricle();
        cricle[2] = new ComparableCricle(3.5, "indigo", false);

        System.out.println("Pre-sorted: ");
        for (ComparableCricle circle : cricle) {
            System.out.println(circle);
        }

        Arrays.sort(cricle);

        System.out.println("After-sorted:");
        for (ComparableCricle circle : cricle) {
            System.out.println(circle);
        }
    }
}
