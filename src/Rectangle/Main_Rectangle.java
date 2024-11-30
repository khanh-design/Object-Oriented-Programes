package Rectangle;

import java.util.Scanner;

public class Main_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu rong: ");
        double width = sc.nextDouble();
        System.out.println("Nhap chieu cao: ");
        double height = sc.nextDouble();

        ChuNhat cn = new ChuNhat(width, height);
        System.out.println("Hinh chu nhat \n" + cn.display());
        System.out.println("Chu vi chu nhat: " + cn.getPerimeter());
        System.out.println("Dien tich chu nhat: " + cn.getArea());

    }
}
