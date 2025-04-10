
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String filename = scanner.nextLine();

        ArrayList<String> pi = new ArrayList<>();

        try ( Scanner file = new Scanner(Paths.get(filename))) {
            while (file.hasNext()) {
                String line = file.nextLine();

                if (line.isEmpty()) {
                    continue;
                }

                pi.add(line);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (String line : pi) {
            String[] parts = line.split(",");

            String ans = " years";
            if (Integer.valueOf(parts[1]) == 1) {
                ans = " year";
            }

            System.out.println(parts[0] + ", " + "age: " + parts[1] + ans);
        }
    }
}
