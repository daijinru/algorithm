package backtracking;

@FunctionalInterface
public interface Choice<N, S, R> {
    void execute(N input, int i, S s, R r);
}
