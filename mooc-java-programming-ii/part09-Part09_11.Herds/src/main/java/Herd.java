
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gdn
 */
public class Herd implements Movable {

    private List<Movable> movables;

    public Herd() {
        this.movables = new ArrayList<>();
    }

    public String toString() {
        String s = "";

        for (Movable movable : this.movables) {
            s += movable.toString() + "\n";
        }

        return s;
    }

    public void addToHerd(Movable movable) {
        this.movables.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable movable : this.movables) {
            movable.move(dx, dy);
        }
    }
}
