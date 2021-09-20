/**
 * projectName: design-pattern
 * fileName: ContainerSingletonTest.java
 * packageName: com.jielong.singleton.test
 * date: 2021-09-20 9:41
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.singleton.test;

import com.jielong.singleton.container.ContainerSingleton;

public class ContainerSingletonTest {
    public static void main(String[] args) {
        Object instance = ContainerSingleton.getBean("com.jielong.singleton.test.Pojo");
        System.out.println(instance);
    }
}
