
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double average = 0;
        int sum = 0;
        int positiveNumbersInputted = 0;

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                if (positiveNumbersInputted <= 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                }
                System.out.println(average);
                break;
            } else {
                if (num > 0) {
                    sum = sum + num;
                    positiveNumbersInputted = positiveNumbersInputted + 1;
                    average = (double) sum / positiveNumbersInputted;
                }

                continue;
            }
        }
    }
}
