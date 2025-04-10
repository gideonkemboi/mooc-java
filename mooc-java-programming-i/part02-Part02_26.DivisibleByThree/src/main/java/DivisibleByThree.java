
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        divisibleByThreeInRange(2, 10);

    }

    public static void divisibleByThreeInRange(int x, int y) {
        for (int i = x; i <= y; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
