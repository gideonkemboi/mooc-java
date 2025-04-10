
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double average = 0;
        int sum = 0;
        int numbersInputted = 0;

        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                System.out.println("Average of the numbers: " + average);
                break;
            } else {
                sum = sum + num;
                numbersInputted = numbersInputted + 1;
                average = (double) sum / numbersInputted;
                continue;
            }
        }
    }
}
