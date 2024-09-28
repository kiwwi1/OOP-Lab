import java.util.Scanner;

public class firstdegreeequation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if(a == 0 && b == 0 ){
            System.out.println("Ptrinh vo so nghiem");
        }
        else{
        if(a == 0 && b != 0)System.out.println("Ptrinh vo nghiem");
        else System.out.println("x ="+ -b/a);}



    }
}
