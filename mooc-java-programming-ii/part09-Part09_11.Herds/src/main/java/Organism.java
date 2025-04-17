
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gdn
 */
public class Organism implements Movable {

    private Map<String, Integer> coordinates;

    public Organism(int x, int y) {
        this.coordinates = new HashMap<>();
        this.coordinates.put("x", x);
        this.coordinates.put("y", y);
    }

    @Override
    public String toString() {
        return "x: " + this.coordinates.get("x") + "; y: " + this.coordinates.get("y");
    }

    public void move(int dx, int dy) {
        this.coordinates.put("x", this.coordinates.get("x") + dx);
        this.coordinates.put("y", this.coordinates.get("y") + dy);
    }
}
