package org.example;

import org.example.model.Person;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
    Takes any object and return nothing (void)
    When used: when you need to do void things. Often used in logging
    Abstract method: void accept(T t);
 */

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> print = string -> System.out.println(string);
        Consumer<Person> printPerson = person -> System.out.println(person);

        List<Person> people = Arrays.asList(
                new Person("Ulf","Bengtsson", LocalDate.parse("1982-08-25")),
                new Person("Erik", "Svensson", LocalDate.parse("1976-09-11"))
        );

        print.accept("Hello String consumer");


        people.forEach(person -> person.setFirstName("Ulf"));
        people.forEach(printPerson);


    }
}
