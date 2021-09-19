/**
 * projectName: design-pattern
 * fileName: CourseFactory.java
 * packageName: com.jielong.factory.SimpleFactory.improvement2factory
 * date: 2021-09-19 9:36
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.factory.SimpleFactory.improvement3reflection;

import com.jielong.factory.SimpleFactory.improvement1interface.ICourse;


/**
 * @version: V1.0
 * @author: JieZhao
 * @className: CourseFactory
 * @packageName: com.jielong.factory.SimpleFactory.improvement2factory
 * @description: \
 * @data: 2021-09-19 9:36
 **/
public class CourseFactory {
    public ICourse create(String className){
        try {
            if (!(null == className || "".equals(className))){
                return (ICourse)Class.forName(className).newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
