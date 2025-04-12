
import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> oweMap;

    public IOU() {
        this.oweMap = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.oweMap.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return this.oweMap.getOrDefault(toWhom, 0.0);
    }
}
