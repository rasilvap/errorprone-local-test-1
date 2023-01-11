package com.company.errorprone.tester;

public class ErrorProneTest {
    public static void main(String[] args) {
        var stringArray = triggerAvoidObjectArrays();

    }

    public static String[] triggerAvoidObjectArrays() {
        return new String[]{"this","is","a","object","array"};
    }

    public static void triggerMathAbsoluteNegative() {
        int veryNegative = Math.abs(Integer.MIN_VALUE);
        long veryNegativeLong = Math.abs(Long.MIN_VALUE);
    }
}
