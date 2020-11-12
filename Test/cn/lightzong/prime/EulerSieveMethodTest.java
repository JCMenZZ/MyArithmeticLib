package cn.lightzong.prime;

import org.junit.Test;

public class EulerSieveMethodTest {
    @Test
    public void timeTest() {
        int max = 1000000;
        long startTime = System.currentTimeMillis();
        new EulerSieve().isPrime(max);
        long endTime = System.currentTimeMillis();
        System.out.println("百万级别数量：欧拉筛法耗时：" + (endTime - startTime) + " ms");
    }

    @Test
    public void isPrime() {
        new EulerSieve(10);
    }

    @Test
    public void printPrime() {
    }
}