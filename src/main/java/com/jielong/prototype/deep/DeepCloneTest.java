/**
 * projectName: design-pattern
 * fileName: DeepCloneTest.java
 * packageName: com.jielong.prototype.deep
 * date: 2021-09-20 17:22
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.prototype.deep;

public class DeepCloneTest {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        try {
            QiTianDaSheng clone = (QiTianDaSheng)qiTianDaSheng.clone();
            System.out.println("深克隆：" + (qiTianDaSheng.jinGuBang == clone.jinGuBang));
        }catch (Exception e){
            e.printStackTrace();
        }
        QiTianDaSheng q = new QiTianDaSheng();
        QiTianDaSheng n = q.shallowClone(q);
        System.out.println("浅克隆：" + (q.jinGuBang == n.jinGuBang));
    }
}
