import java.util.Scanner;

public class myClass {
    public static void main(String args[]) {
        Scanner myScanna = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = myScanna.nextInt();
        System.out.println("Enter y: ");
        int y = myScanna.nextInt();
        System.out.print("Sum = " + (x + y) + " and product equals = " + (x*y));
    }
}