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

public class Stack {

    ArrayList<String> strings;

    public Stack() {
        this.strings = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (this.strings.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public void add(String value) {
        this.strings.add(value);
    }
    
    public ArrayList<String> values() {
        return this.strings;
    }
    
    public String take() {
        return this.strings.remove(this.strings.size() - 1);
    }
}
