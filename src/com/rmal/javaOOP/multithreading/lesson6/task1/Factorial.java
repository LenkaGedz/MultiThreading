package com.rmal.javaOOP.multithreading.lesson6.task1;

/*1) Создайте сто потоков которые будут вычислять факториал
        числа равного номеру этого потока и выводить результат на
        экран.*/

import java.math.BigInteger;

class Factorial implements Runnable {
    private int number;

    public Factorial(int number) {
        this.number = number;
    }

    public Factorial() {
        super();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private BigInteger calculateFactorial(int number) {
        BigInteger result = new BigInteger("1");
        for (int i = 1; i <= number; i++) {
            result = result.multiply(new BigInteger("" + i));
        }
        return result;
    }

    @Override
    public void run() {
        Thread th = Thread.currentThread();
        th.setName("Thread № " + number);
        System.out.println(th.getName() + ":" + "!" + number + " = " + calculateFactorial(number));
    }
}
