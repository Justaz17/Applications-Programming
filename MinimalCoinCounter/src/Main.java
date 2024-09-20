import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a value you want to break down: ");
        double originalAmount = sc.nextDouble();
        totalCoinCalculator(originalAmount);
    }
    static void totalCoinCalculator(double amount) {
        int[] cents = {200,100,50,20,10,5,2,1};
        //taking 3.45 x 100 = 345
        int originalAmount = (int) (amount *100);

        for(int cent : cents)
        {
            // 1 = 345 / 200
            int numberOfCoins = originalAmount / cent;
            // 1 > 0 ,
            if(numberOfCoins > 0)
            {
                //printing out number of coins needed 1, then getting the cents(200)*100.0 + coins
                System.out.println(numberOfCoins +" €"+ (cent/100.0)+" coins");
                //original amount = originalAmount(345) - (1 * 200)
                originalAmount -= numberOfCoins *cent;
            }
        }




        }
    }
