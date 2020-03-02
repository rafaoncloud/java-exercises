import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.logging.Logger;
import java.util.regex.*;

public class Array2d {

    private static final Logger LOGGER = Logger.getLogger(Array2d.class.getName());

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 9, 2, -4, -4, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, -1, -2, -4, 0}
        };
        /*int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        scanner.close();*/

        int HOURGLASS_SIZE = 3;
        int max = Integer.MIN_VALUE; // To handle corner cases

        for(int topRow = 0; topRow < 6 - HOURGLASS_SIZE + 1; topRow++){
            for(int leftColumn = 0; leftColumn < 6 - HOURGLASS_SIZE + 1; leftColumn++){
                int sum = 0;
                for(int i = leftColumn; i < leftColumn + 3; i++){
                    sum += arr[topRow][i];
                    sum += arr[topRow + 2][i];
                }
                sum += arr[topRow + 1][leftColumn + 1];

                if(sum > max)
                    max = sum;

                LOGGER.info(String.valueOf(sum));
            }
        }

        System.out.println(max);
    }
}
