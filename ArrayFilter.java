package sprint;

public class ArrayFilter {

    public int[][] filterBySum(int[][] array, int value) {
      
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            if (sum >= value) {
                count++;
            }
        }

        int[][] result = new int[count][];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            if (sum >= value) {
                result[index++] = array[i];
            }
        }

        return result;
    }
}
