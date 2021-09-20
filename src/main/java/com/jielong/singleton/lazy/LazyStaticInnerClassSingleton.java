/**
 * projectName: design-pattern
 * fileName: LazyStaticInnerClassSingleton.java
 * packageName: com.jielong.singleton.lazy
 * date: 2021-09-19 20:18
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.singleton.lazy;

public class LazyStaticInnerClassSingleton {

    private LazyStaticInnerClassSingleton(){
        if (LazyHolder.INSTANCE != null) {
            throw new RuntimeException("无法非法访问");
        }
    }

    private static LazyStaticInnerClassSingleton getInstance(){
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }
}
