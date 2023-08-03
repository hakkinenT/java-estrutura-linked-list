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
        if(!occupiedPosition(position)){
            throw new IllegalArgumentException("Posição não encontrada.");
        }

        if(position == 0){
            addAtBeginning(element);
        }else if(position == this.totalElement){
            add(element);
        }else{
            Cell<T> prevCell = getCell(position - 1);
            Cell<T> nextCell = prevCell.getNext();

            Cell<T> newCell = new Cell<>(prevCell.getNext(),element);

            newCell.setPrevious(prevCell);

            prevCell.setNext(newCell);
            nextCell.setPrevious(newCell);

            this.totalElement++;
        }
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
        return getCell(position).getElement();
    }

    public int length(){return this.totalElement;}

    public boolean contains(T element){
        Cell<T> actual = this.first;

        while (actual != null){
            if(actual.getElement().equals(element)){
                return true;
            }

            actual = actual.getNext();
        }
        return false;
    }

    public void remove(int position){
        if(!occupiedPosition(0)){
            throw new IllegalArgumentException("Posição não existe");
        }

        if(position == 0){
            removeAtBeginning();
        }else if(position == this.totalElement - 1){
            removeAtEnd();
        }else{
            Cell<T> prevCell = getCell(position - 1);
            Cell<T> actualCell = prevCell.getNext();
            Cell<T> nextCell = actualCell.getNext();

            prevCell.setNext(nextCell);
            nextCell.setPrevious(prevCell);

            this.totalElement--;
        }
    }

    public void removeAtBeginning(){
        if(!occupiedPosition(0)){
            throw new IllegalArgumentException("Posição não existe");
        }

        this.first = this.first.getNext();
        this.totalElement--;

        if(this.totalElement == 0){
            this.last = null;
        }
    }

    public void removeAtEnd(){
        if(!occupiedPosition(this.totalElement - 1)){
            throw new IllegalArgumentException("Posição não existe.");
        }

        if(this.totalElement == 1){
            removeAtBeginning();
        }else{
            Cell<T> lastButOne = this.last.getPrevious();
            lastButOne.setNext(null);
            this.last = lastButOne;
            this.totalElement--;
        }
    }

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
