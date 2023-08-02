package data_structure.linked_list.cell;

public class Cell<T>{
    private Cell next;
    private T element;

    public Cell(Cell next, T element) {
        this.next = next;
        this.element = element;
    }

    public Cell(T element) {
        this.element = element;
    }

    public void setNext(Cell next) {
        this.next = next;
    }

    public Cell getNext() {
        return next;
    }

    public T getElement() {
        return element;
    }
}
