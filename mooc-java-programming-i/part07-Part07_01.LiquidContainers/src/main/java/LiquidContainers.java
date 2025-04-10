
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstVolume = 0;
        int secondVolume = 0;

        System.out.println("First: " + firstVolume + "/100");
        System.out.println("Second: " + secondVolume + "/100");

        while (true) {
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (amount > 0) {
                if (command.equals("add")) {

                    firstVolume += amount;

                    if (firstVolume > 100) {
                        firstVolume = 100;
                    }
                } else if (command.equals("move")) {
                    if (firstVolume < amount) {
                        secondVolume += firstVolume;
                        firstVolume = 0;
                    } else {
                        firstVolume -= amount;
                        secondVolume += amount;
                    }

                    if (secondVolume > 100) {
                        secondVolume = 100;
                    }
                } else if (command.equals("remove")) {
                    if (secondVolume < amount) {
                        secondVolume = 0;
                    } else {
                        secondVolume -= amount;
                    }
                }
            }

            System.out.println("First: " + firstVolume + "/100");
            System.out.println("Second: " + secondVolume + "/100");

        }
    }

}
