import java.util.Random;

public class Main {
    static int[][] array;

    public static void main(String[] args) {
        array = initArray(10,10);
        printArray(array);
    }
    private static int[][] initArray(int row, int col) {
        int[][] array = new int[row][col];
        Random random = new Random();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = random.nextInt(1 ,101);
            }
        }
        return array;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}