package datastructure.stack;

public interface IStack<T> {

    boolean push(T value);

    T pop();

    T get(int index);

    T top();

    boolean isEmpty();

    boolean isFull();

}
