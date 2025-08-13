package sprint;


import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public List<String> combN(int n) {
        List<String> result = new ArrayList<>();
        if (n <= 0) {
            return result;
        }

        backtrack(0, n, "", result);
        return result;
    }

    private void backtrack(int start, int n, String current, List<String> result) {
        if (current.length() == n) {
            result.add(current);
            return;
        }

        for (int i = start; i <= 9; i++) {
            backtrack(i + 1, n, current + i, result);
        }
    }
}
