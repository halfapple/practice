package com.free.demo.stack;

import com.free.demo.entity.Person;

public class FakeStackIntegerTest {

    public static void main(String[] args) {

        FakeStack<Integer> personFakeStack = new FakeStack<>();

        for(int i = 1; i <= 5; i++) {
            personFakeStack.push(i);
        }

        int size = personFakeStack.size();
        for(int i = 0; i < size; i++) {

            System.out.println(personFakeStack.pop());
        }

        System.out.println("end");
    }

}
