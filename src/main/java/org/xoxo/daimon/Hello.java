package org.xoxo.daimon;

public class Hello implements IHello {
    @Override
    public void display(String str) {
        System.out.println(str);
    }
}
