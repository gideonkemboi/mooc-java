
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {

    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .map(parts -> new Literacy(parts[0], parts[1], parts[2], parts[3], Integer.valueOf(parts[4]), Double.valueOf(parts[5])))
                    .sorted((l1, l2) -> {
                        return Double.compare(l1.getLiteracyPercentage(), l2.getLiteracyPercentage());
                    })
                    .forEach(literacy -> System.out.println(literacy));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
