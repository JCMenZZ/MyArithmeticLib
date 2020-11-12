package cn.lightzong.sort.connector;

/**
 * @author LightZZ
 * @packageName:cn.lightzong.sort.connector
 * @ClassName:SelectionSortPort
 * @Description:选择排序算法接口
 * @date 2020/11/10 16:52
 */
public interface SelectionSortPort {
    /**
     * 选择升序排序（整型）
     *
     * @param array int型数组
     * @return 返回排好序的数组
     */
    int[] selectionSortAsc(int[] array);

    /**
     * 选择降序排序（整型）
     *
     * @param array int型数组
     * @return 返回排好序的数组
     */
    int[] selectionSortDesc(int[] array);

    /**
     * 输出排好序的数组
     *
     * @param array 整型数组
     */
    void printArray(int[] array);
}
