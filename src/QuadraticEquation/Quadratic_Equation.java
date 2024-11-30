package QuadraticEquation;

public class Quadratic_Equation {
    double a;
    double b;
    double c;


    public Quadratic_Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

   public double getA() {
        return a;
   }
   public double getB() {
        return b;
   }
   public double getC() {
        return c;
   }


   double getDiscriminant() {
        return Math.pow(a, 2) - 4 * a * c;
   }

   double getRoot1() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b + Math.pow(delta, 0.5)) / (2 * a);
        } else {
            return 0;
        }
   }

   double getRoot2() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b - Math.pow(delta, 0.5)) / (2 * a);
        } else {
            return 0;
        }
   }


}
