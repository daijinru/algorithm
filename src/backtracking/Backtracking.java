package backtracking;

abstract public class Backtracking<I, S, R> {
    abstract public R run();

    abstract public Choice<I, S, R> choice(Object... args);
}
