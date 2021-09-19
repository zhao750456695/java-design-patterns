/**
 * projectName: design-pattern
 * fileName: Test.java
 * packageName: com.jielong.factory.origin
 * date: 2021-09-19 8:54
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.factory.improvement2factory;

import com.jielong.factory.improvement1interface.ICourse;

/**
 * @version: V1.0
 * @author: JieZhao
 * @className: Test
 * @packageName: com.jielong.factory.origin
 * @description:
 * @data: 2021-09-19 8:54
 **/
public class Test {
    public static void main(String[] args) {
        ICourse course = new CourseFactory().create("java");
        course.record();
    }
}
