package org.example;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class HeapSortTest {

    HeapSort hs = new HeapSort();

    @Test
    public void testHeapSort_Basic(){
        int[] arr = {3, 4, 100, 22, -12, 89};
        hs.sort(arr);
        int[] sortedArray = {-12, 3, 4, 22, 89, 100};
        assertArrayEquals(sortedArray, arr);
    }

    @Test
    public void testHeapSort_AlreadySortedArray(){
        int[] arr = {1,2,3,4,5};
        hs.sort(arr);
        assertArrayEquals(new int[]{1,2,3,4,5}, arr);
    }

    @Test
    public void testHeapSort_SortReverseArray(){
        int[] arr = {5, 4, 3, 2, 1};
        hs.sort(arr);
        assertArrayEquals(new int[]{1,2,3,4,5}, arr);
    }

    @Test
    public void testHeapSort_DuplicateElements(){
        int[] arr = {10, 2, 3, 7, 2, 7, 4, 3, 1};
        hs.sort(arr);
        assertArrayEquals(new int[]{1,2,2,3,3,4,7,7,10}, arr);
    }

    @Test
    public void testHeapSort_EmptyArray(){
        int[] arr = {};
        hs.sort(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    public void testHeapSort_NullInput(){
        int[] arr = null;
        hs.sort(arr);
        assertNull(arr);
    }

    @Test
    public void testHeapSort_LargeArray(){
        int[] largeArray = new int[10000];
        for (int i = 0; i < 10000; i++) {
            largeArray[i] = 10000 - i; //reverse order array
        }
        hs.sort(largeArray);
        for (int i = 0; i < 9999; i++) {
            // Asserting that each element is less than or equal to the next one
            assertTrue(largeArray[i] <= largeArray[i + 1]);
        }
    }



    //additional test cases added
    @Test
    public void testHeapSort_SingleElementArray(){
        int[] arr = {24};
        hs.sort(arr);
        assertArrayEquals(new int[]{24}, arr);
    }

    @Test
    public void testHeapSort_AllSameElements(){
        int[] arr = {2, 2, 2, 2, 2};
        hs.sort(arr);
        assertArrayEquals(new int[]{2, 2, 2,2,2}, arr);
    }

    @Test
    public void testHeapSort_LargeNumbers(){
        int[] largeNumbersArray = new int[]{133456790, 2378904, 789095905, 883838408, 575937593 };
        hs.sort(largeNumbersArray);
        int[] sortedLargedNumbersArray = new int[]{2378904, 133456790, 575937593, 789095905, 883838408 };
        assertArrayEquals(sortedLargedNumbersArray, largeNumbersArray);
    }

    @Test
    public void testHeapSort_TwoElementsArray(){
        int[] twoElementsArray = new int[]{42, 24};
        hs.sort(twoElementsArray);
        int[] sortedArray = new int[]{24, 42};
        assertArrayEquals(sortedArray, twoElementsArray);
    }




}
