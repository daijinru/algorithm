package sort;

import array.Array;

abstract public class Sort<T> {
    public T[] numbers;
    public Sort(T[] numbers) {
        this.numbers = numbers;
    }

    abstract void run();
}
