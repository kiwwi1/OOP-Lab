import java.util.Arrays;
import java.util.Scanner;

public class Array65 {
    public static void main(String[] args) {
        int [] a = {1789,2035,1899,1456,2013};
        int sum = 0;
        for(int i=0; i<a.length; i++){
            sum+=a[i];
        }
        int avg = sum/a.length;
        Arrays.sort(a);
        System.out.println("Trung binh = " + avg);
        System.out.println("Tong = " + sum);
        System.out.println("Sau khi sap xep: "+ Arrays.toString(a));

    }
}