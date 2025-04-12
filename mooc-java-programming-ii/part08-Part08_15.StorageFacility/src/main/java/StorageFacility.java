
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storageUnits;

    public StorageFacility() {
        this.storageUnits = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storageUnits.putIfAbsent(unit, new ArrayList<>());

        this.storageUnits.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.storageUnits.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        ArrayList<String> items = this.storageUnits.get(storageUnit);

        for (String i : items) {
            if (i.equals(item)) {
                items.remove(item);
                break;
            }
        }

        if (items.isEmpty()) {
            this.storageUnits.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> storageUnits = new ArrayList<>();

        for (String unit : this.storageUnits.keySet()) {
            if (!(this.storageUnits.get(unit).isEmpty())) {
                storageUnits.add(unit);
            }
        }

        return storageUnits;
    }
}
