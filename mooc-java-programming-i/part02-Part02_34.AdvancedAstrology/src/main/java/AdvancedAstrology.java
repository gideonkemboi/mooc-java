
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        while (number != 0) {
            System.out.print("*");
            number--;
        }

        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        while (number != 0) {
            System.out.print(" ");
            number--;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int row = 1;
        int spaces = height - 1;
        int h = height;

        while (height != 0) {
            printSpaces(spaces);
            printStars(row);

            row += 2;
            spaces--;
            height--;
        }

        for (int i = 0; i < 2; i++) {
            printSpaces(h - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(100);
    }
}
