
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String s = scanner.nextLine();

            if (s.equals("")) {
                break;
            }

            for (String string : s.split(" ")) {
                if (string.contains("av")) {
                    System.out.println(string);
                }
            }
        }

    }
}
