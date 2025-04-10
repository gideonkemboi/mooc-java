
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int third = Integer.valueOf(scanner.nextLine());

        System.out.println("The average is " + average((double) first, (double) second, (double) third));
    }
    
    public static double average(double x, double y, double z) {
        return (x + y + z) / 3;                
    }
}
