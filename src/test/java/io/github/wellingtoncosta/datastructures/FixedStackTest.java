package io.github.wellingtoncosta.datastructures;

import io.github.wellingtoncosta.datastructures.stack.Stack;
import io.github.wellingtoncosta.datastructures.stack.FixedStack;
import org.junit.Test;

import static org.junit.Assert.*;

public class FixedStackTest {

    @Test public void stackIsEmpty() {
        Stack<Integer> stack = new FixedStack<Integer>(100);
        assertTrue(stack.isEmpty());
    }

    @Test public void stackIsNotEmpty() {
        Stack<Integer> stack = new FixedStack<Integer>(100);
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test public void stackIsFull() {
        Stack<Integer> stack = new FixedStack<Integer>(100);

        for (int i = 0; i < 100; i++) {
            stack.push(i);
        }

        assertTrue(stack.isFull());
    }

    @Test public void stackIsNotFull() {
        Stack<Integer> stack = new FixedStack<Integer>(100);
        assertFalse(stack.isFull());
    }

    @Test public void pushAnItemToStack() {
        Stack<Integer> stack = new FixedStack<Integer>(100);
        boolean isPushed = stack.push(1);
        assertTrue(isPushed);
    }

    @Test public void pushAnItemToFullStack() {
        Stack<Integer> stack = new FixedStack<Integer>(100);

        for (int i = 0; i < 100; i++) {
            stack.push(i);
        }

        boolean isPushed = stack.push(101);
        assertFalse(isPushed);
    }

    @Test public void popAnItemFromStack() {
        Stack<Integer> stack = new FixedStack<Integer>(100);
        stack.push(1);
        Integer value = stack.pop();
        assertEquals(value, new Integer(1));
    }

    @Test public void popAnItemFromEmptyStack() {
        Stack<Integer> stack = new FixedStack<Integer>(100);
        Integer value = stack.pop();
        assertNull(value);
    }

}
