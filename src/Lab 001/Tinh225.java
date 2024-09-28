import javax.swing.*;

public class Tinh225 {
    public static void main(String[] args) {
        String Num1 = JOptionPane.showInputDialog("Enter number 1 : ");
        String Num2 = JOptionPane.showInputDialog("Enter number 2 : ");
        double num1 = Double.parseDouble(Num1);
        double num2 = Double.parseDouble(Num2);
        if(num2 == 0){
            System.out.println("So chia phai khac 0");
        }
        System.out.println("tong = " + (num1+num2));
        System.out.println("hieu = " + (num1-num2));
        System.out.println("tich = " + (num1*num2));
        System.out.println("thuong = " + (num1/num2));

    }
}