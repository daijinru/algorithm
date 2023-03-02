package backtracking;

/**
 * N input
 * S subsets/combinations
 * R result (list of subsets/combinations)
 */
@FunctionalInterface
public interface Choice<N, S, R> {
    void execute(N input, int i, S s, R r);
}
