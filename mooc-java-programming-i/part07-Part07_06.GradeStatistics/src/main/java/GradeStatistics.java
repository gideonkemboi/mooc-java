
import java.util.ArrayList;

public class GradeStatistics {

    private ArrayList<Integer> points;

    public GradeStatistics() {
        this.points = new ArrayList<>();
    }

    public void addPoints(int point) {
        this.points.add(point);
    }

    public void average() {
        int sum = 0;

        for (int point : this.points) {
            sum += point;
        }

        double average = (double) sum / this.points.size();
        System.out.println("Point average (all): " + average);
    }

    public void averagePassing() {
        int sum = 0;
        int count = 0;

        for (int point : this.points) {
            if (point >= 50) {
                sum += point;
                count++;
            }
        }

        if (count > 0) {
            double averagePassing = (double) sum / count;
            System.out.println("Point average (passing): " + averagePassing);
        } else {
            System.out.println("Point average (passing): -");
        }
    }

    public void passPercentage() {
        int count = 0;

        for (int point : this.points) {
            if (point >= 50) {
                count++;
            }
        }

        double passPercent = (double) 100 * count / this.points.size();
        System.out.println("Pass percentage: " + passPercent);
    }

    public void distribution() {
        String five = "";
        String four = "";
        String three = "";
        String two = "";
        String one = "";
        String zero = "";

        System.out.println("Grade distribution:");
        for (int point : points) {
            if (point >= 90) {
                five += "*";
            } else if (point < 90 && point >= 80) {
                four += "*";
            } else if (point < 80 && point >= 70) {
                three += "*";
            } else if (point < 70 && point >= 60) {
                two += "*";
            } else if (point < 60 && point >= 50) {
                one += "*";
            } else if (point < 50) {
                zero += "*";
            }
        }

        System.out.println("5: " + five);
        System.out.println("4: " + four);
        System.out.println("3: " + three);
        System.out.println("2: " + two);
        System.out.println("1: " + one);
        System.out.println("0: " + zero);
    }
}
