import java.util.Arrays;
import sprint.ArrayFilter;

public class Main {

    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {1, 1, 1}
        };

        ArrayFilter arrayFilter = new ArrayFilter();
        int[][] filteredArray = arrayFilter.filterBySum(array, 10);

        for (int[] row : filteredArray) {
            System.out.println(Arrays.toString(row));
        }
    }
}
