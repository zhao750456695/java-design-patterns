/**
 * projectName: design-pattern
 * fileName: CourseFactory.java
 * packageName: com.jielong.factory.SimpleFactory.improvement2factory
 * date: 2021-09-19 9:36
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.factory.SimpleFactory.improvement2factory;

import com.jielong.factory.SimpleFactory.improvement1interface.ICourse;
import com.jielong.factory.SimpleFactory.improvement1interface.JavaCourse;
import com.jielong.factory.SimpleFactory.improvement3reflection.AICourse;

/**
 * @version: V1.0
 * @author: JieZhao
 * @className: CourseFactory
 * @packageName: com.jielong.factory.SimpleFactory.improvement2factory
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
