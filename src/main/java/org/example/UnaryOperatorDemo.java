package org.example;

/*
    UnaryOperator<T> extends Function<T,R>
    Works as Function but return type is same as argument (T)
    Abstract method inherits from Function<T,R>
 */

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

    public static void main(String[] args) {
        UnaryOperator<String> stringUnaryOperator = s -> s.toUpperCase();

        //System.out.println(stringUnaryOperator.apply("hello"));

        System.out.println(foo(stringUnaryOperator, "hello"));

    }

    public static String foo(Function<String, String> function, String s){
        return function.apply(s);
    }

}
