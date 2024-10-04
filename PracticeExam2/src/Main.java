import java.util.Random;

public class Main {
    static int[][] array;

    public static void main(String[] args) {
        array = initArray(20,5);
        printArray(array);

        System.out.println();

        System.out.println("Array after Being raised by the power of successor\n");
       int[][] raised = raiseArray(array);
       printArray(raised);

    }
    private static int[][] initArray(int row, int col) {
        int[][] array = new int[row][col];
        Random random = new Random();

        for (int i = 0; i < row; i++) {
            boolean[] usedNumbers = new boolean[11];
            for (int j = 0; j < col; j++) {
                int randomNumber;
                if(j % 2 ==0)
                {
                    do{
                        randomNumber = random.nextInt(1,11);
                    }while(randomNumber % 2 !=0 || usedNumbers[randomNumber]);
                }
                else{
                    do{
                        randomNumber = random.nextInt(1,11);
                    }while(randomNumber % 2 ==0 || usedNumbers[randomNumber]);
                }
                array[i][j] = randomNumber;
                usedNumbers[randomNumber] = true;
            }
        }
        return array;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%-12d",array[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] raiseArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            int rowLength = array[i].length; // get the length of the current row.
            for (int j = 0; j < rowLength; j++) {
                int nextIndex = (j+1) % rowLength; // to wrap around to the first element if at the end
                array[i][j] = (int) Math.pow(array[i][j], (array[i][nextIndex]));
            }
        }
        return array;
    }
}