/**
 * projectName: design-pattern
 * fileName: EnumSingleton.java
 * packageName: com.jielong.singleton.register
 * date: 2021-09-20 8:24
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.singleton.register;

public enum  EnumSingleton {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    // 全局访问点
    public static EnumSingleton getInstance(){return INSTANCE;}
}
