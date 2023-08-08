package dataStructure.linkedList;

public class LinkedListProgram {
    public static void main(String[] args) {

        System.out.println("==== ADD AT THE END ====");
        addAtEndTest();

        System.out.println();
        System.out.println("==== ADD BY POSITION ====");
        addByPositionTest();

        System.out.println();
        System.out.println("==== GET BY POSITION ====");
        getByPositionTest();

        System.out.println();
        System.out.println("==== REMOVE BY POSITION ====");
        removeByPositionTest();

        System.out.println();
        System.out.println("==== LENGTH ====");
        lengthTest();

        System.out.println();
        System.out.println("==== CONTAINS ====");
        containsTest();

        System.out.println();
        System.out.println("==== ADD AT THE BEGINNING ====");
        addAtBeginningTest();

        System.out.println();
        System.out.println("==== REMOVE AT THE BEGINNING ====");
        removeAtBeginningTest();

        System.out.println();
        System.out.println("==== REMOVE AT THE END ====");
        removeAtEndTest();
    }

    public static void addAtEndTest(){
        MyLinkedList<String> linkedList = new MyLinkedList<String>();
        linkedList.add("Rafael");
        linkedList.add("Paulo");

        System.out.println(linkedList);
    }

    public static void addByPositionTest(){
        MyLinkedList<String> linkedList = new MyLinkedList<String>();
        linkedList.add("Rafael");
        linkedList.add(0,"Paulo");
        linkedList.add(1,"Camila");

        System.out.println(linkedList);
    }

    public static void getByPositionTest(){
        MyLinkedList<String> linkedList = new MyLinkedList<String>();
        linkedList.add("Rafael");
        linkedList.add("Paulo");

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
    }

    public static void removeByPositionTest(){
        MyLinkedList<String> linkedList = new MyLinkedList<String>();
        linkedList.add("Rafael");
        linkedList.add("Paulo");
        linkedList.add("Camila");

        linkedList.remove(1);

        System.out.println(linkedList);
    }

    public static void lengthTest(){
        MyLinkedList<String> linkedList = new MyLinkedList<String>();
        linkedList.add("Rafael");
        linkedList.add("Paulo");

        System.out.println(linkedList.length());

        linkedList.add("Camila");

        System.out.println(linkedList.length());
    }

    public static void containsTest(){
        MyLinkedList<String> linkedList = new MyLinkedList<String>();
        linkedList.add("Rafael");
        linkedList.add("Paulo");

        System.out.println(linkedList.contains("Rafael"));
        System.out.println(linkedList.contains("Camila"));
    }

    public static void addAtBeginningTest(){
        MyLinkedList<String> linkedList = new MyLinkedList<String>();
        linkedList.addAtBeginning("Rafael");
        linkedList.addAtBeginning("Paulo");

        System.out.println(linkedList);
    }

    public static void removeAtBeginningTest(){
        MyLinkedList<String> linkedList = new MyLinkedList<String>();
        linkedList.add("Rafael");
        linkedList.add("Paulo");

        linkedList.removeAtBeginning();

        System.out.println(linkedList);
    }

    public static void removeAtEndTest(){
        MyLinkedList<String> linkedList = new MyLinkedList<String>();
        linkedList.add("Rafael");
        linkedList.add("Paulo");

        linkedList.removeAtEnd();

        System.out.println(linkedList);
    }
}