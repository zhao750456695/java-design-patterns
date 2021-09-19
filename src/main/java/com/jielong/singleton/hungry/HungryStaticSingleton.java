/**
 * projectName: design-pattern
 * fileName: HungryStaticSingleton.java
 * packageName: com.jielong.singleton.hungry
 * date: 2021-09-19 17:55
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.singleton.hungry;

public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungrySingleton;

    static {
        hungrySingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){}

    public static HungryStaticSingleton getInstance() {return hungrySingleton;}
}
