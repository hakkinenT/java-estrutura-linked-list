import data_structure.doubly_linked_list.cell.MyDoblyLinkedList;

public class DoublyLinkedList {
    public static void main(String[] args) {
        System.out.println("==== ADD AT THE BEGINNING ====");
        addAtBeginningTest();

        System.out.println();
        System.out.println("==== ADD AT THE END ====");
        addAtEndTest();

        System.out.println();
        System.out.println("==== ADD BY POSITION ====");
        addByPositionTest();
    }

    public static void addAtBeginningTest(){
        MyDoblyLinkedList<String> doublyLinkedList = new MyDoblyLinkedList<>();
        doublyLinkedList.addAtBeginning("Paulo");
        doublyLinkedList.addAtBeginning("Rafael");

        System.out.println(doublyLinkedList);
    }

    public static void addAtEndTest(){
        MyDoblyLinkedList<String> doublyLinkedList = new MyDoblyLinkedList<>();
        doublyLinkedList.add("Paulo");
        doublyLinkedList.add("Rafael");
        doublyLinkedList.add("Camila");

        System.out.println(doublyLinkedList);
    }

    public static void addByPositionTest(){
        MyDoblyLinkedList<String> doublyLinkedList = new MyDoblyLinkedList<>();
        doublyLinkedList.add("Paulo");
        doublyLinkedList.add(0, "Rafael");
        doublyLinkedList.add(1, "Camila");

        System.out.println(doublyLinkedList);
    }
}
