package com.company.errorprone.tester;

import java.util.Arrays;
import java.util.Random;

public class ErrorProneTest {
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000;
    public static void main(String[] args) {
        String[] stringArray = triggerAvoidObjectArrays();
        triggerMathAbsoluteNegative();
        String[] thisArr = new String[]{"this"};
        thisArr.equals(new String[]{"that"});
        System.out.println(Arrays.toString(stringArray));
    }

    public static String[] triggerAvoidObjectArrays() {
        return new String[]{"this","is","a","object","array"};
    }

    public static void triggerMathAbsoluteNegative() {
        int veryNegative = Math.abs(Integer.MIN_VALUE);
        long veryNegativeLong = Math.abs(Long.MIN_VALUE);
        System.out.println(veryNegative);
        System.out.println(veryNegativeLong);
        Random random = new Random();
        Math.abs(random.nextInt());
    }
}
