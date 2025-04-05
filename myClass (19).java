import java.util.Scanner;

public class myClass {
    public static void main(String args[]) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        double shapeValue = myScanner.nextDouble();
        //displaying as double 
        System.out.println("ShapeValue (double) : " + shapeValue);
        //displaying as int
        int shapeValueInt = (int) shapeValue;
        System.out.println("ShapeValue (int) : " + shapeValueInt);
        //displaying as int
        long shapeValueLong = (long) shapeValueInt;
        System.out.println("ShapeValue (long) : " + shapeValueLong);
        //displaying a float
        float shapeValueFloat = (float) shapeValueLong;
        System.out.println("ShapeValue (float) :" + shapeValueFloat);
        byte shapeValueByte = (byte) shapeValue;
        System.out.print("Shape Value Byte: " + shapeValueByte);
    }
}