
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number:");
        int numberOne = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a number:");
        int numberTwo = Integer.valueOf(scan.nextLine());

        if (numberOne > numberTwo) {
            System.out.println("The greater number is: " + numberOne);
        } else if (numberOne < numberTwo) {
            System.out.println("The greater number is: " + numberTwo);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
