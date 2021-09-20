/**
 * projectName: design-pattern
 * fileName: PrototypeTest.java
 * packageName: com.jielong.singleton.test
 * date: 2021-09-20 15:09
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.singleton.test;

import com.jielong.prototype.simple.Client;
import com.jielong.prototype.simple.ConcretePrototypeA;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {
    public static void main(String[] args) {
        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
        concretePrototype.setAge(18);
        concretePrototype.setName("xiaoshizi");
        List hobbies = new ArrayList<String>();
        concretePrototype.setHobbies(hobbies);

        Client client = new Client();
        ConcretePrototypeA copy = (ConcretePrototypeA)client.startClone(concretePrototype);
        // 不用client也是可以的，用client更真实模仿现实场景
        System.out.println(concretePrototype.clone());
        System.out.println(copy);
        System.out.println("克隆对象中引用类型地址的值：" + copy.getHobbies());
        System.out.println("原对象中引用类型地址的值：" + concretePrototype.getHobbies());
        System.out.println("对象地址比较：" + (copy.getHobbies() == concretePrototype.getHobbies()));
    }
}
