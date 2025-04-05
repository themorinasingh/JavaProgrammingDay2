import java.util.Scanner;

public class myClass {
    public static void main(String args[]) {
        Scanner myScanner = new Scanner(System.in);
        //calculating volume of a sphere
        double pi = 3.14;
        System.out.println("Please enter Radius of the sphere below: ");
        double r =  myScanner.nextDouble();
        System.out.println("Volume = ");
        System.out.print(pi * r * r * r * (4.0 / 3.0));
    }
}