package src;

import com.carrotsearch.junitbenchmarks.BenchmarkOptions;
import com.carrotsearch.junitbenchmarks.BenchmarkRule;
import com.carrotsearch.junitbenchmarks.annotation.AxisRange;
import com.carrotsearch.junitbenchmarks.annotation.BenchmarkHistoryChart;
import com.carrotsearch.junitbenchmarks.annotation.BenchmarkMethodChart;
import com.carrotsearch.junitbenchmarks.annotation.LabelType;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestRule;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@AxisRange(min = 0, max = 1)
@BenchmarkMethodChart(filePrefix = "benchmark-lists")
@BenchmarkHistoryChart(labelWith = LabelType.RUN_ID, maxRuns = 20)
@BenchmarkOptions(concurrency = 2, warmupRounds = 2, benchmarkRounds = 20)
public class TestBase {
    @BeforeClass
    public static void loadProperties() throws IOException {
        Properties p = new Properties();
        p.load(new FileInputStream(new File("src/resources/jub.properties")));
        for(String k:p.stringPropertyNames()){
            System.setProperty(k,p.getProperty(k));
        }
    }

    @Rule
    public TestRule benchmarkRun = new BenchmarkRule();
}
