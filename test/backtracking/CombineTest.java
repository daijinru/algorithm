package backtracking;

import array.Array;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

/** 
* Combine Tester. 
* 
* @author <Authors name> 
* @since <pre>2ÔÂ 13, 2023</pre> 
* @version 1.0 
*/ 
public class CombineTest { 

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
    Combine combine = new Combine(3, 2);
    System.out.println(combine.run());
    LinkedList<LinkedList<Integer>> actual = combine.run();
    LinkedList<LinkedList<Integer>> expected = new LinkedList<>();
    expected.add(new LinkedList<>(Arrays.asList(2, 3)));
    expected.add(new LinkedList<>(Arrays.asList(1, 3)));
    expected.add(new LinkedList<>(Arrays.asList(1, 2)));
    assertArrayEquals(expected.toArray(), actual.toArray());
}

/**
* 
* Method: helper(int n, int k, int i, LinkedList<Integer> subsets, LinkedList<LinkedList<Integer>> result) 
* 
*/ 
@Test
public void testHelper() throws Exception { 
//TODO: Test goes here... 
} 


} 
