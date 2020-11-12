package cn.lightzong.prime;

import cn.lightzong.prime.connector.ErichsenSievePort;

import java.util.Arrays;

/**
 * 埃拉托尼斯特筛法
 *
 * @author LightZZ
 * @version 1.0.0
 * @packageName:cn.lightzong.prime
 * @ClassName:ErichsenSieve
 * @date 2020/9/25 20:33
 */
public class ErichsenSieve implements ErichsenSievePort {
    /**
     * primeTable---->素数表
     */
    private boolean[] primeTable;

    public ErichsenSieve() {

    }

    /**
     * 有参构造：
     * 将数组的最大值max传入数组，进行计算并输出max以内的全部素数
     *
     * @param max 数组的长度
     */
    public ErichsenSieve(int max) {
        primeTable = new boolean[max];
        boolean[] booleans = isPrime(max);
        printPrime(booleans);
    }

    /**
     * 假设max以下的所有数全部是素数，根据算法0和1是无法根据倍数剔除，所以要对max以下的0和1进行处理，
     * 先声明其不是素数
     *
     * @param max 数组长度
     * @return primeTable
     */
    @Override
    public boolean[] isPrime(int max) {
        primeTable = new boolean[max];
        Arrays.fill(primeTable, true);
        primeTable[0] = primeTable[1] = false;
        for (int i = 2; i <= Math.sqrt(max); i++) {
            if (primeTable[i]) {
                for (int j = i * i; j < max; j = j + i) {
                    primeTable[j] = false;
                }
            }
        }
        return primeTable;
    }

    @Override
    public void printPrime(boolean[] booleans) {
        //计数器，记录输出的个数
        int counter = 0;
        for (int i = 0; i < booleans.length; i++) {
            if (booleans[i]) {
                System.out.print(i + " ");
                counter++;
                //控制输出，当输出40个数时自动换行
                if (counter % 40 == 0) {
                    System.out.print("\n");
                }
            }
        }
    }
}
