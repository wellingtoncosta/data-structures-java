package datastructure.stack;

@SuppressWarnings("unchecked")
public class Stack<T> implements IStack<T> {

    private static int INITIAL_SIZE = 1024;

    private T[] array = (T[]) new Object[INITIAL_SIZE];
    private int size = 0;

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
