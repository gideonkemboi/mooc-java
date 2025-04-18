
import java.util.ArrayList;

public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> Items;

    public Suitcase(int maximumWeight) {
        this.Items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item Item) {
        if (this.totalWeight() + Item.getWeight() > this.maximumWeight) {
            return;
        }

        this.Items.add(Item);
    }

    public int totalWeight() {
//        int total = 0;
//        int index = 0;
//        while (index < this.Items.size()) {
//            total += this.Items.get(index).getWeight();
//            index++;
//        }

        int total = this.Items.stream().map(item -> item.getWeight()).reduce(0, (prevSum, value) -> prevSum + value);
        return total;
    }

    public void printItems() {
//        int indeksi = 0;
//        while (indeksi < this.Items.size()) {
//            Item t = this.Items.get(indeksi);
//            System.out.println(t);
//            indeksi++;
//        }

        this.Items.stream().forEach(item -> System.out.println(item));
    }

    public Item heaviestItem() {
        if (this.Items.isEmpty()) {
            return null;
        }

        // Tutustumme järjestämiseen hieman myöhemmin kurssilla
        return this.Items.stream().max((t1, t2) -> t1.getWeight() - t2.getWeight()).get();
    }

    @Override
    public String toString() {
        if (this.Items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (this.Items.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        }

        return this.Items.size() + " items (" + this.totalWeight() + " kg)";
    }
}
