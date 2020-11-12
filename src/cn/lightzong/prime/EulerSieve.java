package cn.lightzong.prime;


import cn.lightzong.prime.connector.EulerSievePort;

import java.util.Arrays;

/**
 * 欧拉筛法
 *
 * @author LightZZ
 * @version 1.0.0
 * @packageName:cn.lightzong.prime
 * @ClassName:EulerSieve
 * @date 2020/11/4 15:07
 */
public class EulerSieve implements EulerSievePort {
    private static final int MAX = 999999999;
    //TODO 需要改进（与埃氏筛法的实现代码进行匹配）
    /**
     * subscript ---->数组下标，
     * mark      ---->boolean类型的标记表，
     * primeTable---->int类型的素数表，
     */
    private int subscript = 0;
    private final boolean[] mark = new boolean[MAX];
    private int[] primeTable;

    public EulerSieve() {

    }

    /**
     * 有参构造
     *
     * @param max 计算max以内的全部素数
     */
    public EulerSieve(int max) {
        primeTable = new int[max];
        int[] ints = isPrime(max);
        printPrime(ints);
    }

    /**
     * 该算法还有不足之处，欢迎指正修改
     *
     * @return 返回素数组成的数组
     */
    @Override
    public int[] isPrime(int max) {
        primeTable = new int[max];
        Arrays.fill(mark, false);
        Arrays.fill(primeTable, 0);
        for (int i = 2; i <= max; i++) {
            if (!mark[i]) {
                primeTable[subscript++] = i;
            }
            for (int j = 0; j < subscript && i * primeTable[j] <= max; j++) {
                mark[i * primeTable[j]] = true;
                if (i % primeTable[j] == 0) {
                    break;
                }
            }
        }
        return primeTable;
    }

    @Override
    public void printPrime(int[] primeTable) {
        int counter = 0;
        for (int i : primeTable) {
            if (i != 0) {
                System.out.print(i + " ");
                counter++;
                if (counter % 40 == 0) {
                    System.out.print("\n");
                }
            }
        }
    }
}
