import java.util.Scanner;

public class InputFromKeyboard62 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = keyboard.nextLine();
        System.out.println("How old are you");
        int iAge = keyboard.nextInt();
        System.out.println("How tall are you");
        double dHeight = keyboard.nextDouble();
        System.out.println("Mrs/Ms. " + name+", " + iAge + "years old." + "Your height is "+ dHeight + ".");
    }
}
