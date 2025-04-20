package asteroids.logic;

import javafx.scene.shape.Polygon;

/**
 *
 * @author gdn
 */
public class Ship extends Character {

    public Ship(int x, int y) {
        super(new Polygon(-5, -5, 10, 0, -5, 5), x, y);
    }
}