package linkedList;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/** 
* AddTwoNumbers Tester. 
* 
* @author <Authors name> 
* @since <pre>6ÔÂ 1, 2023</pre> 
* @version 1.0 
*/ 
public class AddTwoNumbersTest {
    public ListNode L1Head;
    public ListNode L2Head;
    @Before
    public void before() {
        int[] in1 = new int[]{2, 4, 3};
        int[] in2 = new int[]{5, 6, 4};

        ListNode dummy1 = new ListNode(in1[0]);
        ListNode dummy2 = new ListNode(in2[0]);
        L1Head = dummy1;
        L2Head = dummy2;
        for (int i = 1; i < in1.length; i++) {
            L1Head.next = new ListNode(in1[i]);
            L1Head = L1Head.next;
        }
        L1Head = dummy1;
        for (int i = 1; i < in2.length; i++) {
            L2Head.next = new ListNode(in2[i]);
            L2Head = L2Head.next;
        }
        L2Head = dummy2;
    }

    @Test
    public void testRun() throws Exception {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers(L1Head, L2Head);
        ListNode out = addTwoNumbers.run();
        int[] expected = new int[]{7, 0, 8};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], out.value);
            out = out.next;
        }
    }
} 
