package cn.lightzong.sort;

import cn.lightzong.sort.connector.StraightInsertionSortPort;

/**
 * 直接插入排序
 *
 * @author LightZZ
 * @packageName:cn.lightzong.sort
 * @ClassName:StraightInsertionSort
 * @date 2020/11/11 10:48
 */
public class StraightInsertionSort implements StraightInsertionSortPort {

    @Override
    public int[] directInsertionSortAsc(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while ((j > 0) && (array[j - 1] > temp)) {
                array[j] = array[j - 1];
                --j;
            }
            array[j] = temp;
        }
        return array;
    }

    @Override
    public int[] directInsertionSortDesc(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while ((j > 0) && (array[j - 1] < temp)) {
                array[j] = array[j - 1];
                --j;
            }
            array[j] = temp;
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
