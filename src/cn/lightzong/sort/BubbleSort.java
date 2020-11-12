package cn.lightzong.sort;

import cn.lightzong.sort.connector.BubbleSortPort;

/**
 * 冒泡排序
 *
 * @author LightZZ
 * @version 1.0.0
 * @packageName:cn.lightzong.sort
 * @ClassName:BubbleSort
 * @date 2020/10/28 14:30
 */
public class BubbleSort implements BubbleSortPort {

    @Override
    public int[] bubbleSortAsc(int[] array) {
        //定义外层循环，用于对冒泡排序轮数作以记录
        for (int i = 0; i < array.length; i++) {
            //定义内层循环，用于实现冒泡排序算法的核心部分
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    @Override
    public int[] bubbleSortDesc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
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
