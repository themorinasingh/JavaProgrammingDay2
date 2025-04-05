import java.util.Scanner;

public class myClass {
    public static void main( String args[]) {
        String name;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        name = myScanner.nextLine();
        System.out.print("Welcome to the world : ");
        System.out.println(name);
    }
}