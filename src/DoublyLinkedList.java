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

        System.out.println();
        System.out.println("==== REMOVE AT BEGINNING ====");
        removeAtBeginningTest();

        System.out.println();
        System.out.println("==== LENGTH ====");
        length();
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

    public static void removeAtBeginningTest(){
        MyDoblyLinkedList<String> doublyLinkedList = new MyDoblyLinkedList<>();
        doublyLinkedList.add("Paulo");
        doublyLinkedList.add("Rafael");

        doublyLinkedList.removeAtBeginning();

        System.out.println(doublyLinkedList);
    }

    public static void length(){
        MyDoblyLinkedList<String> doublyLinkedList = new MyDoblyLinkedList<>();
        doublyLinkedList.add("Paulo");
        doublyLinkedList.add("Rafael");

        System.out.println(doublyLinkedList.length());

        doublyLinkedList.add("Camila");

        System.out.println(doublyLinkedList.length());
    }
}
