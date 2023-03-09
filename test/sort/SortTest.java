package sort;

import com.carrotsearch.junitbenchmarks.BenchmarkOptions;
import org.h2.command.dml.Merge;
import org.junit.Test;
import src.TestBase;

import static org.junit.Assert.*;

public class SortTest extends TestBase {

    private Integer[] getIn() {
        return new Integer[]{4, 1, 5, 6, 2, 7, 8, 3};
    }
    private Integer[] getExpected() {
        return new Integer[]{1, 2, 3, 4, 5, 6, 7, 8};
    }
    @Test
    @BenchmarkOptions(concurrency = 2, warmupRounds = 0, benchmarkRounds = 5)
    public void testQuickSort() throws Exception {
        QuickSort qs = new QuickSort(this.getIn());
        assertEquals(this.getExpected(), qs.run());
    }

    @Test
    @BenchmarkOptions(concurrency = 2, warmupRounds = 0, benchmarkRounds = 5)
    public void testMergeSort() throws Exception {
        MergeSort ms = new MergeSort(this.getIn());
        assertEquals(this.getExpected(), ms.run());
    }
}
