package ch07_LinkedList;

public class Main {
    public static void main(String[] args) {
//        Node<Integer> node1 = new Node<Integer>(1);
//        Node<Integer> node2 = new Node<Integer>(2);
//
//        node1.next = node2;
//        Node head = node1;
//
//        SingleLinkedList<Integer> MyLinkedList = new SingleLinkedList<>();
//        MyLinkedList.addNode(1);
//        MyLinkedList.addNode(2);
//        MyLinkedList.addNode(3);
//
//        MyLinkedList.printAll();
//
//        MyLinkedList.addNodeInside(5, 1);
//        MyLinkedList.printAll();
//
//        MyLinkedList.addNodeInside(6, 3);
//        MyLinkedList.printAll();
//
//        MyLinkedList.addNodeInside(7, 20);
//        MyLinkedList.printAll();
//
//        MyLinkedList.delNode(3);
//        MyLinkedList.printAll();
//
//        MyLinkedList.delNode(1);
//        MyLinkedList.printAll();
//
//        MyLinkedList.delNode(7);
//        MyLinkedList.printAll();
//        System.out.println();

        // DoubleLinkedList
        DoubleLinkedList<Integer> MyLinkedList2 = new DoubleLinkedList<>();
        MyLinkedList2.addNode(1);
        MyLinkedList2.addNode(2);
        MyLinkedList2.addNode(3);
        MyLinkedList2.addNode(4);
        MyLinkedList2.addNode(5);
        MyLinkedList2.printAll();

        MyLinkedList2.insertNode(3, 2);
        MyLinkedList2.printAll();

        MyLinkedList2.insertNode(6, 2);
        MyLinkedList2.insertNode(1, 0);
        MyLinkedList2.printAll();

        MyLinkedList2.addNode(6);
        MyLinkedList2.printAll();

    }
}
