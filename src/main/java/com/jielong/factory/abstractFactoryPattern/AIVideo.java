/**
 * projectName: design-pattern
 * fileName: AIVideo.java
 * packageName: com.jielong.factory.abstractFactoryPattern
 * date: 2021-09-19 13:34
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.factory.abstractFactoryPattern;

/**
 * @version: V1.0
 * @author: JieZhao
 * @className: AIVideo
 * @packageName: com.jielong.factory.abstractFactoryPattern
 * @description:
 * @data: 2021-09-19 13:34
 **/
public class AIVideo implements IVideo{
    public void record() {
        System.out.println("录制AI视频");
    }
}
