package dataStructure.doublyLinkedList.cell;

public class Cell<T>{
    private Cell<T> previous;
    private Cell<T> next;
    private T element;

    public Cell(Cell<T> next, T element) {
        this.next = next;
        this.element = element;
    }

    public Cell(Cell<T> previous, Cell<T> next, T element) {
        this.previous = previous;
        this.next = next;
        this.element = element;
    }

    public Cell(T element) {
        this.element = element;
    }

    public void setNext(Cell<T> next) {
        this.next = next;
    }

    public Cell<T> getNext() {
        return next;
    }

    public Cell<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Cell<T> previous) {
        this.previous = previous;
    }

    public T getElement() {
        return element;
    }
}
