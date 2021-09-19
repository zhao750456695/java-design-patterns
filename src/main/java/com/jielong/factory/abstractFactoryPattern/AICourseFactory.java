/**
 * projectName: design-pattern
 * fileName: AICourseFactory.java
 * packageName: com.jielong.factory.abstractFactoryPattern
 * date: 2021-09-19 13:37
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.factory.abstractFactoryPattern;

/**
 * @version: V1.0
 * @author: JieZhao
 * @className: AICourseFactory
 * @packageName: com.jielong.factory.abstractFactoryPattern
 * @description:
 * @data: 2021-09-19 13:37
 **/
public class AICourseFactory extends CourseFactory {

    protected INote createNote() {
        super.init();
        return new AINote();
    }

    protected IVideo createVideo() {
        super.init();
        return new AIVideo();
    }
}
