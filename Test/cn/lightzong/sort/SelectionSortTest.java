package cn.lightzong.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionSortTest {

    @Test
    public void selectionSortAsc() {
        int[] array = new int[]{7, 9, -5, 12, 39, 45, 11, -24, 1, 30};
        new SelectionSort().printArray(new SelectionSort().selectionSortAsc(array));
    }

    @Test
    public void selectionSortDesc() {
        int[] array = new int[]{7, 9, -5, 12, 39, 45, 11, -24, 1, 30};
        System.out.println();
        new SelectionSort().printArray(new SelectionSort().selectionSortDesc(array));
    }
}