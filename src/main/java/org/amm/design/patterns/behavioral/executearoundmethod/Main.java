package org.amm.design.patterns.behavioral.executearoundmethod;

import java.util.function.Function;

public class Main {

    /*
     * similar to template method pattern but using functions
     */
    public static void doSomething (Function<Integer,Integer> function, Integer value){
        //do something here, always the same
        System.out.println("before...");
        //do something here which is changing everytime
        System.out.println("Meanwhile..." + function.apply(value));
        //do something here, always the same
        System.out.println("after...");
    }

    /*
     * similar to template method pattern but using functions
     */
    public static void doSomething (
            Function<Integer,Integer> functionBefore,
            Function<Integer,Integer> function,
            Function<Integer,Integer> functionAfter,
            Integer value){
        System.out.println(functionBefore.apply(value));
        System.out.println(function.apply(value));
        System.out.println(functionAfter.apply(value));
    }

    public static void main(String args[]){
        Function <Integer,Integer> doDouble = x -> 2 * x;
        Function <Integer,Integer> doTriple = x -> 3 * x;
        Function <Integer,Integer> doFourTimes = x -> 4 * x;
        doSomething(doDouble, 2);
        doSomething(doDouble, 3);
        doSomething(doDouble,doTriple,doFourTimes,5);
    }



}
