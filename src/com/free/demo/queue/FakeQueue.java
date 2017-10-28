package com.free.demo.queue;

import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

/*
 * 两个栈实现队列
 */
class FakeQueue<T> {

    private AtomicInteger count = new AtomicInteger();
    private Stack<T> stack1 = new Stack<>();
    private Stack<T> stack2 = new Stack<>();

    public void addTail(T t) {
        stack1.add(t);
        count.incrementAndGet();
    }

    public T getHead() throws Exception {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.add(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            throw new RuntimeException("no more data");
        }

        count.decrementAndGet();
        return stack2.pop();
    }

    public int size() {
        return count.get();
    }
}
