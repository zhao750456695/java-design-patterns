/**
 * projectName: design-pattern
 * fileName: CourseFactory.java
 * packageName: com.jielong.factory.SimpleFactory.improvement2factory
 * date: 2021-09-19 9:36
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.factory.factoryMethodPattern;


/**
 * @version: V1.0
 * @author: JieZhao
 * @className: CourseFactory
 * @packageName: com.jielong.factory.SimpleFactory.improvement2factory
 * @description: \
 * @data: 2021-09-19 9:36
 **/
public class JavaCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new JavaCourse();
    }
}
