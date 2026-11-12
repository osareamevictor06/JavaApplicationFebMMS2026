public class MatrixForm {
    public static void main(String[] args) {

        int[][] numbers = {
            {5, 9, 3, 6, 2},
            {4, 8, 7, 6, 1},
            {8, 9, 3, 1, 0},
            {9, 3, 1, 4, 7}
        };

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(numbers[row][col] + "\t");
            }
            System.out.println();
        }
    }
}