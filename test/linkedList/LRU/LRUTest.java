package linkedList.LRU;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/** 
* LRU Tester. 
* 
* @author <Authors name> 
* @since <pre>3ÔÂ 23, 2023</pre> 
* @version 1.0 
*/ 
public class LRUTest {
    public LRU lru = new LRU(3);
    @Before
    public void before() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        for (int i = 0; i < input.size(); i++) {
            lru.put(input.get(i), input.get(i));
        }
    }

    @Test
    public void run() throws Exception {
        assertEquals(new Integer(-1), lru.get(1));
        assertEquals(new Integer(6), lru.get(6));
        DoubleList dbl = lru.cache;
        Node<Integer> head = dbl.head;
        assertEquals(new Integer(6), head.value);
        Node<Integer> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        // get last node
        assertEquals(new Integer(4), temp.value);

        assertEquals(new Integer(4), lru.get(4));
        Node<Integer> head_2 = lru.cache.head;
        assertEquals(new Integer(4), head_2.value);
        Node<Integer> temp_2 = head_2;
        while (temp_2.next != null) {
            temp_2 = temp_2.next;
        }
        // get last node
        assertEquals(new Integer(5), temp_2.value);

        // remove last node
        lru.put(3, 3);
        assertEquals(3, lru.cache.size);
        assertEquals(3, lru.map.size());

        Node<Integer> head_3 = lru.cache.head;
        // get new head
        assertEquals(new Integer(3), lru.get(3));
        Node<Integer> temp_3 = head_3;
        while (temp_3.next != null) {
            temp_3 = temp_3.next;
        }
        // get last node
        assertEquals(new Integer(6), temp_3.value);
    }

} 
