package dynamicPrograming;

public class Factorial extends DynamicPrograming<Integer>{
    public Factorial(Integer[] input) throws Exception {
        super(input);
    }

    @Override
    public void initial() {
        this.insert(0, this.numbers[0]);
    }

    @Override
    public Integer STE(int i) {
        return this.dp.get(i - 1) * this.numbers[i];
    }

    @Override
    public int run() {
        for (int i = 1; i < this.numbers.length; i++) {
            this.insert(i, this.STE(i));
        }
        return this.dp.get(this.numbers.length - 1);
    }
}
