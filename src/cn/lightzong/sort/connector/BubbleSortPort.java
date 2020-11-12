package cn.lightzong.sort.connector;

/**
 * @author LightZZ
 * @packageName:cn.lightzong.sort.connector
 * @ClassName:BubbleSortPort
 * @Description:冒泡排序算法接口
 * @date 2020/10/28 14:30
 */
public interface BubbleSortPort {
    /**
     * 冒泡升序排序（整型）
     *
     * @param array 类型为int型的数组
     * @return 返回排好序的数组
     */
    int[] bubbleSortAsc(int[] array);

    /**
     * 冒泡逆序排序（整型）
     *
     * @param array 类型为int型的数组
     * @return 返回排好序的数组
     */
    int[] bubbleSortDesc(int[] array);

    /**
     * 输出排好序的数组
     *
     * @param array 整型数组
     */
    void printArray(int[] array);
}
