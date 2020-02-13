package io.github.wellingtoncosta.datastructures.stack;

@SuppressWarnings("unchecked")
public class FixedStack<T> implements Stack<T> {

    private final T[] array;
    private int size = 0;

    public FixedStack(int size) {
        array = (T[]) new Object[size];
    }

    public boolean push(T value) {
        if (isFull()) {
            return false;
        }

        array[size++] = value;
        return true;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }

        return array[--size];
    }

    public T get(int index) {
        if (size == 0) {
            return null;
        }

        return array[index];
    }

    public T top() {
        return array[size-1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == array.length;
    }
}
