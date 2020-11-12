package cn.lightzong.prime.connector;

/**
 * @author LightZZ
 * @packageName:cn.lightzong.prime.connector
 * @ClassName:ErichsenSievePort
 * @Description:埃氏筛法接口
 * @date 2020/9/25 20:33
 */
public interface ErichsenSievePort {
    /**
     * 方法isPrime()：判断是否为素数
     *
     * @param max 规定存放max以下的全部素数
     * @return 返回素数表(boolean类型的数组)
     */
    boolean[] isPrime(int max);

    /**
     * 遍历数组并输出满足条件的数
     *
     * @param booleans 素数表(boolean类型的数组)
     */
    void printPrime(boolean[] booleans);
}
