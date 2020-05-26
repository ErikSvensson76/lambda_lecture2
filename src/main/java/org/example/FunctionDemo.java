package org.example;

/*
    Accepts one argument (T) and produces a result of type (R)
    Often used when we map a type to a new type (conversion)
    Abstract method: R apply(T t);
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        Function<String, Integer> stringLength = string -> string.length();
        List<String> strings = Arrays.asList(
                "Huiyi", "Patrik", "Michelle", "Martin", "Tobias", "Negar"
        );

        List<Integer> integers = stringsToIntegers(strings, stringLength);

        stringsToIntegers(strings, s -> s.hashCode()).forEach(integer -> System.out.println(integer));

    }

    public static List<Integer> stringsToIntegers(List<String> strings, Function<String, Integer> function){
        List<Integer> result = new ArrayList<>();
        for(String s : strings){
            result.add(function.apply(s));
        }
        return result;
    }

}
