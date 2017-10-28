package com.free.demo.stack;

/*
 *
 * 数组结构实现栈
 */
public class FakeStack<T> {

    private int capacity = 100;
    private float factor = 0.8f;
    private Object[] arr;
    private int curr;

    public FakeStack() {
        this(10, 0.8f);
    }

    public FakeStack(int capacity, float factor) {
        this.capacity = capacity;
        this.factor = factor;
        check();
        arr = new Object[capacity];
    }

    public void push(T o) {
        if (curr > capacity * factor) {
            //todo increase size
            throw new RuntimeException("reach border");
        }
        arr[curr] = o;
        curr += 1;
    }

    public Object pop() {
        curr -= 1;
        if (curr < 0) {
            curr = 0;
            return null;
        }
        return arr[curr];
    }

    public boolean isEmpty() {
        return curr == 0;
    }

    public int size() {
        return curr;
    }

    private void check() {
        if (capacity <= 0 || factor <= 0 || factor > 1) {
            throw new IllegalArgumentException();
        }
    }

}
