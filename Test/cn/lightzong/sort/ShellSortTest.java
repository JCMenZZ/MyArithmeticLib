package cn.lightzong.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShellSortTest {

    @Test
    public void shellSortAsc() {
        int[] array = new int[]{7, 9, -5, 12, 39, 45, 11, -24, 1, 30, 23, 55, 99};
        new ShellSort().printArray(new ShellSort().shellSortAsc(array));
    }

    @Test
    public void shellSortDesc() {
        int[] array = new int[]{7, 9, -5, 12, 39, 45, 11, -24, 1, 30, 23, 55, 99};
        new ShellSort().printArray(new ShellSort().shellSortDesc(array));
    }
}