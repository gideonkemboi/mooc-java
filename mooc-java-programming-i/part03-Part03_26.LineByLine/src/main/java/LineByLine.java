
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();

            if (s.equals("")) {
                break;
            }

            for (String string : s.split(" ")) {
                System.out.println(string);
            }
        }
    }
}
