/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gdn
 */
import java.util.Scanner;

public class UserInterface {

    private TodoList todolist;
    private Scanner scanner;

    public UserInterface(TodoList todolist, Scanner scanner) {
        this.todolist = todolist;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                System.out.print("To add: ");
                String task = scanner.nextLine();

                this.todolist.add(task);
                continue;
            }

            if (command.equals("list")) {
                this.todolist.print();
                continue;
            }

            if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int index = Integer.valueOf(scanner.nextLine());

                this.todolist.remove(index);
                continue;
            }
        }

    }
}
