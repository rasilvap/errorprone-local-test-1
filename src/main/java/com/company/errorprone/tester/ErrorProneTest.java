package com.company.errorprone.tester;

import java.util.Random;

public class ErrorProneTest {
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000;
    public static void main(String[] args) {
        triggerArrayEquals();
        triggerAvoidObjectArrays();
        triggerMathAbsoluteNegative();
    }

    public static void triggerArrayEquals() {
        String[] thisArr = new String[]{"this"};
        thisArr.equals(new String[]{"that"});
    }

    public static String[] triggerAvoidObjectArrays() {
        return new String[]{"this","is","a","object","array"};
    }

    public static void triggerMathAbsoluteNegative() {
        Random random = new Random();
        Math.abs(random.nextInt());
    }
}
