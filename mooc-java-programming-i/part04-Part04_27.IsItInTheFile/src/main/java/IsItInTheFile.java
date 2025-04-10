
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String filepath = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        ArrayList<String> names = new ArrayList<>();
        
        try (Scanner file = new Scanner(Paths.get(filepath))) {
            while (file.hasNext()) {
                names.add(file.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + filepath + " failed.");
        }
        
        if (names.contains(searchedFor)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
    }
}
