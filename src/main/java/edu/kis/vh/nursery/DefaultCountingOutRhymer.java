package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int MAX_SIZE = 12;
    private static final int EMPTY_CHECK = -1;
    private static final int ARRAY_EMPTY_RETURN_VALUE = -1;

    private final int[] numbers = new int[MAX_SIZE];

    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_CHECK;
    }

    public boolean isFull() {
        return total == MAX_SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return ARRAY_EMPTY_RETURN_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ARRAY_EMPTY_RETURN_VALUE;
        return numbers[total--];
    }

}
