package io.github.wellingtoncosta.datastructures.stack;

public interface Stack<T> {

    boolean push(T value);

    T pop();

    T top();

    boolean isEmpty();

    boolean isFull();

}
