package org.xoxo.daimon;

public class Calculate implements ICalculate {
    @Override
    public void sum(int a, int b) {
        System.out.printf("SUM: %d%n", a + b);
    }

    @Override
    public void avg(int a, int b) {
        System.out.printf("AVG: %d%n", (a + b) / 2);
    }
}
