package com.promineotech;

public class TestDemo {
    public int addPositive(int a, int b) {
        if (a > 0 && b > 0) {
            return a + b;
        } else {
            throw new IllegalArgumentException("Both parameters must be positive!");
        }
    }

    int getRandomInt() {
        java.util.Random random = new java.util.Random();
        return random.nextInt(10) + 1;
    }

    public int randomNumberSquared() {
        int randomNum = getRandomInt();
        return randomNum * randomNum;
    }
}
