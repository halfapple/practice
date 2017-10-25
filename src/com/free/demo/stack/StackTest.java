package com.free.demo.stack;

import com.free.demo.entity.Person;

public class StackTest {

    public static void main(String[] args) {

        FakeStack<Person> personFakeStack = new FakeStack<>();

        for(int i = 1; i <= 5; i++) {
            Person p = new Person(i+"", i);
            personFakeStack.push(p);
        }

        int size = personFakeStack.size();
        for(int i = 0; i < size; i++) {

            System.out.println(personFakeStack.pop());
        }

        System.out.println("end");
    }

}
