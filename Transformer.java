package sprint;

import java.util.*;

public class Transformer {

    public int[] transform(int[] input) {
       
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for (int num : input) {
            uniqueSet.add(num);
        }

    
        List<Integer> list = new ArrayList<>(uniqueSet);

      
        list.sort(Collections.reverseOrder());

     
        for (int i = 2; i < list.size(); i += 3) {
            int sum = list.get(i - 1) + list.get(i - 2);
            list.set(i, sum);
        }

       
        Collections.reverse(list);

     
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
