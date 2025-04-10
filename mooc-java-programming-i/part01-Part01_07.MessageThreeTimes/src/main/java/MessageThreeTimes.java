
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here

        String message = scanner.nextLine();
        
        int i = 0;
        
        while (i < 3) {
            System.out.println(message);
            
            i = i + 1;
        }
    }
}
