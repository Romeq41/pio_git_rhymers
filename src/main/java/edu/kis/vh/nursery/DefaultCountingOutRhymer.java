package edu.kis.vh.nursery;

/**
 * The DefaultCountingOutRhymer class represents a simple counter that can
 * store and manage integer values in a stack-like structure. It provides
 * methods to add, remove, and inspect the integers in the stack.
 */
public class DefaultCountingOutRhymer {

    private static final int SIZE = 12;
    private static final int EMPTY = -1;
    private static final int FULL = 11;
    private final int[] numbers = new int[SIZE];



    private int total = EMPTY;

    /**
     * Adds an integer to the stack if it is not full.
     *
     * @param in the integer to add to the stack
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise
     */
    public boolean callCheck() {
        return total == EMPTY;
    }

    /**
     * Checks if the stack is full.
     *
     * @return true if the stack is full, false otherwise
     */
    public boolean isFull() {
        return total == FULL;
    }

    /**
     * Peeks at the top integer in the stack without removing it.
     *
     * @return the top integer in the stack if it is not empty;
     *         EMPTY (-1) if the stack is empty
     */
    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    /**
     * Removes and returns the top integer from the stack.
     *
     * @return the top integer in the stack if it is not empty;
     *         EMPTY (-1) if the stack is empty
     */
    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

}
