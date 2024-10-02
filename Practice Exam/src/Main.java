import java.util.Random;

public class Main {
    static int[][] currentArray = new int[20][5];

    public static void main(String[] args) {

    populateArray(currentArray);
    System.out.println("Initial Array: ");
    printArray(currentArray);

    }
    static void populateArray (int[][] array){
        Random rand = new Random();

        for(int i = 0; i < array.length; i++){
            boolean[] usedNumbers = new boolean[11];
            for(int j = 0; j < array[i].length; j++){
                int currentNumber;


                //generate random numbers for the even column number
                if(j % 2 == 0){
                do{
                    currentNumber = rand.nextInt(1,6)*2;
                }while(usedNumbers[currentNumber]);
                }
                else{
                    do{
                        currentNumber = rand.nextInt(5)*2+1;
                    }while(usedNumbers[currentNumber]);
                }
                array[i][j] = currentNumber;
                usedNumbers[currentNumber] = true;

            }
        }
    }
    static void printArray (int[][] array){
        for(int[] row : array){
            for(int number : row){
                System.out.print(" "+number);
            }
            System.out.println();
        }
    }
}