/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gdn
 */
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        int totalWeight = this.totalWeight();
        totalWeight += item.getWeight();

        if (totalWeight <= this.maxWeight) {
            this.items.add(item);
        }
    }
    
    public void printItems() {
        for (Item item: items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int weight = 0;
        for (Item item : this.items) {
            weight += item.getWeight();
        }

        return weight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.items.get(0);
        for (Item item: this.items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        
        return heaviest;
    }

    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }

        String itemString = "items";

        if (this.items.size() == 1) {
            itemString = "item";
        }

        return this.items.size() + itemString + " (" + this.totalWeight() + " kg)";
    }
}
