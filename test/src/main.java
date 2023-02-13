package src;

import backtracking.CombineTest;
import backtracking.SubsetsTest;
import backtracking.TopKFrequentTest;
import dynamicPrograming.*;
import org.junit.runner.*;
import org.junit.runner.notification.Failure;
import sort.QuickSortTest;
import string.StringUtilsTest;

public class main {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(
                QuickSortTest.class,
                CombineTest.class,
                SubsetsTest.class,
                TopKFrequentTest.class,
                CanPartitionTest.class,
                Pack01Test.class,
                PackCompleteTest.class,
                PackMultipleTest.class,
                MinCostClimbingStairsTest.class,
                HouseRobTest.class,
                StringUtilsTest.class
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
