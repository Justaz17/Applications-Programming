import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the table: ");

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                int newNumber = j *j;
                System.out.print(newNumber + " ");
            }
            System.out.println();
        }
    }
}