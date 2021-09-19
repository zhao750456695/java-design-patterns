/**
 * projectName: design-pattern
 * fileName: ExectorThread.java
 * packageName: com.jielong.singleton.test
 * date: 2021-09-19 18:28
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.singleton.test;

import com.jielong.singleton.lazy.LazyDoubleCheckSingleton;
import com.jielong.singleton.lazy.LazySimpleSingleton;

public class ExectorThread implements Runnable {
    public void run(){
        // LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" +instance);
    }
}
