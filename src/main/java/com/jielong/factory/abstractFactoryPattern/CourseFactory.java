/**
 * projectName: design-pattern
 * fileName: CourseFactory.java
 * packageName: com.jielong.factory.abstractFactoryPattern
 * date: 2021-09-19 13:29
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.factory.abstractFactoryPattern;

public abstract class CourseFactory {

    // 初始化基础数据
    public void init(){
        System.out.println("初始化基础数据");
    }

    // 课程必须有笔记
    protected abstract INote createNote();

    // 视频
    protected abstract IVideo createVideo();
}
