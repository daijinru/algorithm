package src;

import org.junit.runner.*;
import org.junit.runner.notification.Failure;
import sort.QuickSortTest;

public class main {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(QuickSortTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(
                    "Test Failed: \n" +
                    failure.toString()
            );
        }
        System.out.println(
                "Is Test successful? \n" +
                result.wasSuccessful()
        );
    }
}