package edu.kis.vh.nursery.list;

/**
 * Klasa Node reprezentuje pojedynczy węzeł listy dwukierunkowej.
 * Jest wykorzystywana w strukturach danych implementujących listy dwukierunkowe,
 * gdzie każdy węzeł przechowuje referencje do sąsiednich elementów:
 * poprzedniego ('prev') oraz następnego ('next').
 * Węzeł zawiera niezmienną wartość (`value`), która jest przypisywana w momencie
 * tworzenia obiektu i nie może być później modyfikowana.
 */
public class Node {

    private final int value;
    private Node prev;
    private Node next;

    /**
     * Tworzy nowy węzeł i nadaje mu określoną wartość.
     * Domyślnie nie jest połączony z żadnym innym węzłem.
     *
     * @param i wartość, która ma zostać przypisana do węzła.
     */
    public Node(int i) {
        value = i;
    }

    /**
     * Zwraca wartość przechowywaną w tym węźle.
     *
     * @return wartość węzła.
     */
    public int getValue() {
        return value;
    }

    /**
     * Zwraca referencję do następnego węzła w liście.
     *
     * @return następny węzeł lub 'null', jeżeli jest to ostatni element listy.
     */
    public Node getNext() {
        return next;
    }

    /**
     * Ustawia referencję do następnego węzła w liście.
     *
     * @param next następny węzeł w liście.
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * Zwraca referencję do poprzedniego węzła w liście.
     *
     * @return poprzedni węzeł lub 'null', jeżeli jest to pierwszy element listy.
     */
    public Node getPrev() {
        return prev;
    }

    /**
     * Ustawia referencję do poprzedniego węzła w liście.
     *
     * @param prev poprzedni węzeł w liście.
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
