package org.xoxo.POJO;

import org.xoxo.daimon.ICalculate;

public class CalculateBean {
    private int num1;
    private int num2;
    private ICalculate calculate;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void sum() {
        calculate.sum(num1, num2);
    }

    public void avg() {
        calculate.avg(num1, num2);
    }

    public ICalculate getCalculate() {
        return calculate;
    }

    public void setCalculate(ICalculate calculate) {
        this.calculate = calculate;
    }
}
