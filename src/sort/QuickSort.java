package sort;

public class QuickSort extends Sort<Integer> {

    public QuickSort(Integer[] numbers) {
        super(numbers);
    }

    private Integer end;
    private Integer start;

    public void run() {
        this.quickSort(this.numbers, start, end);
    }

    private void quickSort(Integer[] numbers, Integer start, Integer end) {
        if (end > start) {
            Integer pivot = partition(this.numbers, start, end);
            quickSort(this.numbers, start, pivot - 1);
            quickSort(this.numbers, pivot + 1, end);
        }
    }

    private Integer partition(Integer[] numbers, Integer start, Integer end) {
        return null;
    }
}
