/**
 * projectName: design-pattern
 * fileName: CourseFactory.java
 * packageName: com.jielong.factory.improvement2factory
 * date: 2021-09-19 9:36
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.factory.improvement2factory;

import com.jielong.factory.improvement1interface.ICourse;
import com.jielong.factory.improvement1interface.JavaCourse;


/**
 * @version: V1.0
 * @author: JieZhao
 * @className: CourseFactory
 * @packageName: com.jielong.factory.improvement2factory
 * @description: \
 * @data: 2021-09-19 9:36
 **/
public class CourseFactory {
    public ICourse create(String name){
        if ("java".equals(name)){
            return new JavaCourse();
        }else if ("AI".equals(name)){
            return new AICourse();
        }else {
            return null;
        }
    }
}
