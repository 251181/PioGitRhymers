package edu.kis.vh.nursery.list;

// TODO: Klasa IntLinkedList nie jest obecnie używana.
//  Należy rozważyć jej usunięcie lub integrację z istniejącym kodem.
public class IntLinkedList {
    private static final int ARRAY_EMPTY_RETURN_VALUE = -1;

    private Node last;
    private int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    // TODO: Funkcja isFull zawsze zwraca false.
    //  W przyszłych aktualizacjach programu należy dodać logikę poprawnie sprawdzającą pełność listy.
    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return ARRAY_EMPTY_RETURN_VALUE;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return ARRAY_EMPTY_RETURN_VALUE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
