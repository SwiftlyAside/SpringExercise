package org.xoxo.daimon;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xoxo.POJO.HelloBean;
import org.xoxo.POJO.Member;

public class MainClass {
    public static void main(String[] args) {
        String configLocation = "classpath:HelloBeanCTX.xml";
        String calConfigLocation = "classpath:CalculateCTX.xml";
        String memberConfigLocation = "classpath:MemberBeanCTX.xml";

        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(configLocation, calConfigLocation, memberConfigLocation);
        HelloBean hello = ctx.getBean("helloBean", HelloBean.class);
        hello.display();
/*
        CalculateBean calculate = ctx.getBean("calBean", CalculateBean.class);
        calculate.setNum1(new Scanner(System.in).nextInt());
        calculate.setNum2(new Scanner(System.in).nextInt());
        calculate.sum();
        calculate.avg();*/

        Member member = (Member) ctx.getBean("member");
        member.display();
    }
}
