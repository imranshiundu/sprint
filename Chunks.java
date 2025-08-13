package sprint;

public class Chunks {

    public static int search(int[] sortedArray, int target) {
        if (sortedArray == null || sortedArray.length == 0) {
            return 0;
        }
        return recursiveSearch(sortedArray, target, 0, sortedArray.length - 1, 1);
    }

    private static int recursiveSearch(int[] array, int target, int left, int right, int steps) {
        if (left > right) {
            return steps;
        }

        int mid = left + (right - left) / 2;
        // Adjust for even-sized arrays
        if ((right - left + 1) % 2 == 0) {
            mid = left + ((right - left) / 2);
        }

        if (array[mid] == target) {
            return steps;
        } else if (array[mid] > target) {
            return recursiveSearch(array, target, left, mid - 1, steps + 1);
        } else {
            return recursiveSearch(array, target, mid + 1, right, steps + 1);
        }
    }
}
