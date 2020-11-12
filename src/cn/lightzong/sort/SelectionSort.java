package cn.lightzong.sort;

import cn.lightzong.sort.connector.SelectionSortPort;

/**
 * 选择排序
 *
 * @author LightZZ
 * @version 1.0.0
 * @packageName:cn.lightzong.sort
 * @ClassName:SelectionSort
 * @date 2020/11/10 16:28
 */
public class SelectionSort implements SelectionSortPort {

    @Override
    public int[] selectionSortAsc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        return array;
    }

    @Override
    public int[] selectionSortDesc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int max = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[max]) {
                    max = j;
                }
            }
            if (i != max) {
                int temp = array[i];
                array[i] = array[max];
                array[max] = temp;
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
