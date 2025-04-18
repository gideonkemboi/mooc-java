
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        while (true) {
            String s = scanner.nextLine();
            if (s.equals("")) {
                break;
            }

            inputs.add(s);
        }

        inputs.stream().forEach(s -> System.out.println(s));
    }
}
