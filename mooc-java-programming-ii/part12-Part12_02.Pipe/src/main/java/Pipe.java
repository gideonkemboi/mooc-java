
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gdn
 */
public class Pipe<T> {

    private ArrayList<T> pipe;

    public Pipe() {
        this.pipe = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        // puts an object with a type in accordance with the type parameter given to the the class into the pipe.
        this.pipe.add(0, value);
    }

    public T takeFromPipe() {
        // takes out the value, which has been in the pipe the longest. 
        // In case there is nothing in the pipe, return null. 
        // Calling the method returns the value, which has been in the pipe the longest, and removes it from the pipe.

        if (this.pipe.size() == 0) {
            return null;
        }

        T removed = this.pipe.remove(this.pipe.size() - 1);
        return removed;
    }

    public boolean isInPipe() {
        // returns the value true if the pipe has values. In case the pipe is empty, it returns the value false.

        if (this.pipe.size() > 0) {
            return true;
        }

        return false;
    }

}
