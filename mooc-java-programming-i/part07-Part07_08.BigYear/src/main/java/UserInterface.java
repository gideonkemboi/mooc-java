
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private ArrayList<Bird> birds;
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.birds = new ArrayList<>();
        this.scanner = scanner;
    }

    public void start() {
        ArrayList<String> commands = new ArrayList<>();
        commands.add("Add - adds a bird");
        commands.add("Observation - adds an observation");
        commands.add("All - prints all birds");
        commands.add("One - prints one bird");
        commands.add("Quit - ends the program");

        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                System.out.println("Name: ");
                String name = scanner.nextLine();

                System.out.println("Name in Latin: ");
                String latinName = scanner.nextLine();

                this.add(name, latinName);
            } else if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();

                this.observation(name);

            } else if (command.equals("All")) {
                this.all();
            } else if (command.equals("One")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();

                this.one(name);
            }
        }
    }

    public void add(String name, String latinName) {
        this.birds.add(new Bird(name, latinName));
    }

    public void observation(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                bird.incrementObservations();
            }
        }

        System.out.println("Not a bird;");
    }

    public void all() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

    private void one(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
                break;
            }
        }
    }
}
