package com.sda.springdemojavaee14.homework.annotation;

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
    }
}
