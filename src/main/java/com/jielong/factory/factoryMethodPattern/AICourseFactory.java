/**
 * projectName: design-pattern
 * fileName: AICourseFactory.java
 * packageName: com.jielong.factory.factoryMethodPattern.origin
 * date: 2021-09-19 11:48
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.factory.factoryMethodPattern;

/**
 * @version: V1.0
 * @author: JieZhao
 * @className: AICourseFactory
 * @packageName: com.jielong.factory.factoryMethodPattern.origin
 * @description:
 * @data: 2021-09-19 11:48
 **/
public class AICourseFactory implements ICourseFactory{
    public ICourse create() {
        return new AICourse();
    }
}
