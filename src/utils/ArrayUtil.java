package utils;

import java.util.Arrays;

public class ArrayUtil {
    public static Integer[] IntsToIntegers(int[] ints) {
        return Arrays.stream(ints).boxed().toArray(Integer[]::new);
    }
}
