
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private GradeStatistics statistics;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.statistics = new GradeStatistics();
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int point = Integer.valueOf(scanner.nextLine());

            if (point == -1) {
                break;
            }

            if (point < 0 || point > 100) {
                continue;
            }

            this.statistics.addPoints(point);
        }

        this.statistics.average();
        this.statistics.averagePassing();
        this.statistics.passPercentage();
        this.statistics.distribution();
    }
}
