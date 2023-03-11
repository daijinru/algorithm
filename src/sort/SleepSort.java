package sort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * sleep = numeric element * timeout
 * and add it to the array for Sorting.
 * Just for fun ?.
 */
public class SleepSort {
    public static List<Integer> out = new ArrayList<>();
    private static class SleepThreads extends Thread {
        private int num;
        private CountDownLatch cdl;
        public SleepThreads(int num, CountDownLatch cdl) {
            this.num = num;
            this.cdl = cdl;
        }
        @Override
        public void run() {
            try {
                sleep(num * 15);
                cdl.countDown();
                out.add(this.num);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void run(int[] in) {
        SleepThreads array[] = new SleepThreads[in.length];
        CountDownLatch cdl = new CountDownLatch(in.length);
        for (int i = 0; i < array.length; i++) {
            array[i] = new SleepThreads(in[i], cdl);
            array[i].start();
        }
        try {
            cdl.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
