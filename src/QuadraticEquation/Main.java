package QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap c: ");
        double c = sc.nextDouble();

        Quadratic_Equation qE = new Quadratic_Equation(a, b, c);
        double delta = qE.getDiscriminant();

        if (delta > 0) {
            System.out.println("Co 2 nghiem duy nhat: " + qE.getRoot1() + " and " + qE.getRoot2());
        } else if (delta == 0) {
            System.out.println("Co nghiem kep" + qE.getRoot1());
        } else {
            System.out.println("Khong co nghiem nao ca");
        }
    }
}
