package data_structure.doubly_linked_list.cell;

public class MyDoblyLinkedList<T> {
    private Cell<T> first;
    private Cell<T> last;

    private int totalElement;

    public void add(T element){
        if(this.totalElement == 0){
            addAtBeginning(element);
        }else{
            Cell<T> newCell = new Cell<>(element);
            this.last.setNext(newCell);
            newCell.setPrevious(this.last);
            this.last = newCell;
            this.totalElement++;
        }


    }

    public void add(int position, T element){

    }

    public void addAtBeginning(T element){
        Cell<T> newCell;

        if(this.totalElement == 0){
            newCell = new Cell<>(element);
            this.first = newCell;
            this.last = newCell;
        }else{
            newCell = new Cell<>(this.first, element);
            this.first.setPrevious(newCell);
            this.first = newCell;
        }

        this.totalElement++;
    }

    private Cell<T> getCell(int position){
        if(!occupiedPosition(position)){
            throw new IllegalArgumentException("Posição não existe");
        }

        Cell<T> actual = first;

        for (int i = 0; i < position; i++) {
            actual = actual.getNext();
        }

        return actual;
    }

    private boolean occupiedPosition(int position){
        return position >= 0 && position < this.totalElement;
    }

    public T get(int position){
        return null;
    }

    public int length(){return 0;}

    public boolean contains(T element){return false;}

    public void remove(int position){}

    public void removeAtBeginning(){}

    public void removeAtEnd(){}

    @Override
    public String toString() {
        if(this.totalElement == 0){
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        Cell<T> actual = first;

        for (int i = 0; i < this.totalElement - 1; i++) {
            builder.append(actual.getElement());
            builder.append(", ");
            actual = actual.getNext();
        }

        builder.append(actual.getElement());
        builder.append("]");
        return builder.toString();
    }
}
