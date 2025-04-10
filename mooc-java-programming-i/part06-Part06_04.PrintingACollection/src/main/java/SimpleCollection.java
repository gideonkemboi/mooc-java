
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String collectionName = this.name;

        if (this.elements.isEmpty()) {
            return "The collection " + collectionName + " is empty.";
        }

        String e = " elements";

        if (this.elements.size() == 1) {
            e = " element";
        }

        String printOut = "The collection " + collectionName + " has " + this.elements.size() + e + ":" + "\n";

        String elements = "";

        for (String element : this.elements) {
            if (this.elements.size() == 1) {
                elements += element;
            } else {
                elements += element + "\n";
            }
        }

        return printOut + elements;
    }
}
