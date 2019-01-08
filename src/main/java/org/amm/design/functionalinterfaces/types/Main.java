package org.amm.design.functionalinterfaces.types;

import java.util.function.*;

/**
 * https://www.baeldung.com/java-8-functional-interfaces
 */
public class Main {

    public static void main(String args[]){
        Main mainApp = new Main();
        mainApp.functionCase();
        mainApp.bifunctionCase();
        mainApp.supplierCase();
        mainApp.consumerCase();
        mainApp.predicatesCase();
        mainApp.operatorsCase();
    }

    /**
     * To define lambdas with one arguments,
     * we have to use additional interfaces that contain “Bi” keyword
     * in their names: Function, ToDoubleFunction, ToIntFunction, and ToLongFunction.
     */
    public void functionCase () {
        System.out.println("functionCase");
        final Function<Integer, String> intToString = Object::toString;
        final Function<String, String> quoteString = (string -> String.format("'%s'",string));
        final String s1 = intToString.apply(50);
        System.out.println(s1);
        final String s2 = quoteString.compose(intToString).apply(60);
        System.out.println(s2);
    }

    /**
     * To define lambdas with two arguments,
     * we have to use additional interfaces that contain “Bi” keyword
     * in their names: BiFunction, ToDoubleBiFunction, ToIntBiFunction, and ToLongBiFunction.
     */
    public void bifunctionCase () {
        System.out.println("bifunctionCase");
        final BiFunction<Integer, Integer, Integer> intToString = ( (x, y) -> x + y );
        final BiFunction<Integer, String, String> quoteString = ((x, y) -> String.format("'%d - %s'",x,y));
        final Integer i1 = intToString.apply(50, 50);
        System.out.println(i1);
        final String s2 = quoteString.apply(25, "th of December");
        System.out.println(s2);
    }

    /**
     * The Supplier functional interface is yet another Function specialization that does not take any arguments. It is typically used for lazy generation of values
     */
    public void supplierCase(){
        System.out.println("supplierCase");
        final Supplier<Integer> givemeFive = () -> 5;
        System.out.println(givemeFive.get());
    }

    /**
     * As opposed to the Supplier, the Consumer accepts a generified argument and returns nothing. It is a function that is representing side effects.
     */
    public void consumerCase(){
        System.out.println("consumerCase");
        final Consumer<String> writeToConsole = System.out::println;
        writeToConsole.accept("write this to console");
    }

    /**
     * In mathematical logic, a predicate is a function that receives a value and returns a boolean value.
     */
    public void predicatesCase(){
        System.out.println("predicatesCase");
        final Predicate<String> isNotNull = string -> string!=null && string.length() > 0;
        final Predicate<String> isLenghtLess50 = string -> string.length() < 50;
        final String theWord = "thisWordIsNotNullAndLessOf50chars";
        boolean isValidated = isNotNull.and(isLenghtLess50).test("thisWordIsNotNullAndLessOf50chars");
        System.out.println(String.format("the word %s is not null and length < 50 ? %s",theWord, isValidated));
    }

    /**
     * Operator interfaces are special cases of a function that receive and return the same value type
     */
    public void operatorsCase(){
        System.out.println("operatorsCase");
        final UnaryOperator<String> operator = String::toUpperCase;
        final UnaryOperator<String> addSingleQuotes = string -> String.format("'%s'",string);
        final String theWord = "helloWorld in uppercase";
        System.out.println(String.format("%s",operator.apply(theWord)));
        System.out.println(String.format("%s",operator.compose(addSingleQuotes).andThen(addSingleQuotes).apply(theWord)));
    }
}
