import java.lang.reflect.GenericArrayType;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int array[] = new int[100];

        for (int i = 0; i < array.length; i++) {
            Random rand = new Random();
            array[i] = rand.nextInt(1, 1000);
        }
        System.out.println(Arrays.toString(array));

        int largestArrayValue = Arrays.stream(array).max().getAsInt();


        int lowestArrayValue = Arrays.stream(array).min().getAsInt();
        System.out.println(lowestArrayValue + "  <--- lowest value, highest Value ----> " + largestArrayValue +"\n");


        int arraySumOfAllNumbers = Arrays.stream(array).sum();

        System.out.println("the sum of every number in the array: "+ arraySumOfAllNumbers);

        int arrayAverageOfaLLNums = Arrays.stream(array).sum()/array.length;
        ArrayList<Integer> count = new ArrayList<>();
        System.out.println("the average of all numbers in the array: "+ arrayAverageOfaLLNums);
            int freqOfNum7 = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 7)
            {
                freqOfNum7++;
            }

        }
        System.out.println("the frequency of the number 7 in the array: "+ freqOfNum7);

    }

}
