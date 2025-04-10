
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;
        String oldestName = "";

        while (true) {
            String s = scanner.nextLine();

            if (s.equals("")) {
                break;
            }

            String[] stringArray = s.split(",");

            if (Integer.valueOf(stringArray[1]) > oldestAge) {
                oldestName = stringArray[0];
                oldestAge = Integer.valueOf(stringArray[1]);
            }
        }

        System.out.println(oldestName);
    }
}
