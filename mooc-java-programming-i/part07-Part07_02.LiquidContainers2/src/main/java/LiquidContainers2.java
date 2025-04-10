
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        System.out.println("First: " + firstContainer);
        System.out.println("Second: " + secondContainer);

        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (amount > 0) {
                if (command.equals("add")) {

                    firstContainer.add(amount);

                    if (firstContainer.contains() > 100) {
                        firstContainer.setAmount(100);
                    }
                } else if (command.equals("move")) {
                    if (firstContainer.contains() < amount) {
                        secondContainer.add(firstContainer.contains());
                        firstContainer.setAmount(0);
                    } else {
                        firstContainer.remove(amount);
                        secondContainer.add(amount);
                    }

                    if (secondContainer.contains() > 100) {
                        secondContainer.setAmount(100);
                    }
                } else if (command.equals("remove")) {
                    if (secondContainer.contains() < amount) {
                        secondContainer.setAmount(0);
                    } else {
                        secondContainer.remove(amount);
                    }
                }
            }

            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

        }
    }

}
