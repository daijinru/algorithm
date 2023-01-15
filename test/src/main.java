package src;

import backtracking.SubsetsTest;
import backtracking.TopKFrequentTest;
import dynamicPrograming.CanPartitionTest;
import org.junit.runner.*;
import org.junit.runner.notification.Failure;
import sort.QuickSortTest;

public class main {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(
                QuickSortTest.class,
                SubsetsTest.class,
                TopKFrequentTest.class,
                CanPartitionTest.class
        );
        for (Failure failure : result.getFailures()) {
            System.out.println(
                    "Test Failed: \n" +
                    failure.toString() + '\n'
            );
        }
        System.out.println(
                "Is Test successful? \n" +
                result.wasSuccessful()
        );
    }
}
