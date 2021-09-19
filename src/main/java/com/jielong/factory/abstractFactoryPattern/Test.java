/**
 * projectName: design-pattern
 * fileName: Test.java
 * packageName: com.jielong.factory.SimpleFactory.origin
 * date: 2021-09-19 8:54
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.factory.abstractFactoryPattern;

import com.jielong.factory.SimpleFactory.origin.Course;

/**
 * @version: V1.0
 * @author: JieZhao
 * @className: Test
 * @packageName: com.jielong.factory.SimpleFactory.origin
 * @description:
 * @data: 2021-09-19 8:54
 **/
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        courseFactory.createNote().edit();
        courseFactory.createVideo().record();
    }
}
