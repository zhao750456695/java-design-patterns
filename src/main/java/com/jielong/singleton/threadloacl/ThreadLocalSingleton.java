/**
 * projectName: design-pattern
 * fileName: ThreadLocalSingleton.java
 * packageName: com.jielong.singleton.threadloacl
 * date: 2021-09-20 9:40
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.singleton.threadloacl;

public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }
}
