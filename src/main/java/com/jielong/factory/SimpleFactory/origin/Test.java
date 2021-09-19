/**
 * projectName: design-pattern
 * fileName: Test.java
 * packageName: com.jielong.factory.SimpleFactory.origin
 * date: 2021-09-19 8:54
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.factory.SimpleFactory.origin;

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
        Course course = new Course();
        course.record();
        AICourse aiCourse = new AICourse();
        course.record();
    }
}
