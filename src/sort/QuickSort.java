package sort;

import java.util.Random;

public class QuickSort extends Sort<Integer> {

    public QuickSort(Integer[] numbers) {
        super(numbers);
    }

    public QuickSort() {
        super();
    }

    public Integer[] run() {
        return this.quickSort(this.numbers, 0, this.numbers.length - 1);
    }

    public Integer[] run(Integer start, Integer end) {
        return this.quickSort(this.numbers, start, end);
    }

    public Integer[] quickSort(Integer[] numbers, Integer start, Integer end) {
        if (end > start) {
            Integer pivot = partition(numbers, start, end, getRandom(start, end));
            quickSort(numbers, start, pivot - 1);
            quickSort(numbers, pivot + 1, end);
        }
        return numbers;
    }

    public Integer getRandom(Integer start, Integer end) {
        return new Random().nextInt(end - start + 1) + start;
    }

    public Integer partition(Integer[] numbers, Integer start, Integer end, Integer random) {
        swap(numbers, random, end);

        Integer small = start - 1;
        for (int i = start; i < end; i++) {
            if (numbers[i] < numbers[end]) {
                small++;
                swap(numbers, i, small);
            }
        }

        small++;
        swap(numbers, small, end);
        return small;
    }

    public Integer[] swap(Integer[] numbers, Integer index1, Integer index2) {
        if (index1 != index2) {
            Integer temp = numbers[index1];
            numbers[index1] = numbers[index2];
            numbers[index2] = temp;
        }
        return numbers;
    }
}
