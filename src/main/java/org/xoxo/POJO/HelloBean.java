package org.xoxo.POJO;

import org.xoxo.daimon.Hello;
import org.xoxo.daimon.IHello;

public class HelloBean {
    private String hello;
    private IHello iHello;

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public void display() {
        iHello.display(hello);
    }

    public IHello getiHello() {
        return iHello;
    }

    public void setiHello(Hello iHello) {
        this.iHello = iHello;
    }
}
