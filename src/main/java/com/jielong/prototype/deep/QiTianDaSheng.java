/**
 * projectName: design-pattern
 * fileName: QiTianDaSheng.java
 * packageName: com.jielong.prototype.deep
 * date: 2021-09-20 16:36
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.prototype.deep;

import java.io.*;
import java.util.Date;

public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {
    public JinGuBang jinGuBang;
    public QiTianDaSheng(){
        // 只是初始化
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }

    // 每个猴子的金箍棒都是不同的，要进行深克隆
    // 克隆方法，采用的是深克隆
    // 可能会出现单例的问题，解决：返回INSTANCE;单例不实现Cloneable接口;新增readResolve()方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    public Object deepClone(){
        try {
            // 对象字节码的直接克隆
            // 内存中完成操作，对象读写，是通过字节码直接操作
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            // 字节码写磁盘
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            // 完整的新的对象，new出来一个对象
            QiTianDaSheng copy = (QiTianDaSheng)ois.readObject();
            // 每个猴子的生日不一样，都重新赋值了
            copy.birthday = new Date();
            return copy;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public QiTianDaSheng shallowClone(QiTianDaSheng target){
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        qiTianDaSheng.height = target.height;
        qiTianDaSheng.weight = target.height;
        qiTianDaSheng.jinGuBang = target.jinGuBang;
        qiTianDaSheng.birthday = new Date();
        return qiTianDaSheng;
    }
}
