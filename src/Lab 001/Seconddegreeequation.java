import java.util.Scanner;

public class Seconddegreeequation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();


        if (a == 0) {
            if (b != 0) {
                double x = -c / b;
                System.out.println("This is a linear equation.");
                System.out.println("The solution is: x = " + x);
            } else {
                if (c == 0) {
                    System.out.println("This equation has infinitely many solutions.");
                } else {
                    System.out.println("This equation has no solution.");
                }
            }
        } else {
            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {

                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("The equation has two distinct real roots:");
                System.out.println("Root 1: x = " + root1);
                System.out.println("Root 2: x = " + root2);
            } else if (discriminant == 0) {

                double root = -b / (2 * a);
                System.out.println("The equation has one double root:");
                System.out.println("x = " + root);
            } else {
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                System.out.println("The equation has no real roots. It has complex roots:");
                System.out.println("Root 1: x = " + realPart + " + " + imaginaryPart + "i");
                System.out.println("Root 2: x = " + realPart + " - " + imaginaryPart + "i");
            }
        }


    }
}