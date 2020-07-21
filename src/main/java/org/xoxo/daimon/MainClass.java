package org.xoxo.daimon;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.xoxo.POJO.CalculateBean;
import org.xoxo.POJO.HelloBean;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        String configLocation = "classpath:HelloBeanCTX.xml";

        AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
        HelloBean hello = ctx.getBean("helloBean", HelloBean.class);
        hello.display();

        configLocation = "classpath:CalculateCTX.xml";
        ctx = new GenericXmlApplicationContext(configLocation);
        CalculateBean calculate = ctx.getBean("calBean", CalculateBean.class);
        calculate.setNum1(new Scanner(System.in).nextInt());
        calculate.setNum2(new Scanner(System.in).nextInt());
        calculate.sum();
        calculate.avg();
    }
}
