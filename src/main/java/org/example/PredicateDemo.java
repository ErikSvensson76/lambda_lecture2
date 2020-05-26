package org.example;

import org.example.model.Person;

import java.time.LocalDate;
import java.util.function.Predicate;

public class PredicateDemo {

    /*
        Takes any object as argument and returns a boolean.
        Use cases: If statements, filtering Collections and Streams
        Abstract method: boolean test(T t);
     */

    public static void main(String[] args) {
        Predicate<Integer> positiveInteger = integer -> integer > 0;
        Predicate<Person> bornInALeapYear = person -> person.getBirthDate().isLeapYear();

        boolean test = positiveInteger.test(-1);
        System.out.println(test);

        Person p = new Person("Erik", "Svensson", LocalDate.of(1976,9,11));

        System.out.println(bornInALeapYear.test(p));

    }

}
