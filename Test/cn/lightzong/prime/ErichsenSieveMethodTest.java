package cn.lightzong.prime;

import org.junit.Test;

public class ErichsenSieveMethodTest {

    @Test
    public void isPrime() {
        new ErichsenSieve(10);
    }

    @Test
    public void doIsPrime() {
        new ErichsenSieve().printPrime(new ErichsenSieve().isPrime(20));
    }

    @Test
    public void timeTest() {
        int max = 1000000;
        long startTime = System.currentTimeMillis();
        new ErichsenSieve().isPrime(max);
        long endTime = System.currentTimeMillis();
        System.out.println("百万级别数量：埃氏筛法耗时：" + (endTime - startTime) + " ms");
    }
}