import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int array[] = new int[5000];
        Random random = new Random();


        for(int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(30);
        }
            Arrays.sort(array);


        int freqOfEachNumber =1;
        int currentSearchingNumber = array[0];
        int modalValue = currentSearchingNumber;
        int highestNumber = 1;



        for(int i = 1; i < array.length; i++)
        {
            if(array[i] == currentSearchingNumber)
            {
                freqOfEachNumber++;
            }
            else{
                System.out.println("Frequency of number " + currentSearchingNumber + " is: " + freqOfEachNumber );


            if(freqOfEachNumber > highestNumber) {
                highestNumber = freqOfEachNumber;
                modalValue = currentSearchingNumber;



            }
                currentSearchingNumber = array[i];
                freqOfEachNumber = 1;
            }
        }

        System.out.println("Frequency of number " + currentSearchingNumber + " is: " + freqOfEachNumber + "\n");

        System.out.println("Highest modalValue is : "+ modalValue + " with the value of: " + highestNumber);
    }
}