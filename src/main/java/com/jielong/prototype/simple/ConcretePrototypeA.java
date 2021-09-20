/**
 * projectName: design-pattern
 * fileName: ConcretePrototypeA.java
 * packageName: com.jielong.prototype.simple
 * date: 2021-09-20 15:04
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.prototype.simple;

import java.util.List;

public class ConcretePrototypeA implements Prototype {

    private int age; // 年龄

    private String name; // 姓名

    private List hobbies;

    public Prototype clone() {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        concretePrototypeA.setAge(this.age);
        concretePrototypeA.setName(this.name);
        concretePrototypeA.setHobbies(this.hobbies);
        return concretePrototypeA;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }
}
