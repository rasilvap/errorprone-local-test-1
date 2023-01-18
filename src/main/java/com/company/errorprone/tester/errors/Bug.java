package com.company.errorprone.tester.errors;

import java.util.Random;

public class Bug {

    public static boolean triggersArraysEquals() {
        String[] arr = {"error","prone", "2.18.0"};
        String[] arr2 = {"bug","patterns"};
        return arr.equals(arr2);
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
