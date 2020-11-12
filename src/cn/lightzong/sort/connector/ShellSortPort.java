package cn.lightzong.sort.connector;

/**
 * @author LightZZ
 * @packageName:cn.lightzong.sort.connector
 * @ClassName:ShellSortPort
 * @Description:希尔排序算法接口
 * @date 2020/11/11 14:46
 */
public interface ShellSortPort {
    /**
     * @param array
     * @return
     */
    int[] shellSortAsc(int[] array);

    /**
     * @param array
     * @return
     */
    int[] shellSortDesc(int[] array);

    /**
     * 输出排好序的数组
     *
     * @param array 整型数组
     */
    void printArray(int[] array);
}
