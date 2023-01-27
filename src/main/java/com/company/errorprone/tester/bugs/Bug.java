package com.company.errorprone.tester.bugs;

public class Bug {

    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000;

    public static void doesNotTriggerArrayEquals() {
        System.out.println("bugs/Bug.java");
    }

    public static void triggerLoopConditionChecker(){
        int i=0;
        while (i <= 100){
            System.out.println(i);
        }
    }
}
