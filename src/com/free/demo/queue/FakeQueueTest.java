package com.free.demo.queue;

import com.free.demo.entity.Person;
import com.free.demo.stack.FakeStack;

public class FakeQueueTest {

    public static void main(String[] args) {

        FakeQueue<Person> fakeQueue = new FakeQueue<>();

        for(int i = 1; i <= 5; i++) {
            Person p = new Person(i+"", i);
            fakeQueue.addTail(p);
        }

        int size = fakeQueue.size();
        for (int i = 0; i < size; i++) {
            try {
                System.out.println(fakeQueue.getHead());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("end");
    }

}
