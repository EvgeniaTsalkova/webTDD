package com.example.webtdd.beans;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FunctionClass {
    private double a;
    private double b;
    private double c;
    private final double start = 0.0;
    private final double end = 2.0;
    private final double step = 0.002;
    private final double EPS = 1e-6;

    public FunctionClass(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

//    private void run() {
//        double[] arrayX = fillX();
//        double[] arrayY = fillY(arrayX);

//        printMaxValueAndIndex(arrayY);
//        printMinValueAndIndex(arrayY);
//        System.out.println("Sum of values: " + calcSum(arrayY));
//        System.out.println("Average: " + calcAvg(arrayY));
//    }

    // function №3
    public double calcFunction(double x) {
        if (x < 1.4 - EPS) {
            return  a * x * x + b * x + c;
        }
        if (x > 1.4 + EPS) {
            return  a / x + Math.sqrt(x * x + 1);
        }
        return (a + b * x) / Math.sqrt(x * x + 1);
    }

    public double calcSteps() {
        return Math.round((end - start) / step) + 1;
    }

    public double[] getFillX() {
        int n = (int) calcSteps();

        return IntStream.range(0, n).mapToDouble(i -> start + i * step).toArray();
    }

    public double[] getFillY(double[] arrayX) {
        return Arrays.stream(arrayX).map(this::calcFunction).toArray();
    }

    public double getMax(double[] array) {
        return Arrays.stream(array).max().getAsDouble();
    }

    public double getMin(double[] array) {
        return Arrays.stream(array).min().getAsDouble();
    }

    public double getSum(double[] array) {
        return Arrays.stream(array).sum();
    }

    public double getAvg(double[] array) {
        return Arrays.stream(array).average().getAsDouble();
    }

    public int getIndex(double[] array, double value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return i;
        }
        return -1;
    }

    public String getMaxValueAndIndex(double[] array) {
        double max = getMax(array);
        int index = getIndex(array, max);

        return "Max value: " + max + ", index: " + index;
    }

    public String getMinValueAndIndex(double[] array) {
        double min = getMin(array);
        int index = getIndex(array, min);

        return "Min value: " + min + ", index: " + index;
    }
}
