
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int negativeNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                System.out.println("Number of negative numbers: " + negativeNumbers);
                break;
            } else {
                if (num < 0) {
                    negativeNumbers = negativeNumbers + 1;
                }
               
                continue;
            }
        }
    }
}
