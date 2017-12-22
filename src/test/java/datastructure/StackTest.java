package datastructure;

import datastructure.stack.IStack;
import datastructure.stack.Stack;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTest {

    @Test
    public void stackIsEmpty() {
        IStack<Integer> stack = new Stack<Integer>();
        assertEquals(stack.isEmpty(), true);
    }

    @Test
    public void stackIsNotEmpty() {
        IStack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        assertEquals(stack.isEmpty(), false);
    }

    @Test
    public void stackIsFull() {
        IStack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < 1024; i++) {
            stack.push(i);
        }

        assertEquals(stack.isFull(), true);
    }

    @Test
    public void stackIsNotFull() {
        IStack<Integer> stack = new Stack<Integer>();
        assertEquals(stack.isFull(), false);
    }

    @Test
    public void pushAnItemIntoStack() {
        IStack<Integer> stack = new Stack<Integer>();
        boolean isPushed = stack.push(1);
        assertEquals(isPushed, true);
    }

    @Test
    public void pushAnItemIntoFullStack() {
        IStack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < 1024; i++) {
            stack.push(i);
        }

        boolean isPushed = stack.push(1025);
        assertEquals(isPushed, false);
    }

    @Test
    public void popAnItemFromStack() {
        IStack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        Integer value = stack.pop();
        assertEquals(value, new Integer(1));
    }

    @Test
    public void popAnItemFromEmtpyStack() {
        IStack<Integer> stack = new Stack<Integer>();
        Integer value = stack.pop();
        assertEquals(value, null);
    }

}
