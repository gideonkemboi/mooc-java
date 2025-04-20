
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {
        if (size % 2 == 0) {
            throw new IllegalArgumentException("Size must be an odd integer.");
        }

        MagicSquare square = new MagicSquare(size);

        int row = 0; // Start at the first row
        int col = size / 2; // Start at the middle column
        int num = 1; // Start with 1

        while (num <= size * size) {
            square.placeValue(col, row, num);

            int nextRow = (row - 1 + size) % size; // Wrap to the bottom if going above
            int nextCol = (col + 1) % size; // Wrap to the left if going out of bounds

            if (square.readValue(nextCol, nextRow) != 0) {
                // If the target cell is occupied, move down instead
                row = (row + 1) % size;
            } else {
                // Otherwise, move up and right
                row = nextRow;
                col = nextCol;
            }

            num++;
        }

        return square;
    }

}
