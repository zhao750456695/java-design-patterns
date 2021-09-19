/**
 * projectName: design-pattern
 * fileName: AINote.java
 * packageName: com.jielong.factory.abstractFactoryPattern
 * date: 2021-09-19 13:35
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.factory.abstractFactoryPattern;

/**
 * @version: V1.0
 * @author: JieZhao
 * @className: AINote
 * @packageName: com.jielong.factory.abstractFactoryPattern
 * @description:
 * @data: 2021-09-19 13:35
 **/
public class AINote implements INote {
    public void edit() {
        System.out.println("编辑AI笔记");
    }
}
