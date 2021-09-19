/**
 * projectName: design-pattern
 * fileName: HungrySingleton.java
 * packageName: com.jielong.singleton.hungry
 * date: 2021-09-19 17:39
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.singleton.hungry;

/**
 * 优点：执行效率高，性能高，没有任何的锁。
 * 缺点：不管什么时候，都会在类加载的时候初始化，即使用不到。在某些情况下，会造成内存浪费。
 */
public class HungrySingleton {
    // 在类加载的时候，立刻初始化
    private static final HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getInstance(){return  hungrySingleton;}
}
