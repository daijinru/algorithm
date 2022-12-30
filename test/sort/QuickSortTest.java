package sort;

import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.*;

/** 
* QuickSort Tester. 
* 
* @author <Authors name> 
* @since <pre>12ÔÂ 28, 2022</pre> 
* @version 1.0 
*/ 
public class QuickSortTest {


    private QuickSort getInstance() {
        return new QuickSort(this.getNumbers());
    }

    private Integer[] getNumbers() {
        return new Integer[]{4, 1, 5, 6, 2, 7, 8, 3};
    }

    private QuickSort getInstance(Integer[] numbers) {
        return new QuickSort(numbers);
    }

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
    *
    * Method: run()
    *
    */
    @Test
    public void testRun() throws Exception {
        QuickSort qs = getInstance();
        Integer[] expected = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(expected, qs.run());

        Integer[] expected1 = new Integer[]{4, 1, 5, 2, 3, 6, 7, 8};
        QuickSort qs1 = getInstance();
        assertArrayEquals(expected1, qs1.run(3, 7));
    }


    /**
    *
    * Method: quickSort(Integer[] numbers, Integer start, Integer end)
    *
    */
    @Test
    public void testQuickSort() throws Exception {
        Integer[] numbers = getNumbers();
        QuickSort qs = getInstance();
        Integer[] expected = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8};
        Integer[] actual = qs.quickSort(numbers, 0, numbers.length - 1);
        assertArrayEquals(expected, actual);
    }

    /**
    *
    * Method: partition(Integer[] numbers, Integer start, Integer end)
    *
    */
    @Test
    public void testPartition() throws Exception {
        QuickSort quickSort = getInstance();
        Integer[] numbers = getNumbers();
        Integer randomMock = 3;
        Integer expected = 5;
        assertEquals(expected, quickSort.partition(numbers, 0, numbers.length - 1, randomMock));
    }

    /**
    *
    * Method: swap(Integer[] numbers, Integer index1, Integer index2)
    *
    */
    @Test
    public void testSwap() throws Exception {
        Integer[] numbers = getNumbers();
        QuickSort quickSort = getInstance();

        Integer[] expected = new Integer[]{1, 4, 5, 6, 2, 7, 8, 3};
        assertArrayEquals(expected, quickSort.swap(numbers, 0, 1));

        Integer[] expected1 = new Integer[]{4, 1, 5, 6, 2, 7, 8, 3};
        // Because numbers has changed above.
        QuickSort quickSort1 = getInstance(expected1);
        assertArrayEquals(expected1, quickSort1.swap(expected1, 0, 0));
    }
} 
