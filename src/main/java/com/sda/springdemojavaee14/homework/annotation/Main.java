package com.sda.springdemojavaee14.homework.annotation;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        PersonWithAllSourceCode me = new PersonWithAllSourceCode();
        me.setName("Peeter");
        me.setSurname("Vii");
        me.setAge(29);

        System.out.println("me:" + me.toString());

        PersonWithAllSourceCode anotherMe = new PersonWithAllSourceCode("Peeter", "Vii", 29);

        System.out.println("Another me:" + anotherMe);

        System.out.println("Are those two references the same object?: " + (me == anotherMe));
        System.out.println("Is this the same person? - " + me.equals(anotherMe));

        Person meAgain = new Person("Peeter", "Vii", 29);
        // Builder is better than allArgsConstructor - because you can see more
        Person meAgainWithBuilder = Person.builder()
                .age(29)
                .surname("Vii")
                .name("Peeter")
                .build();

        //Set doesn't store duplicates
        Set<PersonWithAllSourceCode> uniquePersons = new HashSet<>();
        uniquePersons.add(me);
        uniquePersons.add(anotherMe);
        System.out.println("Set size after adding two equeal Persons: " + uniquePersons.size());
    }
}
