package cn.lightzong.sort;

import cn.lightzong.sort.connector.StringSortPort;

import java.util.Arrays;

/**
 * 字符串排序
 *
 * @author LightZZ
 * @version 1.0.0
 * @packageName:cn.lightzong.sort
 * @ClassName:StringSort
 * @date 2020/10/30 14:06
 */
public class StringSort implements StringSortPort {
    protected static final String SPACE_SEPARATOR = " ";

    /**
     * 字符串排序驱动 排序方法如下：
     * 1.将字符串变成字符串数组
     * 2.将字符串数组变成int数组
     * 3.对int数组进行排序
     * 4.将排序后的数组变成字符串
     *
     * @param string 待排序的字符串
     * @return 排好序的字符串
     */
    @Override
    public String stringSort(String string) {
        String[] stringArray = stringToStringArray(string);
        int[] intArray = stringArrayToIntArray(stringArray);
        sortIntArrayAsc(intArray);
        return intArrayToString(intArray);
    }

    @Override
    public String intArrayToString(int[] intsArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < intsArray.length; i++) {
            if (i != intsArray.length - 1) {
                stringBuilder.append(intsArray[i]).append(SPACE_SEPARATOR);
            } else {
                stringBuilder.append(intsArray[i]);
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public int[] stringArrayToIntArray(String[] stringsArray) {
        int[] intsArray = new int[stringsArray.length];
        for (int i = 0; i < intsArray.length; i++) {
            intsArray[i] = Integer.parseInt(stringsArray[i]);
        }
        return intsArray;
    }

    @Override
    public String[] stringToStringArray(String string) {
        return string.split(SPACE_SEPARATOR);
    }

    @Override
    public void sortIntArrayAsc(int[] intsArray) {
        Arrays.sort(intsArray);
    }
}
