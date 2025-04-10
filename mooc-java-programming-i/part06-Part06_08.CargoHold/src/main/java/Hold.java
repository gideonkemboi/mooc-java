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

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = this.totalWeight();
        totalWeight += suitcase.totalWeight();

        if (totalWeight <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        int weight = 0;
        for (Suitcase suitcase : this.suitcases) {
            weight += suitcase.totalWeight();
        }

        return weight;
    }

    public void printItems() {
        System.out.println("The suitcases in the hold contain the following items:");
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }

    public String toString() {
        if (this.suitcases.isEmpty()) {
            return "no items (0 kg)";
        }

        String s = "suitcases";

        if (this.suitcases.size() == 1) {
            s = "suitcase";
        }

        return this.suitcases.size() + s + " (" + this.totalWeight() + " kg)";
    }
}
