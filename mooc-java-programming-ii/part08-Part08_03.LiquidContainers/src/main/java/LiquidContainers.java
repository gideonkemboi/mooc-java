
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] inputArray = input.split(" ");
            String command = inputArray[0];
            int amount = Integer.valueOf(inputArray[1]);

            if (command.equals("add")) {
                first.incrementAmount(amount);
            } else if (command.equals("move")) {
                if (amount > first.getAmount()) {
                    second.setAmount(first.getAmount());
                    first.setAmount(0);
                } else {
                    second.incrementAmount(amount);
                    first.setAmount(first.getAmount() - amount);
                }
            } else if (command.equals("remove")) {
                if (second.getAmount() > amount) {
                    second.setAmount(second.getAmount() - amount);
                } else {
                    second.setAmount(0);
                }
            }

            System.out.println("");
        }

    }

}
