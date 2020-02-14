package io.github.wellingtoncosta.datastructures;

import io.github.wellingtoncosta.datastructures.stack.DynamicStack;
import io.github.wellingtoncosta.datastructures.stack.Stack;
import org.junit.Test;

import static org.junit.Assert.*;

public class DynamicStackTest {

    @Test public void stackIsEmpty() {
        Stack<Integer> stack = new DynamicStack<Integer>();
        assertTrue(stack.isEmpty());
    }

    @Test public void stackIsNotEmpty() {
        Stack<Integer> stack = new DynamicStack<Integer>();
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test public void stackIsNotFull() {
        Stack<Integer> stack = new DynamicStack<Integer>();

        for (int i = 0; i < 1024; i++) {
            stack.push(i);
        }

        assertFalse(stack.isFull());
    }

    @Test public void pushAnItemToStack() {
        Stack<Integer> stack = new DynamicStack<Integer>();
        boolean isPushed = stack.push(1);
        assertTrue(isPushed);
    }

    @Test public void popAnItemFromStack() {
        Stack<Integer> stack = new DynamicStack<Integer>();
        stack.push(1);
        Integer value = stack.pop();
        assertEquals(value, new Integer(1));
    }

    @Test public void popAnItemFromEmptyStack() {
        Stack<Integer> stack = new DynamicStack<Integer>();
        Integer value = stack.pop();
        assertNull(value);
    }

    @Test public void getTopElementOfAnEmptyStack() {
        Stack<Integer> stack = new DynamicStack<Integer>();
        Integer value = stack.top();
        assertNull(value);
    }

    @Test public void getTopElementOfNonEmptyStack() {
        Stack<Integer> stack = new DynamicStack<Integer>();
        Integer top = 10;
        stack.push(top * 3);
        stack.push(top * 2);
        stack.push(top);
        Integer value = stack.top();
        assertEquals(top, value);
    }

}
