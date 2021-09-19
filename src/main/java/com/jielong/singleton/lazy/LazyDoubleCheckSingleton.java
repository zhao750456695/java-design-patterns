package com.jielong.singleton.lazy;

public class LazyDoubleCheckSingleton {
    private static LazyDoubleCheckSingleton instance;
    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance(){
        // 检查是否要阻塞
        if (instance == null){
            synchronized (LazyDoubleCheckSingleton.class){
                // 检查是否要重新创建实例
                if (instance == null){
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
