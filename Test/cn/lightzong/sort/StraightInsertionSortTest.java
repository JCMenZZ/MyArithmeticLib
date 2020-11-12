package cn.lightzong.sort;

import org.junit.Test;

public class StraightInsertionSortTest {

    @Test
    public void directInsertionSortAsc() {
        int[] array = new int[]{7, 9, -5, 12, 39, 45, 11, -24, 1, 30};
        new StraightInsertionSort().printArray(new StraightInsertionSort().directInsertionSortAsc(array));
    }

    @Test
    public void directInsertionSortDesc() {
        int[] array = new int[]{7, 9, -5, 12, 39, 45, 11, -24, 1, 30};
        new StraightInsertionSort().printArray(new StraightInsertionSort().directInsertionSortDesc(array));
    }
}