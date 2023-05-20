package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum extends Array<int[]>{
    int target;
    public TwoSum(int[] in, int target) {
        super(in);
        this.target = target;
    }

    public int[] run() {
        Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        for (int i = 0; i < value.length; i++) {
            if (hashmap.containsKey(target - value[i])) {
                return new int[]{hashmap.get(target - value[i]), i};
            }
            hashmap.put(value[i], i);
        }
        return new int[0];
    }
}
