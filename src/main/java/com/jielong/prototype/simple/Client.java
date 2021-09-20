/**
 * projectName: design-pattern
 * fileName: Client.java
 * packageName: com.jielong.prototype.simple
 * date: 2021-09-20 15:13
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.prototype.simple;

public class Client {
    public Prototype startClone(Prototype concretePrototype){
        return concretePrototype.clone();
    }
}
