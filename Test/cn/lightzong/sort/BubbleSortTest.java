package cn.lightzong.sort;

import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void bubbleSortAsc() {
        int[] arr = {9, 8, 3, 5, 2};
        new BubbleSort().printArray(new BubbleSort().bubbleSortAsc(arr));
    }

    @Test
    public void bubbleSortDesc() {
        int[] arr = {9, 8, 3, 5, 2};
        new BubbleSort().printArray(new BubbleSort().bubbleSortDesc(arr));
    }
}