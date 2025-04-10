
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int sumOfYOB = 0;
        int count = 0;

        while (true) {
            String s = scanner.nextLine();

            if (s.equals("")) {
                break;
            }

            String[] stringArray = s.split(",");

            if (stringArray[0].length() > longestName.length()) {
                longestName = stringArray[0];
            }
            
            sumOfYOB += Integer.valueOf(stringArray[1]);
            count++;
        }
        
        System.out.println("Longest name: " + longestName);

        if (count > 0) {
            System.out.println("Average of the birth years: " + (1.0 * sumOfYOB / count));
        } else {
            System.out.println("No input.");
        }
    }
}
