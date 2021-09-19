/**
 * projectName: design-pattern
 * fileName: LazySimpleSingletonTest.java
 * packageName: com.jielong.singleton.test
 * date: 2021-09-19 18:30
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.singleton.test;

public class LazySimpleSingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");
    }
}
