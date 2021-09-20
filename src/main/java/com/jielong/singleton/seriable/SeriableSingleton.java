/**
 * projectName: design-pattern
 * fileName: SeriableSingleton.java
 * packageName: com.jielong.singleton.seriable
 * date: 2021-09-20 9:57
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.singleton.seriable;

import java.io.Serializable;

public class SeriableSingleton implements Serializable {
    public final static SeriableSingleton INSTANCE = new SeriableSingleton();
    private  SeriableSingleton(){}
    public static SeriableSingleton getInstance(){
        return INSTANCE;
    }
    private Object readResolve(){
        return INSTANCE;
    }
}
