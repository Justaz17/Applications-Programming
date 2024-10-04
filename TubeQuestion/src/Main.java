import java.util.Random;

public class Main {
    static String[] stations = {"Acton Town","Angel","Arsenal","Baker Street","Camden Town","Charing Cross", "Ealing Broadway"};
    static int[][] passengers;
    static Random rand = new Random();
    static final int columnAmount = 6;
    public static void main(String[] args) {
        passengers = initPassengers(stations.length,columnAmount);

        displayPassengers(passengers);
        displayBusiestStations(passengers);

        System.out.println();

        displayPercentIncreaseDecrease(passengers);


    }
    private static int[][] initPassengers(int row, int col) {
        int[][] passengers = new int[row][col];

        for (int i = 0; i < passengers.length; i++) {
            for (int j = 0; j < passengers[i].length; j++) {
                if(j == 0 || j == 3) {
                    passengers[i][j] = rand.nextInt(140000)+50000;
                }
                else if(j == 1 || j == 4) {
                    passengers[i][j] = rand.nextInt(80000)+30000;
                }
                else {
                    passengers[i][j] = rand.nextInt(15000)+5000;
                }
            }
        }
        return passengers;
    }
    public static void displayPassengers(int[][] passengers) {
        System.out.printf("%50s %60s", "Jan-Jun", "Jul-Dec");
        System.out.println();
        System.out.printf("%35s %15s %15s %10s %14s %18s %14s", "Weekday", "Saturday", "Sunday", " |","Weekday", "Saturday", "Sunday");
        System.out.println();

        for (int i = 0; i < passengers.length; i++) {
                System.out.printf("%20s",stations[i]);
                for (int j = 0; j < passengers[i].length; j++) {
                    System.out.printf("%15s", passengers[i][j] + "\t");
                    if (j == 2) {
                        System.out.printf("%10s", "|");
                    }
                }
            System.out.println();
        }
    }

    public static void displayBusiestStations(int[][] array) {
        String busiestStationName = null;
        int busiestStationValue = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(busiestStationValue < array[i][j]) {
                    busiestStationValue = array[i][j];
                    busiestStationName = stations[i];
                }
            }
        }
        System.out.println("The busiest station is " + busiestStationName +" with "+ busiestStationValue + " Passangers");
    }
    public static void displayPercentIncreaseDecrease(int[][] array) {
        System.out.println("Percentage increase/decrease");
        int[] totalPassangersJanJun = new int[stations.length];
        int[] totalPassangersJulDec = new int[stations.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length/2; j++) {
                totalPassangersJanJun[i] = array[i][j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = array[i].length/2; j <array[i].length; j++)
            {
                totalPassangersJulDec[i] = array[i][j];
            }
        }

        for (int i = 0; i < totalPassangersJanJun.length; i++) {
                System.out.printf("%-15s",stations[i]);


                int diff = totalPassangersJulDec[i] - totalPassangersJanJun[i];

                double increaseorDecrease = ((double) diff / totalPassangersJanJun[i]) * 100;
                System.out.printf("%10.2f%%\n", increaseorDecrease);
        }
    }
}
