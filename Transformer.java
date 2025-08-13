package sprint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class Transformer {
    public static int[] transform(int[] arr) {
        if (arr == null) return null;
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int n : arr) set.add(n);
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        for (int i = 2; i < list.size(); i += 3) {
            list.set(i, list.get(i - 1) + list.get(i - 2));
        }
        Collections.reverse(list);
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) res[i] = list.get(i);
        return res;
    }
}

