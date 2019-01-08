package org.amm.design.functionalinterfaces.conversions;

import java.util.stream.Stream;

/**
 * define a functional interface and declare a method
 * create a method to receive the functional interface as parameter
 * call to the method passing the arguments and send a lambda block as value for the funcional interface.
 * This lambda block is the implementation of the method of the functional interface.
 * the point is the interface needs an implementation, so instead of create a implementation class
 * we are create a lambda block which is the implementation of the functional method and in this way
 * we can save creating implementation classes. We can inject the implementation every time we need it.
 */
public class Main {

    public static void main(String args[]){
        final String[] stringArray = {"hello", "world","friend"};
        final String[] transformed = transformArray( stringArray, (theString -> "-" + theString.toUpperCase() + "-" ));
        Stream.of(transformed).forEach(System.out::println);
    }

    public static String[] transformArray (String[] stringArray, StringToUpperCase function){
        return Stream.of(stringArray).map( theString -> {
            System.out.println(theString);
            return function.toUpperCase(theString);
        }).toArray(String[]::new);
    }
}
