package data_structure.linked_list.cell;

public class Cell<T>{
    private Cell<T> next;
    private T element;

    public Cell(Cell<T> next, T element) {
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

    public T getElement() {
        return element;
    }
}
