
import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        double max = 0.0;

        for (double value : this.history) {
            if (value > max) {
                max = value;
            }
        }

        return max;
    }

    public double minValue() {
        double min = this.history.get(0);

        for (double value : this.history) {
            if (value < min) {
                min = value;
            }
        }

        if (this.history.isEmpty()) {
            return 0.0;
        }

        return min;
    }

    public double average() {
        double sum = 0.0;
        int count = 0;

        for (double value : this.history) {
            sum += value;
            count++;
        }

        double average;

        if (count == 0) {
            average = 0.0;
        } else {
            average = sum / count;
        }

        return average;
    }

    public String toString() {
        return this.history.toString();
    }
}
