/**
 * projectName: design-pattern
 * fileName: JinGuBang.java
 * packageName: com.jielong.prototype.deep
 * date: 2021-09-20 16:35
 * copyright(c) 2017-2020 xxx公司
 */
package com.jielong.prototype.deep;

import java.io.Serializable;

public class JinGuBang implements Serializable {
    public float h = 100;
    public float d = 10;

    public void big(){
        this.d *= 2;
        this.h *= 2;
    }

    public void small(){
        this.d /= 2;
        this.h /= 2;
    }
}
