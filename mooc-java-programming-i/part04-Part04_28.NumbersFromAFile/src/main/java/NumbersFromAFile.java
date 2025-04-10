
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String filepath = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        ArrayList<Integer> numbers = new ArrayList<>();
        try (Scanner file = new Scanner(Paths.get(filepath))) {
            while (file.hasNext()) {
                numbers.add(Integer.valueOf(file.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        int count = 0;
        for (int num: numbers) {
            if (num >= lowerBound && num <= upperBound) {
                count++;
            }
        }
        
        System.out.println("Numbers: " + count);
    }

}
