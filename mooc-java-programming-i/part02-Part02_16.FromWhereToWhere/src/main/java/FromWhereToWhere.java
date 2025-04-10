
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        int to = Integer.valueOf(scanner.nextLine());

        System.out.println("Where to?");
        int from = Integer.valueOf(scanner.nextLine());

        if (from > to) {
            return;
        }
        
        for (int i = from; i <= to; i++) {
            System.out.println(i);
        }
    }
}
