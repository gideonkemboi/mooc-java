
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        //Give the first number:
        //8
        //Give the second number:
        //2
        //8 + 2 = 10
        //8 - 2 = 6
        //8 * 2 = 16
        //8 / 2 = 4.0
        
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        System.out.println(first + " + " + second + " = " + add(first, second));
        System.out.println(first + " - " + second + " = " + subtract(first, second));
        System.out.println(first + " * " + second + " = " + multiply(first, second));
        System.out.println(first + " / " + second + " = " + divide((double) first, (double) second) );
    }
    
    public static int add(int x, int y) {
        return x + y;
    }
    
    public static int subtract(int x, int y) {
        return x-y;
    }
    
    public static int multiply(int x, int y) {
        return x*y;
    }
    
    public static double divide(double x, double y) {
        return x/y;
    }
}
