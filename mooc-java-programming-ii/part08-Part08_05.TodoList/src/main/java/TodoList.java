
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> todolist;

    public TodoList() {
        this.todolist = new ArrayList<>();
    }

    public void add(String task) {
        this.todolist.add(task);
    }

    public void print() {
        int i = 1;
        for (String task : this.todolist) {
            System.out.println(i + ": " + task);
            i++;
        }
    }

    public void remove(int number) {
        number -= 1;
        this.todolist.remove(number);
    }
}
