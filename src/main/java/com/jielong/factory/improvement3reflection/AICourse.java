/**
 * projectName: design-pattern
 * fileName: AICourse.java
 * packageName: com.jielong.factory.origin
 * date: 2021-09-19 8:59
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.factory.improvement2factory;

import com.jielong.factory.improvement1interface.ICourse;

/**
 * @version: V1.0
 * @author: JieZhao
 * @className: AICourse
 * @packageName: com.jielong.factory.origin
 * @description:
 * @data: 2021-09-19 8:59
 **/
public class AICourse implements ICourse {
    public void record(){
        System.out.println("录制AI课程");
    }
}
