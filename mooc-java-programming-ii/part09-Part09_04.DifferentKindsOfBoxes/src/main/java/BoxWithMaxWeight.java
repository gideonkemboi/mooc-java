
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int maxWeight;   
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int weight = 0;
        
        for (Item i: this.items) {
            weight += i.getWeight();
        }
        
        if (weight + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
            weight += item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
}
