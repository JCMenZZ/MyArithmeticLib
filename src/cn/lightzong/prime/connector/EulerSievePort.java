package cn.lightzong.prime.connector;

/**
 * @author LightZZ
 * @packageName:cn.lightzong.prime.connector
 * @ClassName:EulerSievePort
 * @Description:欧拉筛法接口
 * @date 2020/11/4 15:07
 */
public interface EulerSievePort {
    /**
     * 方法isPrime()：判断是否为素数
     *
     * @param max 规定存放max以下的全部素数
     * @return 返回素数表(boolean类型的数组)
     */
    int[] isPrime(int max);

    /**
     * 遍历数组并输出满足条件的数
     *
     * @param primeTable int类型的素数表
     */
    void printPrime(int[] primeTable);
}
