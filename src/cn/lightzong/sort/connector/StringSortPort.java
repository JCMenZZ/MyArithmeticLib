package cn.lightzong.sort.connector;

/**
 * @author LightZZ
 * @packageName:cn.lightzong.sort.connector
 * @ClassName:StringSortPort
 * @Description:字符串排序算法接口
 * @date 2020/10/30 14:06
 */
public interface StringSortPort {
    /**
     * 字符串排序
     *
     * @param string 待排序的字符串
     * @return 排好序的字符串
     */
    String stringSort(String string);

    /**
     * 将int型数组转换为字符串
     *
     * @param intsArray int型数组
     * @return 转换好的字符串
     */
    String intArrayToString(int[] intsArray);

    /**
     * 将String型数组转换为int型数组
     *
     * @param stringsArray String型数组
     * @return 转换好的int型数组
     */
    int[] stringArrayToIntArray(String[] stringsArray);

    /**
     * 将String字符串转换为字符串数组
     *
     * @param string 字符串
     * @return 转换好的String数组
     */
    String[] stringToStringArray(String string);

    /**
     * 对int型数组进行排序（升序）
     *
     * @param intsArray int型数组
     */
    void sortIntArrayAsc(int[] intsArray);
}
