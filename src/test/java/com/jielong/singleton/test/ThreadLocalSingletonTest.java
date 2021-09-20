/**
 * projectName: design-pattern
 * fileName: ThreadLocalSingletonTest.java
 * packageName: com.jielong.singleton.test
 * date: 2021-09-20 10:43
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.singleton.test;

import com.jielong.singleton.threadloacl.ThreadLocalSingleton;

public class ThreadLocalSingletonTest {
    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");
    }
}
