
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;

        while (true) {
            String s = scanner.nextLine();

            if (s.equals("")) {
                break;
            }

            String[] stringArray = s.split(",");
            
            if (Integer.valueOf(stringArray[1]) > oldest) {
                oldest = Integer.valueOf(stringArray[1]);
            }
        }
        
        System.out.println(oldest);

    }
}
