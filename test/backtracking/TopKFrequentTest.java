package backtracking;

import com.carrotsearch.junitbenchmarks.BenchmarkOptions;
import com.carrotsearch.junitbenchmarks.BenchmarkRule;
import com.carrotsearch.junitbenchmarks.annotation.AxisRange;
import com.carrotsearch.junitbenchmarks.annotation.BenchmarkHistoryChart;
import com.carrotsearch.junitbenchmarks.annotation.BenchmarkMethodChart;
import com.carrotsearch.junitbenchmarks.annotation.LabelType;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

import static org.junit.Assert.*;

/** 
* TopKFrequent Tester. 
* 
* @author <Authors name> 
* @since <pre>1ÔÂ 2, 2023</pre> 
* @version 1.0 
*/
@AxisRange(min = 0, max = 1)
@BenchmarkMethodChart(filePrefix = "benchmark-lists")
@BenchmarkHistoryChart(labelWith = LabelType.RUN_ID, maxRuns = 20)
@BenchmarkOptions(concurrency = 2, warmupRounds = 2, benchmarkRounds = 20)
public class TopKFrequentTest {
    @BeforeClass
    public static void loadProperties() throws IOException {
        Properties p = new Properties();
        p.load(new FileInputStream(new File("src/resources/jub.properties")));
        for(String k:p.stringPropertyNames()){
            System.setProperty(k,p.getProperty(k));
        }
    }
    @Rule
    public TestRule benchmarkRule = new BenchmarkRule();
    @Test
    @BenchmarkOptions(concurrency = 2, warmupRounds = 0, benchmarkRounds = 5)
    public void testRun() throws Exception {
        Integer[] numbers = new Integer[]{1, 2, 2, 1, 3, 1};
        Integer k = 2;
        TopKFrequent topKFrequent = new TopKFrequent(numbers, k);
        List<Integer> expected = new LinkedList<>(Arrays.asList(2, 1));
        assertArrayEquals(expected.toArray(), topKFrequent.run().toArray());
    }
} 
