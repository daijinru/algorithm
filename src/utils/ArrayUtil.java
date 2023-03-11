package utils;

import java.util.Arrays;
import java.util.List;

public class ArrayUtil {
    public static Integer[] IntsToIntegers(int[] ints) {
        return Arrays.stream(ints).boxed().toArray(Integer[]::new);
    }

    public static int[] IntegersToInts(Integer[] integers) {
        return Arrays.stream(integers).mapToInt(Integer::valueOf).toArray();
    }

    public static int[] ListIntegerToInts(List<Integer> ins) {
        return ins.stream().mapToInt(Integer::valueOf).toArray();
    }
}
