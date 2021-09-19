/**
 * projectName: design-pattern
 * fileName: LazySimpleSingleton.java
 * packageName: com.jielong.singleton.lazy
 * date: 2021-09-19 18:01
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.singleton.lazy;

/**
 * 优点：节省内存
 * 缺点：线程不安全。可能存在两个线程同时调用getInstance()方法,有可能同时创建两个实例
 */
public class LazySimpleSingleton {
    private static LazySimpleSingleton instance;
    private LazySimpleSingleton(){}
    public synchronized static LazySimpleSingleton getInstance(){
        if (instance == null) {
            instance = new LazySimpleSingleton();
        }
        return instance;
    }
}
