package io.github.wellingtoncosta.datastructures.stack;

import java.util.ArrayList;
import java.util.List;

public class DynamicStack<T> implements Stack<T> {

    private final List<T> list = new ArrayList<T>();

    public boolean push(T value) {
        list.add(value);
        return true;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        } else {
            return list.remove(list.size() - 1);
        }
    }

    public T top() {
        if (isEmpty()) {
            return null;
        } else {
            return list.get(list.size() - 1);
        }
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean isFull() {
        return false;
    }

}
