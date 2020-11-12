package cn.lightzong.sort;

import cn.lightzong.sort.connector.ShellSortPort;

/**
 * 希尔排序
 *
 * @author LightZZ
 * @packageName:cn.lightzong.sort
 * @ClassName:ShellSort
 * @date 2020/11/11 14:46
 */
public class ShellSort implements ShellSortPort {

    @Override
    public int[] shellSortAsc(int[] array) {
        int inc;
        for (inc = 1; inc <= array.length / 9; ) {
            inc = 3 * inc + 1;
        }
        for (; inc > 0; inc /= 3) {
            for (int i = inc + 1; i <= array.length; i += inc) {
                int t = array[i - 1];
                int j = i;
                while ((j > inc) && (array[j - inc - 1] > t)) {
                    array[j - 1] = array[j - inc - 1];
                    j -= inc;
                }
                array[j - 1] = t;
            }
        }
        return array;
    }

    @Override
    public int[] shellSortDesc(int[] array) {
        int inc;
        for (inc = 1; inc <= array.length / 9; ) {
            inc = 3 * inc + 1;
        }
        for (; inc > 0; inc /= 3) {
            for (int i = inc + 1; i <= array.length; i += inc) {
                int t = array[i - 1];
                int j = i;
                while ((j > inc) && (array[j - inc - 1] < t)) {
                    array[j - 1] = array[j - inc - 1];
                    j -= inc;
                }
                array[j - 1] = t;
            }
        }
        return array;
    }

    @Override
    public void printArray(int[] array) {
        int counter = 0;
        for (int key : array) {
            System.out.print(key + " ");
            counter++;
            if (counter % 40 == 0) {
                System.out.print("\n");
            }
        }
    }
}
