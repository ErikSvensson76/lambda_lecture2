package org.example;

/*
    Represents a supplier of results. Type of results is specified with T. Takes no argument
    Used whenever you want to instantiate something, or getting something not caring how
 */

import org.example.model.Person;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        Supplier<Integer> integerSupplier = () -> ThreadLocalRandom.current().nextInt();
        Supplier<ArrayList<Integer>> arrayListSupplier = () -> new ArrayList<>();

        System.out.println(integerSupplier.get());
        List<Integer> integers = arrayListSupplier.get();

        List<Person> people = Arrays.asList(
                new Person("Ulf","Bengtsson", LocalDate.parse("1982-08-25")),
                new Person("Erik", "Svensson", LocalDate.parse("1976-09-11"))
        );
        Function<Person, String> function = person -> person.getFirstName() + " " + person.getLastName();
        Supplier<Collection<String>> supplier = () -> new HashSet<>();

        Collection<String> strings = foo(people, function, supplier);
        System.out.println(strings);
    }

    public  static <T,R> Collection<R> foo(List<T> list, Function<T, R> function, Supplier<Collection<R>> collectionSupplier){
        Collection<R> result = collectionSupplier.get();
        for(T t: list){
            result.add(function.apply(t));
        }
        return result;
    }

}
