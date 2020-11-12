package cn.lightzong.sort.connector;

/**
 * @author LightZZ
 * @packageName:cn.lightzong.sort.connector
 * @ClassName:StraightInsertionSortPort
 * @Description:直接插入排序接口
 * @date 2020/11/11 10:49
 */
public interface StraightInsertionSortPort {
    /**
     * 直接插入升序排序
     *
     * @param array int型数组
     * @return 返回排好序的数组
     */
    int[] directInsertionSortAsc(int[] array);

    /**
     * 直接插入降序排序
     *
     * @param array int型数组
     * @return 返回排好序的数组
     */
    int[] directInsertionSortDesc(int[] array);

    /**
     * 输出排好序的数组
     *
     * @param array 整型数组
     */
    void printArray(int[] array);
}
