
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> registry;
    
    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (registry.containsKey(licensePlate)) {
            return false;
        }
        this.registry.put(licensePlate, owner);
        return true;
        
    }
    
    public String get(LicensePlate licensePlate) {
        return registry.getOrDefault(licensePlate, null);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (!(registry.containsKey(licensePlate))) {
            return false;
        }
        
        registry.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates() {
        for (LicensePlate lp : this.registry.keySet()) {
            System.out.println(lp);
        }
    }
    
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        
        for (String owner : this.registry.values()) {
            if (!(owners.contains(owner))) {
                System.out.println(owner);
                owners.add(owner);
            }
        }
    }
}
