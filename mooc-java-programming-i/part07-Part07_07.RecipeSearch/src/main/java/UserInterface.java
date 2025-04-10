
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private ArrayList<Recipe> recipes;

    public UserInterface() {
        this.recipes = new ArrayList<>();
    }

    public void start() {
        System.out.print("File to read: ");
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();

        this.read(file);

        ArrayList<String> commands = new ArrayList<>();
        commands.add("list - lists the recipes");
        commands.add("stop - stops the program");
        commands.add("find name - searches recipes by name");
        commands.add("find cooking time - searches recipes by cooking time");
        commands.add("find ingredient - searches recipes by ingredient");

        System.out.println("");
        System.out.println("Commands:");

        for (String command : commands) {
            System.out.println(command);
        }

        System.out.println("");

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                return;
            } else if (command.equals("list")) {
                System.out.println("");
                System.out.println("Recipes:");
                this.list();
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String name = scanner.nextLine();

                System.out.println("");
                System.out.println("Recipes:");
                this.findByName(name);
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());

                System.out.println("");
                System.out.println("Recipes:");
                this.findByCookTime(time);
            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();

                System.out.println("");
                System.out.println("Recipes:");
                this.findByIngredient(ingredient);
            }

            System.out.println("");
        }

    }

    public void read(String file) {
        try ( Scanner reader = new Scanner(Paths.get(file))) {

            while (reader.hasNextLine()) {
                String name = reader.nextLine().trim();
                if (name.isEmpty()) {
                    continue;
                }

                int cookTime = Integer.parseInt(reader.nextLine().trim());

                ArrayList<String> ingredients = new ArrayList<>();

                while (reader.hasNextLine()) {
                    String ingredient = reader.nextLine().trim();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    ingredients.add(ingredient);
                }

                recipes.add(new Recipe(name, cookTime, ingredients));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void list() {
        for (Recipe recipe : this.recipes) {
            System.out.println(recipe);
        }
    }

    private void findByName(String name) {
        int index = 0;

        for (Recipe recipe : this.recipes) {
            if (recipe.getName().contains(name)) {
                System.out.println(recipe);
            }

            index++;
        }
    }

    private void findByCookTime(int time) {
        int index = 0;

        for (Recipe recipe : this.recipes) {
            if (recipe.getCookTime() <= time) {
                System.out.println(recipe);
            }

            index++;
        }
    }

    private void findByIngredient(String ingredient) {
        int index = 0;

        for (Recipe recipe : this.recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }

            index++;
        }
    }
}
