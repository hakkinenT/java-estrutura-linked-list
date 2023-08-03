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
        lengthTest();

        System.out.println();
        System.out.println("==== GET ====");
        getTest();

        System.out.println();
        System.out.println("==== CONTAINS ====");
        containsTest();

        System.out.println();
        System.out.println("==== REMOVE AT END ====");
        removeAtEndTest();

        System.out.println();
        System.out.println("==== REMOVE BY POSITION ====");
        removeByPositionTest();
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

    public static void lengthTest(){
        MyDoblyLinkedList<String> doublyLinkedList = new MyDoblyLinkedList<>();
        doublyLinkedList.add("Paulo");
        doublyLinkedList.add("Rafael");

        System.out.println(doublyLinkedList.length());

        doublyLinkedList.add("Camila");

        System.out.println(doublyLinkedList.length());
    }

    public static void getTest(){
        MyDoblyLinkedList<String> doublyLinkedList = new MyDoblyLinkedList<>();
        doublyLinkedList.add("Paulo");
        doublyLinkedList.add("Rafael");

        System.out.println(doublyLinkedList.get(0));
    }

    public static void containsTest(){
        MyDoblyLinkedList<String> doublyLinkedList = new MyDoblyLinkedList<>();
        doublyLinkedList.add("Paulo");
        doublyLinkedList.add("Rafael");

        System.out.println(doublyLinkedList.contains("Paulo"));
        System.out.println(doublyLinkedList.contains("Camila"));
    }

    public static void removeAtEndTest(){
        MyDoblyLinkedList<String> doublyLinkedList = new MyDoblyLinkedList<>();
        doublyLinkedList.add("Paulo");
        doublyLinkedList.add("Rafael");
        doublyLinkedList.add("Camila");

        doublyLinkedList.removeAtEnd();

        System.out.println(doublyLinkedList);
    }

    public static void removeByPositionTest(){
        MyDoblyLinkedList<String> doublyLinkedList = new MyDoblyLinkedList<>();
        doublyLinkedList.add("Paulo");
        doublyLinkedList.add("Rafael");
        doublyLinkedList.add("Camila");

        doublyLinkedList.remove(1);

        System.out.println(doublyLinkedList);
    }
}
