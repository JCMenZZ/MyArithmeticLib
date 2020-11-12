package cn.lightzong.sort;

import org.junit.Test;

public class StringSortTest {

    @Test
    public void stringSort() {
        String numStr = "20 78 9 -7 88 36 29";
        System.out.println(numStr);
        numStr = new StringSort().stringSort(numStr);
        System.out.println(numStr);
    }

    @Test
    public void intArrayToString() {
        int[] intsArray = new int[]{20, 78, 9, -7, 88, 36, 29};
        System.out.println(new StringSort().intArrayToString(intsArray));
    }

    @Test
    public void arrayStringToInt() {
        String[] stringsArray = new String[]{"20", "78", "9", "-7", "88", "36", "29"};
        for (int i : new StringSort().stringArrayToIntArray(stringsArray)) {
            System.out.print(i + " ");
        }
    }

    @Test
    public void stringToStringArray() {
        String numStr = "20 78 9 -7 88 36 29";
        for (String str : new StringSort().stringToStringArray(numStr)) {
            System.out.print(str + " ");
        }
    }

}