package sort;

import java.util.Random;

public class QuickSort extends Sort<Integer> {

    public QuickSort(Integer[] numbers) {
        super(numbers);
    }

    public Integer end;
    public Integer start;

    public void run() {
        this.quickSort(this.numbers, start, end);
    }

    public void quickSort(Integer[] numbers, Integer start, Integer end) {
        if (end > start) {
            Integer pivot = partition(this.numbers, start, end);
            quickSort(this.numbers, start, pivot - 1);
            quickSort(this.numbers, pivot + 1, end);
        }
    }

    public Integer partition(Integer[] numbers, Integer start, Integer end) {
        Integer random = new Random().nextInt(end - start + 1) + start;

        Integer small = start - 1;
        for (int i = start; i < end; i++) {
            if (numbers[i] < numbers[end]) {
                small++;
                swap(numbers, random, end);
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
