/**
 * projectName: design-pattern
 * fileName: JavaCourseFactory.java
 * packageName: com.jielong.factory.abstractFactoryPattern
 * date: 2021-09-19 13:35
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.factory.abstractFactoryPattern;

public class JavaCourseFactory extends CourseFactory{

    protected INote createNote() {
        super.init();
        return new JavaNote();
    }

    protected IVideo createVideo() {
        super.init();
        return new JavaVideo();
    }
}
