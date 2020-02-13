package io.github.wellingtoncosta.datastructures.stack;

public interface Stack<T> {

    boolean push(T value);

    T pop();

    T get(int index);

    T top();

    boolean isEmpty();

    boolean isFull();

}
