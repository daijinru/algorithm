package sort;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertArrayEquals;

/** 
* QuickSort Tester. 
* 
* @author <Authors name> 
* @since <pre>12ÔÂ 28, 2022</pre> 
* @version 1.0 
*/ 
public class QuickSortTest {

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
    }


    /**
    *
    * Method: quickSort(Integer[] numbers, Integer start, Integer end)
    *
    */
    @Test
    public void testQuickSort() throws Exception {
    }

    /**
    *
    * Method: partition(Integer[] numbers, Integer start, Integer end)
    *
    */
    @Test
    public void testPartition() throws Exception {
    }

    /**
    *
    * Method: swap(Integer[] numbers, Integer index1, Integer index2)
    *
    */
    @Test
    public void testSwap() throws Exception {
        Integer[] numbers = new Integer[]{4, 1, 5, 6, 2, 7, 8, 3};
        QuickSort quickSort = new QuickSort(numbers);
        Integer[] expected = new Integer[]{1, 4, 5, 6, 2, 7, 8, 3};
        assertArrayEquals(expected, quickSort.swap(numbers, 0, 1));

        Integer[] expected1 = new Integer[]{4, 1, 5, 6, 2, 7, 8, 3};
        // Because numbers has changed above.
        QuickSort quickSort1 = new QuickSort(expected1);
        assertArrayEquals(expected1, quickSort.swap(expected1, 0, 0));
    }
} 
