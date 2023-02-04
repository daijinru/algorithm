package dynamicPrograming;

import java.util.Vector;

abstract public class DynamicPrograming<T> {
    public T[] numbers;
    public Vector<Integer> dp;

    /**
     * Constructor is typically used to initialize array this.dp and source this.numbers.
     * And initial will be executed later.
     */
    public DynamicPrograming(T[] input) {
        this.numbers = input;
        this.dp = new Vector<>();
        this.initial();
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

