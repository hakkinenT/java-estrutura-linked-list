import data_structure.doubly_linked_list.cell.MyDoblyLinkedList;

public class DoublyLinkedList {
    public static void main(String[] args) {
        System.out.println("==== ADD AT THE BEGINNING ====");
        addAtBeginningTest();
    }

    public static void addAtBeginningTest(){
        MyDoblyLinkedList<String> doublyLinkedList = new MyDoblyLinkedList<>();
        doublyLinkedList.addAtBeginning("Paulo");
        doublyLinkedList.addAtBeginning("Rafael");

        System.out.println(doublyLinkedList);
    }
}
