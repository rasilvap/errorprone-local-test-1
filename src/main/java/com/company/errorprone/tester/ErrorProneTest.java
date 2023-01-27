package com.company.errorprone.tester;

import com.company.errorprone.tester.bugs.Bug;

public class ErrorProneTest {

    public static void main(String[] args) {
        System.out.println(com.company.errorprone.tester.errors.Bug.triggersArraysEquals());
        Bug.doesNotTriggerArrayEquals();
        com.company.errorprone.tester.errors.Bug.triggerMathAbsoluteNegative();
        Bug.triggerLoopConditionChecker();
    }
}
