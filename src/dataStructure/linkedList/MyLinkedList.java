package dataStructure.linkedList;

import dataStructure.linkedList.cell.Cell;

public class MyLinkedList<T> {
    private Cell<T> first;
    private Cell<T> last;

    private int totalElement;

    public void add(T element){
        if(this.totalElement == 0){
            addAtBeginning(element);
        }else{
            Cell<T> newCell = new Cell<T>(element);
            this.last.setNext(newCell);
            this.last = newCell;
            this.totalElement++;
        }
    }

    public void add(int position, T element){
        if (position == 0){
            addAtBeginning(element);
        }else if(position == this.totalElement){
            add(element);
        }else {
            Cell<T> previous = getCell(position - 1);
            Cell<T> newCell = new Cell<>(previous.getNext(), element);
            previous.setNext(newCell);
            this.totalElement++;
        }
    }

    private Cell<T> getCell(int position){
        if (!occupiedPosition(position)){
            throw new IllegalArgumentException("Posição não existe.");
        }

        Cell<T> actual = first;
        for(int i = 0; i < position; i++){
            actual = actual.getNext();
        }

        return actual;
    }

    private boolean occupiedPosition(int position){
        return position >= 0 && position < this.totalElement;
    }

    public void addAtBeginning(T element){
        Cell<T> newCell = new Cell<>(this.first, element);
        this.first = newCell;

        if(this.totalElement == 0){
            this.last = this.first;
        }

        this.totalElement++;
    }

    public T get(int position){
        return getCell(position).getElement();
    }

    public void remove(int position){
        if (!occupiedPosition(position)){
            throw new IllegalArgumentException("Posição não existe.");
        }

        if (position == 0){
            removeAtBeginning();
        }else if(position == this.totalElement-1){
            removeAtEnd();
        }else {
            Cell<T> previous = getCell(position - 1);
            Cell<T> actual = previous.getNext();
            Cell<T> next = actual.getNext();


            previous.setNext(next);
            previous = next;

            actual = null;
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
        if (!occupiedPosition(totalElement - 1)){
            throw new IllegalArgumentException("Posição não existe.");
        }

        if(totalElement == 1){
            removeAtBeginning();
        }else{
            Cell<T> lastButOne = getCell(totalElement - 2);
            this.last.setNext(lastButOne);
            this.last = lastButOne;

            lastButOne.setNext(null);

        }
        totalElement--;
    }

    public int length(){
        return totalElement;
    }

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
