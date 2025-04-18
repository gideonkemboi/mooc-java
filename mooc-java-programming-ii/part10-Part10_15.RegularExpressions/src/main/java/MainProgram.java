
public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise

        String[] strings = {"a", "aaaaaaa", "3:59:31", "24:41:16", "23:61:23", "20:00:79",
            "13:9:31", "21:41:6", "23,61:23", "20:00;79"};

        for (String time : strings) {
            System.out.println(time + " " + new Checker().timeOfDay(time));
        }
    }
}
