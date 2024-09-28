import java.util.Scanner;

public class firstdegreeequation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a11: ");
        double a11 = sc.nextDouble();
        System.out.print("Enter a12: ");
        double a12 = sc.nextDouble();
        System.out.print("Enter b1: ");
        double b1 = sc.nextDouble();

        System.out.print("Enter a21: ");
        double a21 = sc.nextDouble();
        System.out.print("Enter a22: ");
        double a22 = sc.nextDouble();
        System.out.print("Enter b2: ");
        double b2 = sc.nextDouble();

        double determinant = a11 * a22 - a12 * a21;

        if (determinant != 0) {
            double x1 = (b1 * a22 - b2 * a12) / determinant;
            double x2 = (a11 * b2 - a21 * b1) / determinant;
            System.out.println("Ptrinh co nghiem duy nhat:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {

            if (a11 / a21 == a12 / a22 && a11 / a21 == b1 / b2) {

                System.out.println("Vo so nghiem.");
            } else {
                System.out.println("Vo nghiem.");
            }
        }
    }
}