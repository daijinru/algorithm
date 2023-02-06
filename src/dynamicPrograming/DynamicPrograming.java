package dynamicPrograming;

import java.util.Vector;

abstract public class DynamicPrograming<T> {
    public T[] numbers;
    public Vector<Integer> dp;

    /**
     * Constructor is typically used to initialize array this.dp and source this.numbers.
     * And initial will be executed later.
     */
    public DynamicPrograming(T[] input) throws Exception {
        if (input.length < 1) {
            throw new Exception("Do not enter the Array length of 0");
        }
        this.numbers = input;
        this.dp = new Vector<>();
        this.initial();
    }

    public void insert(int index, Integer element) {
        if (index >= this.dp.size()) {
            this.dp.add(index, element);
        } else {
            this.dp.set(index, element);
        }
    }

    public Integer get(int index) {
        return this.dp.get(index);
    }

    /**
     * DP Initialize
     */
    abstract void initial();

    /**
     * DP State Transition Equation
     * @return T
     */
    abstract T STE(int i);

    abstract int run();

}

